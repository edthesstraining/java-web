package com.ed.thess.training.web.usermanagement.config;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * The Class CdiConfig.
 */
public class CdiConfig {

    /**
     * The {@code CHD} entity manager
     */
    @Produces
    @PersistenceContext
    private EntityManager chdEntityManager;

}
