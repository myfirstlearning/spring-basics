package com.spring.basics.springbasics;

import com.spring.basics.componentScans.ComponentDAO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@ComponentScan("com.spring.basics.componentScans")//spring needs to find component to create the beans
public class SpringComponentScanApplication {

    //private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanApplication.class);


    public static void main(String[] args) {

        /*ApplicationContext context = SpringApplication.run(SpringComponentScanApplication.class, args);

        ComponentDAO componentDAO = context.getBean(ComponentDAO.class);
        LOGGER.info("{}"+ componentDAO);
        LOGGER.info("{}"+ componentDAO.getComponentConnection());*/

    }


}
