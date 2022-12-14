package com.example.server.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author chen
 * @since 2022-06-28 09:06:28
 */
@Getter
@Setter
@TableName("probelm_set")
@ApiModel(value = "ProbelmSet对象", description = "")
public class ProbelmSet implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("题单Id")
    private String problemSetId;
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;
    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;
    @ApiModelProperty("题目ID")
    private String problemId;
}
