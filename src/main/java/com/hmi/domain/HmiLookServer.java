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
public class HmiLookServer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	
	@Column(nullable = false)
	private float setTemp;
	
	@Column(nullable = false)
	private int isRead;
	
	@Column(nullable = false)
	private int onOff;
	
	@Column(nullable = false)
	private float setControlValue;
	
	@Column(nullable = false, length = 1, columnDefinition="CHAR(1)")
	private String dong;
	
	@Column(nullable = false)
	private int floor;
	
	@Column(nullable = false)
	private int ho;
	
	@Column(nullable = false)
	private Timestamp regDate;
	
	@Builder
	public HmiLookServer(int no, float setTemp, int isRead, int onOff, float setControlValue, String dong, int floor,
			int ho, Timestamp regDate) {
		super();
		this.no = no;
		this.setTemp = setTemp;
		this.isRead = isRead;
		this.onOff = onOff;
		this.setControlValue = setControlValue;
		this.dong = dong;
		this.floor = floor;
		this.ho = ho;
		this.regDate = regDate;
	}
	
}
