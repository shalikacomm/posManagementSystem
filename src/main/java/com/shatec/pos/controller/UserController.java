package com.shatec.pos.controller;


import com.shatec.pos.model.SystemUser;
import com.shatec.pos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shatec/pos")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/User",method = RequestMethod.POST)
    public SystemUser greeting(@RequestBody SystemUser systemUser) {
       return userService.createSystemUser(systemUser);
    }
    @RequestMapping(value = "/User", method = RequestMethod.GET)
    public SystemUser getUser(long id){
        return userService.getSystemUser(id);
    }


}

