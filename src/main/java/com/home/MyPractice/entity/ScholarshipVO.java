package com.home.MyPractice.entity;

import java.util.Date;

import javax.persistence.Column;

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
public class ScholarshipVO {
	private String scholarId;
	@Setter
	@NonNull
	private String providerName;
	@Setter
	@NonNull
	private String validFrom;
	@Setter
	@NonNull
	private String validTill;
}
