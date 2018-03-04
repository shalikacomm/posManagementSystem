package com.shatec.pos.service.impl;


import com.shatec.pos.model.SystemUser;
import com.shatec.pos.repository.UserRepository;
import com.shatec.pos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public SystemUser createSystemUser(SystemUser systemUser) {
        return  userRepository.save(systemUser);
    }

    @Override
    public SystemUser getSystemUser(Long id) {
        return userRepository.getSystemUserById(id);
    }


}
