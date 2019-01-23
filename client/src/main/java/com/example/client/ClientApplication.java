package com.example.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

@SpringBootApplication
public class ClientApplication {

    @Bean
    public HessianProxyFactoryBean helloClient() {
        HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
        factory.setServiceUrl("http://localhost:8011/hello-hessian");
        factory.setServiceInterface(Iservice.class);
        return factory;
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}

