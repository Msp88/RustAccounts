package com.rustprojects.rustaccounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RustAccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RustAccountsApplication.class, args);
    }

}
