package com.ed.thess.training.web.usermanagement.service.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.ed.thess.training.web.usermanagement.constants.RESTConstants;

/**
 * A class extending {@link Application} and annotated with @ApplicationPath is
 * the Java EE 7 "no XML" approach to activating JAX-RS.
 * 
 * <p>
 * Resources are served relative to the servlet path specified in the
 * {@link ApplicationPath} annotation.
 * </p>
 */
@ApplicationPath(RESTConstants.BASE_REST_PATH)
public class JaxRsActivator extends Application {
    /* class body intentionally left blank */
}
