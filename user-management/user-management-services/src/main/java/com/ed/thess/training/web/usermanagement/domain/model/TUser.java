package com.ed.thess.training.web.usermanagement.domain.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the T_USER database table.
 * 
 */
@Entity
@Table(name="T_USER")
@NamedQuery(name="TUser.findAll", query="SELECT t FROM TUser t")
public class TUser implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="T_USER_TUSERID_GENERATOR", sequenceName="T_USER_SEQ")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_USER_TUSERID_GENERATOR")
    @Column(name="T_USER_ID")
    private long tUserId;

    private BigDecimal age;

    private String firstname;

    private String lastname;

    //bi-directional many-to-one association to TAddress
    @OneToMany(mappedBy="TUser")
    private List<TAddress> TAddresses;

    //bi-directional many-to-many association to TRole
    @ManyToMany
    @JoinTable(
        name="T_USER_ROLE"
        , joinColumns={
            @JoinColumn(name="USER_ID")
            }
        , inverseJoinColumns={
            @JoinColumn(name="ROLE_ID")
            }
        )
    private List<TRole> TRoles;

    public TUser() {
    }

    public long getTUserId() {
        return this.tUserId;
    }

    public void setTUserId(long tUserId) {
        this.tUserId = tUserId;
    }

    public BigDecimal getAge() {
        return this.age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<TAddress> getTAddresses() {
        return this.TAddresses;
    }

    public void setTAddresses(List<TAddress> TAddresses) {
        this.TAddresses = TAddresses;
    }

    public TAddress addTAddress(TAddress TAddress) {
        getTAddresses().add(TAddress);
        TAddress.setTUser(this);

        return TAddress;
    }

    public TAddress removeTAddress(TAddress TAddress) {
        getTAddresses().remove(TAddress);
        TAddress.setTUser(null);

        return TAddress;
    }

    public List<TRole> getTRoles() {
        return this.TRoles;
    }

    public void setTRoles(List<TRole> TRoles) {
        this.TRoles = TRoles;
    }

}