package com.ed.thess.training.web.usermanagement.service.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ed.thess.training.web.usermanagement.domain.model.TUser;
import com.ed.thess.training.web.usermanagement.dto.TestDTO;
import com.ed.thess.training.web.usermanagement.service.manager.TestManager;

public class TestRESTServiceImpl implements TestRESTService {

    private static final Logger log = LoggerFactory.getLogger(TestRESTService.class);

    @Inject private TestManager testManager;

    @Override
    public TestDTO test() {
        log.info("Test REST service invoked.");

        List<TUser> users = testManager.getLastNames();
        List<String> lastNames = new ArrayList<>();
        TestDTO testDTO = new TestDTO();

        for (TUser user : users) {
            lastNames.add(user.getLastname());
        }
        testDTO.setLastNames(lastNames);

        return testDTO;
    }

}
