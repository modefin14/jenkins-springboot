package com.hari.jenkins_springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpringbootApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(JenkinsSpringbootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JenkinsSpringbootApplication.class, args);
        LOGGER.info("Jenkins Application is Started!");
	}

}
