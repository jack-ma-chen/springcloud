package com.hoje.cloud.springcloud.service1.controller;

import com.hoje.cloud.springcloud.service1.mapper.DBMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class UserController {

    //@Autowired
    //private DBMapper dbMapper;

    @GetMapping("/{name}/list")
    public List list(@PathVariable("name") String name){
        if(name.equals("")){
            //return dbMapper.toString();
            return  null;
        }else{
            //return dbMapper.toString();
            return null;
        }
    }
}
