package com.zfc.study.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zfc.study.bean.User;
import com.zfc.study.dao.UserMapper;
import com.zfc.study.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.List;
import java.util.Optional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zfc
 * @since 2019-06-13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserMapper userMapper;

    @Override
    public List<User> queryList() {
        QueryWrapper queryWrapper = new QueryWrapper();
        return userMapper.selectList(queryWrapper);
    }
}
