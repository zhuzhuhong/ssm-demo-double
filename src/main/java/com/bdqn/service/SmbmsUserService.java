package com.bdqn.service;

import com.bdqn.SmbmsUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * @author mo
 * @Description: 服务层
 * @date 2020-05-21 18:01
 */

public class SmbmsUserService {
    private static final Logger log = LogManager.getLogger(SmbmsUserService.class);

    public Integer addUser(SmbmsUser smbmsUser) {
        //
//        log.info("service层接收到的参数：{}",smbmsUser);

        //模拟完成用户新增操作
        log.info("完成用户新增");
//        int i = 1 / 0;
        return 1;
    }



}
