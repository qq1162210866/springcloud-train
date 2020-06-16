package com.psq.eurekaclient.controller;

import com.psq.eurekaclient.feign.UserFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController.java
 * Description:  User相关controller
 *
 * @author Peng Shiquan
 * @date 2020/6/16
 */
@RequestMapping(value = "/user")
@RestController
@Api(value = "用户", tags = "用户管理相关接口")
public class UserController {

    @Autowired
    private UserFeign userFeign;


    @GetMapping(value = "/")
    @ApiOperation(value = "查询用户接口")
    public String selectUserByID(@RequestParam List<String> ids) {
        String result = userFeign.selectUserByID(ids);
        return result;
    }


}
