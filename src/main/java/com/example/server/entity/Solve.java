package com.example.server.entity;

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
@ApiModel(value = "Slove对象", description = "")
public class Slove implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("唯一ID")
    private String sloveId;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("用户ID")
    private String userId;

    @ApiModelProperty("问题ID")
    private String problemId;

    @ApiModelProperty("题解标题")
    private String sloveTitle;

    @ApiModelProperty("题解内容")
    private String content;
}
