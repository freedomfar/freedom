package com.personal.freedom.user.service;

import com.personal.freedom.user.entity.MainUserPicture;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 用户相片 服务类
 * </p>
 *
 * @author guoys123
 * @since 2018-08-23
 */
public interface IMainUserPictureService extends IService<MainUserPicture> {

    /**
     * 根据用户id查询首页滚动图片
     * @param idMainUser
     * @return
     */
    List<MainUserPicture> findIndexPictureByUserId(String idMainUser);
}
