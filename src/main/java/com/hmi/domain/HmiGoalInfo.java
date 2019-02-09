package com.hmi.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class HmiGoalInfo {
	
	@Id
	private int gId;
	
	@Column(nullable = false, length = 4, columnDefinition="CHAR(4)")
	private String year;
	
	@Column(nullable = false, length = 20)
	private String name;
	
	@Column(nullable = false, length = 10)
	private String unit;
	
	@Column(nullable = false)
	private int value;
	
	@Column(nullable = false)
	private Timestamp regDate;
	
	@Builder
	public HmiGoalInfo(int gId, String year, String name, String unit, int value, Timestamp regDate) {
		super();
		this.gId = gId;
		this.year = year;
		this.name = name;
		this.unit = unit;
		this.value = value;
		this.regDate = regDate;
	}
	
}
