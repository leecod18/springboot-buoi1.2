package com.example.demo.service.imple;

import com.example.demo.dto.request.HelloRequest;
import com.example.demo.dto.response.HelloResponse;
import com.example.demo.service.HelloService;
import org.springframework.stereotype.Service;
@Service
public class HelloServiceImp implements HelloService {
    @Override
    public HelloResponse tuan(HelloRequest helloRequest) {
        HelloResponse helloResponse = new HelloResponse();
        helloResponse.setAction(helloRequest.getAction());
        helloResponse.setTimezoneOffsetMin(helloRequest.getTimezoneOffsetMin());
        return helloResponse;
    }
}
