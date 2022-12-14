package com.example.ojbackend.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

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
@TableName("race_user")
@ApiModel(value = "RaceUser对象", description = "")
public class RaceUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("唯一ID")
    private String raceUserId;

    @ApiModelProperty("参见比赛的ID")
    private String raceId;

    @ApiModelProperty("参见用户的ID")
    private String userId;

    @ApiModelProperty("该用户在该场比赛的得分")
    private Integer score;
}
