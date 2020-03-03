package com.ed.thess.training.web.usermanagement.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ed.thess.training.web.usermanagement.constants.RESTConstants;
import com.ed.thess.training.web.usermanagement.dto.TestDTO;

@Path(RESTConstants.TEST_REST_PATH)
public interface TestRESTService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    TestDTO test();

}
