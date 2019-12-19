package com.spring.basics.springbasics;

import com.spring.basics.componentScans.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@ComponentScan("com.spring.basics.componentScans")//spring needs to find component to create the beans
public class SpringComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanApplication.class);


    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringComponentScanApplication.class, args);

        ComponentDAO componentDAO = context.getBean(ComponentDAO.class);
        LOGGER.info("{}"+ componentDAO);
        LOGGER.info("{}"+ componentDAO.getComponentConnection());

    }


}
