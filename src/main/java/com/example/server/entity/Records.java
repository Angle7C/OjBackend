package com.example.ojbackend.entity;

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
@ApiModel(value = "Record对象", description = "")
public class Records implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录ID")
    private String recordId;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("题目ID")
    private String problemId;

    @ApiModelProperty("用户ID")
    private String userId;

    @ApiModelProperty("代码内容")
    private String content;

    @ApiModelProperty("语言类型")
    private String type;

    @ApiModelProperty("记录分数")
    private Integer score;

    @ApiModelProperty("通过测试点")
    private Integer testNums;
}
