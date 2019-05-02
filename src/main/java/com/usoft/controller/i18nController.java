package com.usoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zc
 * @create 2019-05_02-14:23
 */
@Controller
public class i18nController {

    @RequestMapping(value = "/i18n", method = RequestMethod.GET)
    public String i18ntest(){
        return "i18n";
    }

}
