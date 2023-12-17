package org.tshc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("org.tshc.order.dao")
@EnableDiscoveryClient
public class OrderMain {

  public static void main(String[] args) {
    SpringApplication.run(OrderMain.class, args);
  }
}