package com.ed.thess.training.web.usermanagement.service.manager;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.ed.thess.training.web.usermanagement.domain.model.TUser;
import com.ed.thess.training.web.usermanagement.repositories.TestRepository;

@Stateless
public class TestManager {

    @Inject private TestRepository testRepository;

    public List<TUser> getLastNames() {

        return testRepository.findAllAsc();
    }

}
