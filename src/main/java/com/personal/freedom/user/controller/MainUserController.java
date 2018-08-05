package com.personal.freedom.user.controller;


import com.personal.freedom.user.entity.MainUser;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 郭永胜123
 * @since 2018-08-02
 */
@Controller
@RequestMapping("/mainUser")
public class MainUserController {

    @RequestMapping(path = "/userLogin", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute(value = "mainUser") MainUser mainUser){
        ModelAndView model = new ModelAndView();
        model.setViewName("main");
        return model;
    }

}

