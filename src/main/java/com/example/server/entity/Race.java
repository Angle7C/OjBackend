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
@ApiModel(value = "Race对象", description = "")
public class Race implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("比赛ID")
    private Integer raceId;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("比赛名称")
    private String raceName;

    @ApiModelProperty("题单Id")
    private String problemSetId;

    @ApiModelProperty("比赛介绍")
    private String raceDesc;

    @ApiModelProperty("比赛模式")
    private String raceLevel;

    @ApiModelProperty("比赛开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty("比赛结束时间")
    private LocalDateTime endTime;
}
