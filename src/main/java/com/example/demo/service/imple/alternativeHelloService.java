package com.example.demo.service.imple;

import com.example.demo.dto.request.HelloRequest;
import com.example.demo.dto.response.HelloResponse;
import com.example.demo.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class alternativeHelloService implements HelloService {
    @Override
    public HelloResponse tuan(HelloRequest helloRequest) {
        HelloResponse helloResponse = new HelloResponse();
        String action = helloRequest.getAction();
        helloResponse.setAction(new StringBuilder(action).reverse().toString());
        helloResponse.setEmail(helloRequest.getEmail());
        helloResponse.setTimezoneOffsetMin(helloRequest.getTimezoneOffsetMin()+10);
        return helloResponse;
    }
}
