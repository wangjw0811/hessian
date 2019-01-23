package com.example.service;

import org.springframework.stereotype.Service;

@Service("hello")
public class ServiceImpl implements Iservice{


    @Override
    public String sayHelloHessian() {
        return "hello hessian1wqddff";
    }
}
