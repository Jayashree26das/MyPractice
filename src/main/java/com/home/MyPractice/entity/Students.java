package com.home.MyPractice.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Entity
@Table(name="students")
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="roll_no")
	private Integer rollNo;
	@Setter
	@Column(name="name")
	private String name;
	@Setter
	@Column(name="cgpa")
	private Double cgpa;
	@Setter
	@Column(name="doa")
	private Date doa;
	@Setter
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "scholarship_id")
	private Scholarship scholarship;

}
