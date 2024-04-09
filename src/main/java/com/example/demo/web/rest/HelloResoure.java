package com.example.demo.web.rest;

import com.example.demo.dto.request.HelloRequest;
import com.example.demo.dto.response.HelloResponse;
import com.example.demo.service.HelloService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloResoure {

    //public final HelloService helloService = new HelloService();

    //@Autowire
    //C1: public HelloService helloService
    //C1 không khuyến khích về nếu sang framework khác sẽ lỗi vì khong inject được

//    private  HelloService helloService;
//    @Autowired
//    public void setHelloService(HelloService helloService) {
//        this.helloService = helloService;
//    }
//


    public final HelloService helloService;
    public HelloResoure(@Qualifier("alternativeHelloService") HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String hello(String name, int age) {
        return "Hello "+ name + " age "+age;
    }
    //Cach 1 : http://localhost:8080?name=bao&age=18(query param)

    @GetMapping("/hi/{id}")
    public String hi(@PathVariable String id, @RequestParam String name, int age) {
        return "Hi "+ id +" - "+name + " age "+age;
    }
    //Cach 2: http://localhost:8080/hi/1?name=tuan&age=10
    
    @PostMapping("/hello")
  public HelloResponse method(@RequestBody @Valid HelloRequest helloRequest){

        return helloService.tuan(helloRequest);
    }
}
