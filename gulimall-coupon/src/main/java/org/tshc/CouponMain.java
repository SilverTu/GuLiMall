package org.tshc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("org.tshc.coupon.dao")
@EnableDiscoveryClient
public class CouponMain {

  public static void main(String[] args) {
    SpringApplication.run(CouponMain.class, args);
  }
}