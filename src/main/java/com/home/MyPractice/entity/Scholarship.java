package com.home.MyPractice.entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString(exclude = {"student"})
@Entity
@Table(name="scholarship")
public class Scholarship {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="scholarship_id")
	private Integer scholarId;
	@Setter
	@Column(name="sc_name")
	private String providerName;
	@Setter
	@Column(name="valid_from")
	private Date validFrom;
	@Setter
	@Column(name="valid_till")
	private Date validTill;
	
	@OneToOne(mappedBy = "scholarship")
	private Students student;
	 
}
