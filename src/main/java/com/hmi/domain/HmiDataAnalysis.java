package com.hmi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class HmiDataAnalysis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	
	@Column(nullable = false, length = 1, columnDefinition="CHAR(1)")
	private String dong;
	
	@Column(nullable = false)
	private int floor;
	
	@Column(nullable = false)
	private int ho;
	
	@Column(nullable = false)
	private float totalFlow;
	
	@Column(nullable = false)
	private float totalHeat;
	
	@Column(nullable = false, length = 1, columnDefinition="CHAR(4)")
	private String year;
	
	@Column(nullable = false, length = 1, columnDefinition="CHAR(4)")
	private String month;
	
	@Column(nullable = false, length = 1, columnDefinition="CHAR(2)")
	private String day;
	
	@Builder
	public HmiDataAnalysis(int no, String dong, int floor, int ho, float totalFlow, float totalHeat, String year,
			String month, String day) {
		super();
		this.no = no;
		this.dong = dong;
		this.floor = floor;
		this.ho = ho;
		this.totalFlow = totalFlow;
		this.totalHeat = totalHeat;
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
}
