package com.sam.ws.peacock_practice.controller;

import com.sam.ws.peacock_practice.entity.Parent;
import com.sam.ws.peacock_practice.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parent")
public class ParentController {

    @Autowired
    ParentService parentService;

    @PostMapping("/create")
    public Parent createParent(@RequestBody Parent parent){
        Parent createParent=parentService.createParent(parent);

        return createParent;

    }
}
