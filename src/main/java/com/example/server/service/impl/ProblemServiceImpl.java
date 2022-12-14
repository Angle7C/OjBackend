package com.example.ojbackend.service.impl;


import com.example.server.entity.Problem;
import com.example.server.mapper.ProblemMapper;
import com.example.server.service.IProblemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chen
 * @since 2022-06-28 09:06:28
 */
@Service
public class ProblemServiceImpl extends ServiceImpl<ProblemMapper, Problem> implements IProblemService {

}
