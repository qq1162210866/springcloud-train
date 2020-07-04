package com.psq.providermysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ProviderMysqlApplication.java
 * Description:  启动类
 *
 * @author Peng Shiquan
 * @date 2020/6/16
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderMysqlApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMysqlApplication.class, args);
    }

}
