package com.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mo
 * @Description:
 * @date 2020-05-29 18:53
 */

@Controller
public class ProviderController {

//    @RequestMapping(value = "/test")
    public String toTest() {
        return "test";
    }

//    @RequestMapping(value = "/test1")
    public String index1() {
        //指定需要跳转的页面
        return "index";
    }



}
