package com.example.ojbackend.service.impl;


import com.example.server.entity.Records;
import com.example.server.mapper.RecordsMapper;
import com.example.server.service.IRecordService;
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
public class RecordServiceImpl extends ServiceImpl<RecordsMapper, Records> implements IRecordService {

}
