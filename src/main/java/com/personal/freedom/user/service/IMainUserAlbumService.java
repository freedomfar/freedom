package com.personal.freedom.user.service;

import com.personal.freedom.user.entity.MainUserAlbum;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 用户相册 服务类
 * </p>
 *
 * @author guoys123
 * @since 2018-08-23
 */
public interface IMainUserAlbumService extends IService<MainUserAlbum> {

    /**
     * 根据用户id查找用户相册
     * @param idMainUser
     * @return
     */
    List<MainUserAlbum> findAlbumByUserId(String idMainUser);

}
