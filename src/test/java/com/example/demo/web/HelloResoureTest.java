package com.example.demo.web;

import com.example.demo.dto.request.HelloRequest;
import com.example.demo.service.HelloService;
import com.example.demo.web.rest.HelloResoure;
import org.junit.jupiter.api.Test;

public class HelloResoureTest {
    @Test
    public void test() {
        new HelloResoure(new HelloService()).method(new HelloRequest());
    }
}
