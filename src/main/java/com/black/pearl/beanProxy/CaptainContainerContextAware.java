package com.black.pearl.beanProxy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class CaptainContainerContextAware implements ApplicationContextAware {

    /*spring-boot-container*/
    private static ApplicationContext captainContainer;

    /*call back method*/
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.captainContainer = applicationContext;
    }

    /**
     * provide access to non-spring class in spring-boot-application
     *
     * @return
     */
    public static ApplicationContext getCaptainContainer() {
        return captainContainer;
    }
}
