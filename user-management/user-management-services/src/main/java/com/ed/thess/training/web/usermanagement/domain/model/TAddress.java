package com.ed.thess.training.web.usermanagement.domain.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the T_ADDRESS database table.
 * 
 */
@Entity
@Table(name="T_ADDRESS")
@NamedQuery(name="TAddress.findAll", query="SELECT t FROM TAddress t")
public class TAddress implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
	@SequenceGenerator(name="T_ADDRESS_TADDRESSID_GENERATOR", sequenceName="T_ADDRESS_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_ADDRESS_TADDRESSID_GENERATOR")
	@Column(name="T_ADDRESS_ID")
	private long tAddressId;

	private String city;

	private String street;

	//bi-directional many-to-one association to TUser
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private TUser TUser;

	public TAddress() {
	}

	public long getTAddressId() {
		return this.tAddressId;
	}

	public void setTAddressId(long tAddressId) {
		this.tAddressId = tAddressId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public TUser getTUser() {
		return this.TUser;
	}

	public void setTUser(TUser TUser) {
		this.TUser = TUser;
	}

}