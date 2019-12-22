package com.spring.basics.springbasics;

import com.spring.basics.cdi.SomeCDIBusiness;
import com.spring.basics.componentScans.ComponentDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@ComponentScan("com.spring.basics.cdi")
public class SpringCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringCDIApplication.class);

    public static void main(String[] args) {

       /* ApplicationContext context = SpringApplication.run(SpringCDIApplication.class, args);

        SomeCDIBusiness CDIBusiness = context.getBean(SomeCDIBusiness.class);*/
        //LOGGER.info("{} dao-{}", CDIBusiness, CDIBusiness.getSomeCDIDAO());


    }

}
