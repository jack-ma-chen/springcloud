package com.hoje.cloud.springcloud.service1.service;


import com.hoje.cloud.springcloud.service1.FallBack.FeignFallBack;
import com.hoje.cloud.springcloud.service1.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "cloud-service-client-2",fallback = FeignFallBack.class)
public interface FeignService {

    //服务中方法的映射路径
    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/hellol", method= RequestMethod.GET)
    String hello(@RequestParam("name") String name) ;

    @RequestMapping(value = "/hello2", method= RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method= RequestMethod.POST)
    String hello(@RequestBody User user);
}
