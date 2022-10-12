package com.example.kttkpmtuan6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class KttkpmTuan6Application {

    public static void main(String[] args) {
        SpringApplication.run(KttkpmTuan6Application.class, args);
    }

}
