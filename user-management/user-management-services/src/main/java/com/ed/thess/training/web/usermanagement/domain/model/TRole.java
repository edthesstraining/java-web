package com.ed.thess.training.web.usermanagement.domain.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the T_ROLE database table.
 * 
 */
@Entity
@Table(name="T_ROLE")
@NamedQuery(name="TRole.findAll", query="SELECT t FROM TRole t")
public class TRole implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="T_ROLE_TROLEID_GENERATOR", sequenceName="T_ROLE_SEQ")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_ROLE_TROLEID_GENERATOR")
    @Column(name="T_ROLE_ID")
    private long tRoleId;

    @Column(name="ROLE_NAME")
    private String roleName;

    //bi-directional many-to-many association to TUser
    @ManyToMany(mappedBy="TRoles")
    private List<TUser> TUsers;

    public TRole() {
    }

    public long getTRoleId() {
        return this.tRoleId;
    }

    public void setTRoleId(long tRoleId) {
        this.tRoleId = tRoleId;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<TUser> getTUsers() {
        return this.TUsers;
    }

    public void setTUsers(List<TUser> TUsers) {
        this.TUsers = TUsers;
    }

}