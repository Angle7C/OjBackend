package com.example.ojbackend.mapper;

import com.example.server.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author chen
 * @since 2022-06-28 09:06:28
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
