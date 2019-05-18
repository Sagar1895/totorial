package com.xworkz.tourism.entity.addplace;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="tourism_table")
public class AddPlaceEntity implements Serializable {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="TOURISM_ID")
	private int id;
	@Column(name="TOURISM_PLACE")
	private String place;
	@Column(name="TOURISM_STATE")
	private String state;
	@Column(name="TOURISM_COUNTRY")
	private String country;
	@Column(name="TOURISM_DESCRIPTION")
	private String description;
	@Column(name="TOURISM_POPULAR")
	private String popular;
	@Column(name="TOURISM_SEASON")
	private String season;

	public AddPlaceEntity() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPopular() {
		return popular;
	}

	public void setPopular(String popular) {
		this.popular = popular;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "AddPlaceEntity [id=" + id + ", place=" + place + ", state=" + state + ", country=" + country
				+ ", description=" + description + ", popular=" + popular + ", season=" + season + "]";
	}
	}

