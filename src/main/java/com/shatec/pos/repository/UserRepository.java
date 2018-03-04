package com.shatec.pos.repository;

import com.shatec.pos.model.SystemUser;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<SystemUser, Long> {

SystemUser save(SystemUser systemUser);

SystemUser getSystemUserById(Long id);
}
