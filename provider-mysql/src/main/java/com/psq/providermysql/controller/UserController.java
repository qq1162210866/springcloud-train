package com.psq.providermysql.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/")
    @ApiOperation(value = "查询用户接口")
    public String selectUserByID(@RequestParam List<String> ids) {
        return "hello SpringCloud";
    }


}
