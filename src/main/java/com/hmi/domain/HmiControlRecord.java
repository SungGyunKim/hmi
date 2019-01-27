package com.hmi.domain;

import java.sql.Timestamp;

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
public class HmiControlRecord {
	
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
	private float nowTemp;
	
	@Column
	private float setTemp;
	
	@Column(nullable = false)
	private int nowControlValue;
	
	@Column
	private float setControlValue;
	
	@Column
	private Timestamp regDate;
	
	@Column
	private int onOff;
	
	@Builder
	public HmiControlRecord(int no, String dong, int floor, int ho, float nowTemp, float setTemp, int nowControlValue,
			float setControlValue, Timestamp regDate, int onOff) {
		super();
		this.no = no;
		this.dong = dong;
		this.floor = floor;
		this.ho = ho;
		this.nowTemp = nowTemp;
		this.setTemp = setTemp;
		this.nowControlValue = nowControlValue;
		this.setControlValue = setControlValue;
		this.regDate = regDate;
		this.onOff = onOff;
	}
	
}
