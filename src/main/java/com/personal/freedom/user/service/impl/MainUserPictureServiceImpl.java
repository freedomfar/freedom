package com.personal.freedom.user.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.personal.freedom.user.entity.MainUserPicture;
import com.personal.freedom.user.mapper.MainUserPictureMapper;
import com.personal.freedom.user.service.IMainUserPictureService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * <p>
 * 用户相片 服务实现类
 * </p>
 *
 * @author guoys123
 * @since 2018-08-23
 */
@Service
@Transactional
public class MainUserPictureServiceImpl extends ServiceImpl<MainUserPictureMapper, MainUserPicture> implements IMainUserPictureService {

    @Resource
    private MainUserPictureMapper mainUserPictureMapper;

    @Override
    public List<MainUserPicture> findIndexPictureByUserId(String idMainUser) {
        return mainUserPictureMapper.selectList(new EntityWrapper<MainUserPicture>()
                .eq("id_main_user",idMainUser)
                .eq("delete_flag",false)
                .eq("index_flag",true));
    }
}
