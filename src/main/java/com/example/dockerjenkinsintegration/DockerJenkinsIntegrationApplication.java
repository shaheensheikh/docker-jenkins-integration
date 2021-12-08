package com.example.dockerjenkinsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerJenkinsIntegrationApplication.class, args);
        System.out.println("welcome to docker-jenkins-integration sample");
    }

}
