package com.zfc.study.dao;

import com.zfc.study.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zfc
 * @since 2019-06-13
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
