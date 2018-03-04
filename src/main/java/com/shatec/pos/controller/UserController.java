package com.shatec.pos.controller;


import com.shatec.pos.model.SystemUser;
import com.shatec.pos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public void greeting(@RequestBody SystemUser systemUser) {
        System.out.println("tetsasdasd22");
    }


}

