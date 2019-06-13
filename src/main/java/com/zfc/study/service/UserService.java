package com.zfc.study.service;

import com.zfc.study.bean.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zfc
 * @since 2019-06-13
 */
public interface UserService {

    List<User> queryList();

}
