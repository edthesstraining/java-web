package com.ed.thess.training.web.usermanagement.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.cdi.Eager;

import com.ed.thess.training.web.usermanagement.domain.model.TUser;

/**
 * The Interface TestRepository.
 */
@Eager
public interface TestRepository extends JpaRepository<TUser, Long> {

    @Query("SELECT tUser FROM TUser tUser ORDER BY tUser.tUserId ASC")
    List<TUser> findAllAsc();

}

