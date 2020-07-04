package com.psq.providermysql.controller;


import com.psq.providermysql.pojo.TestUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.sql.SQLException;
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
    private JdbcTemplate jdbcTemplate;

    @GetMapping(value = "/")
    @ApiOperation(value = "查询用户接口")
    public String selectUserByID(@RequestParam List<String> ids) {
        String sql = "SELECT id,name,password FROM `user`";
        List<TestUser> testUserList = jdbcTemplate.query(sql, new RowMapper<TestUser>() {
            @Override
            public TestUser mapRow(ResultSet resultSet, int i) throws SQLException {
                TestUser testUser = new TestUser();
                testUser.setId(resultSet.getInt("id"));
                testUser.setName(resultSet.getString("name"));
                testUser.setPassword(resultSet.getString("password"));
                return testUser;
            }
        });
        System.err.println("查询成功，查询结果如下：" + testUserList.toString());
        return testUserList.toString();
    }


}
