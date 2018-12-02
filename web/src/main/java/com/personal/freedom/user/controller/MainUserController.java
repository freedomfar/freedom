package com.personal.freedom.user.controller;


import com.personal.freedom.user.entity.MainUser;
import com.personal.freedom.user.entity.MainUserAlbum;
import com.personal.freedom.user.entity.MainUserPicture;
import com.personal.freedom.user.service.IMainUserAlbumService;
import com.personal.freedom.user.service.IMainUserPictureService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


/**
 * <p>
 * 用户主表 前端控制器
 * </p>
 *
 * @author guoys123
 * @since 2018-08-23
 */
@Controller
@RequestMapping("/mainUser")
public class MainUserController {
    @Resource
    private IMainUserPictureService mainUserPictureService;
    @Resource
    private IMainUserAlbumService mainUserAlbumService;
    @RequestMapping(path = "/userLogin", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute(value = "mainUser") MainUser mainUser){
        ModelAndView model = new ModelAndView();
        //todo 登入逻辑
        if (null == mainUser) {
            model.setViewName("/error");
            return model;
        }
        //登入成功加载页面所需数据
        List<MainUserPicture> pictureList = mainUserPictureService.findIndexPictureByUserId("1");
        model.addObject("pictureList", pictureList);
        //首页相册
        List<MainUserAlbum> albumList = mainUserAlbumService.findAlbumByUserId("1");
        model.addObject("albumList", albumList);
        model.setViewName("/main");
        return model;
    }

}

