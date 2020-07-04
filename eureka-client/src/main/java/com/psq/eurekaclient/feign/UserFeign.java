package com.psq.eurekaclient.feign;

import com.psq.eurekaclient.hystrix.UserHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * UserFeign.java
 * Description: User的feign
 *
 * @author Peng Shiquan
 * @date 2020/6/16
 */
@FeignClient(name = "provider-mysql", fallback = UserHystrix.class)
public interface UserFeign {

    /**
     * Description: 查询list中的id所对应的用户信息
     *
     * @param ids
     * @return java.lang.String
     * @Author: Peng Shiquan
     * @Date: 2020/6/16
     */
    @GetMapping("/user/")
    String selectUserByID(@RequestParam List<String> ids);

}
