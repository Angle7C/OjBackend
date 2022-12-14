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
@TableName("peoblem_set_agree")
@ApiModel(value = "PeoblemSetAgree对象", description = "")
public class PeoblemSetAgree implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("点赞记录ID")
    private String problemSetAgreeId;
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;
    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;
    @ApiModelProperty("点赞用户ID")
    private String userId;
    @ApiModelProperty("点赞问题ID")
    private String problemSetId;
    @ApiModelProperty("状态")
    private Integer state;
}
