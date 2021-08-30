package com.example.aws.sqs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;

@SpringBootApplication(exclude = {ContextStackAutoConfiguration.class})
public class SpringbootAwsSqsExeApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootAwsSqsExeApplication.class, args);
    }

}
