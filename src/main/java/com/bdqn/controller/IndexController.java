package com.bdqn.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * @author mo
 * @Description: 首页控制器
 * @date 2020-05-29 18:24
 */
@Controller
//@RequestMapping(value = "/index")
public class IndexController {
    private Logger logger = LogManager.getLogger(IndexController.class);

    @RequestMapping(value = "/test")
    public String index(@RequestParam(value = "user_name") String username,
                        String password, Model model) {
        logger.info("进入控制器，用户名：{}；密码：{}", username, password);
        model.addAttribute("username", username);
        //指定需要跳转的页面
        return "index";
    }

    @RequestMapping(value = "/ajax")
    @ResponseBody
    public String testAjax(@RequestParam(value = "user_name") String username) {
        logger.info("通过ajax进入控制器，用户名：{}", username);
        return "欢迎来到Ajax";
    }


    @RequestMapping(value = "/test1")
    public String index1() {
        logger.info("进入控制器");
        //指定需要跳转的页面
        return "index";
    }

    /**
     * 文件上传接口
     * @param attach
     * @return
     */
    @RequestMapping(value = "/fileupload.do",produces = "application/json;charset=utf8")
    @ResponseBody
    public String fileUpload(@RequestParam(value = "upload_file", required = false) MultipartFile attach,
                             HttpServletRequest request) {
        //判断当前文件是否为空
        if (!attach.isEmpty()) {
            //需要指定文件上传的路径
            String fileupload = request.getSession().getServletContext().getRealPath("fileupload");
            //获取文件类型
            String originalFilename = attach.getOriginalFilename();
            String fileType = originalFilename.substring(originalFilename.lastIndexOf("."));
            //支持的文件类型
            List<String> fileTypes = Arrays.asList(".jpeg", ".jpg", ".png", ".pneg");
            if (fileTypes.contains(fileType)) {
                //开始写入到服务器的硬盘
                //重命名上传的文件名
                String fileName = new StringBuffer(String.valueOf(System.currentTimeMillis()))
                        .append(UUID.randomUUID().toString())
                        .append(fileType).toString();
                File file = new File(fileupload + File.separator + fileName);
                if (!file.exists()) {
                    file.mkdirs();
                }
                try {
                    attach.transferTo(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "文件上传成功";
    }


}
