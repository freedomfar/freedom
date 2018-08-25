package com.personal.freedom.user.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.personal.freedom.user.entity.MainUserAlbum;
import com.personal.freedom.user.mapper.MainUserAlbumMapper;
import com.personal.freedom.user.service.IMainUserAlbumService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * <p>
 * 用户相册 服务实现类
 * </p>
 *
 * @author guoys123
 * @since 2018-08-23
 */
@Service
@Transactional
public class MainUserAlbumServiceImpl extends ServiceImpl<MainUserAlbumMapper, MainUserAlbum> implements IMainUserAlbumService {

    @Resource
    private MainUserAlbumMapper mainUserAlbumMapper;

    @Override
    public List<MainUserAlbum> findAlbumByUserId(String idMainUser) {
        return mainUserAlbumMapper.selectList(new EntityWrapper<MainUserAlbum>()
                .eq("id_main_user",idMainUser));
    }
}
