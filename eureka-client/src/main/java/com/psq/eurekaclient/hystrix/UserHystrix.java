package com.psq.eurekaclient.hystrix;

import com.psq.eurekaclient.feign.UserFeign;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * UserHystrix.java
 * Description: UserFeign的回调类
 *
 * @author Peng Shiquan
 * @date 2020/7/4
 */
@Component
public class UserHystrix implements UserFeign {

    /**
     * Description: 查询的回调方法，里面可以放一些异常后处理机制
     *
     * @param ids
     * @return java.lang.String
     * @Author: Peng Shiquan
     * @Date: 2020/7/4
     */
    @Override
    public String selectUserByID(List<String> ids) {
        return "调用异常，但是可以继续往下执行";
    }
}
