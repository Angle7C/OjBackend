package com.example.ojbackend.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserDTO {
    @ApiModelProperty("用户ID")
    private String userId;
    @ApiModelProperty("用户名称")
    private String userName;

    @ApiModelProperty("用户密码")
    private String userPassword;

    @ApiModelProperty("用户个人介绍")
    private String userDesc;

    @ApiModelProperty("用户具有的权限角色关联")
    private Integer roleId;

    @ApiModelProperty("比赛分数")
    private Integer rank;
    @ApiModelProperty("邮箱")
    private String email;
}
