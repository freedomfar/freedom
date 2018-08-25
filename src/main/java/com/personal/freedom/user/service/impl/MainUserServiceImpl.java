package com.personal.freedom.user.service.impl;

import com.personal.freedom.user.entity.MainUser;
import com.personal.freedom.user.mapper.MainUserMapper;
import com.personal.freedom.user.service.IMainUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户主表 服务实现类
 * </p>
 *
 * @author guoys123
 * @since 2018-08-23
 */
@Service
public class MainUserServiceImpl extends ServiceImpl<MainUserMapper, MainUser> implements IMainUserService {

}
