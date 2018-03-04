package com.shatec.pos.service;

import com.shatec.pos.model.SystemUser;


public interface UserService {


    SystemUser createSystemUser(SystemUser systemUser);

    SystemUser getSystemUser (Long id);

}
