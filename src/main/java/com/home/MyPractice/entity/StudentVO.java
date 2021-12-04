package com.home.MyPractice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class StudentVO {
	private String rollNo;
	@Setter
	@NonNull
	private String name;
	@Setter
	@NonNull
	private String cgpa;
	@Setter
	@NonNull
	private String doa;

}
