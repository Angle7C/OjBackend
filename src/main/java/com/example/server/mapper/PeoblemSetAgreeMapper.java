package com.example.ojbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.server.entity.PeoblemSetAgree;
import jdk.jfr.Registered;
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
@Mapper
@Repository
public interface PeoblemSetAgreeMapper extends BaseMapper<PeoblemSetAgree> {

}
