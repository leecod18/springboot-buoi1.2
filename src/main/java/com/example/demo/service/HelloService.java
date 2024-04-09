package com.example.demo.service;

import com.example.demo.dto.request.HelloRequest;
import com.example.demo.dto.response.HelloResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface HelloService {
    public HelloResponse tuan(HelloRequest helloRequest);
}
