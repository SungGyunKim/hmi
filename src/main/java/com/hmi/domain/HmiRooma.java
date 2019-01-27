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
public class HmiRooma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;
	
	@Column(nullable = false)
	private int floor;
	
	@Column(nullable = false)
	private int ho;
	
	@Column(nullable = false)
	private int insideTemp;
	
	@Column
	private float setTemp;
	
	@Column(nullable = false)
	private int inHeating;
	
	@Column(nullable = false)
	private int outHeating;
	
	@Column(nullable = false)
	private int nowControlValue;
	
	@Column
	private float setControlValue;
	
	@Column(nullable = false)
	private Timestamp regDate;
	
	@Column(nullable = false)
	private float nowFlow;
	
	@Column(nullable = false)
	private float totalFlow;
	
	@Column(nullable = false)
	private int onOff;
	
	@Column(nullable = false)
	private float totalHeat;
	
	@Column(nullable = false)
	private Timestamp setDate;
	
	@Builder
	public HmiRooma(long no, int floor, int ho, int insideTemp, float setTemp, int inHeating, int outHeating,
			int nowControlValue, float setControlValue, Timestamp regDate, float nowFlow, float totalFlow, int onOff,
			float totalHeat, Timestamp setDate) {
		super();
		this.no = no;
		this.floor = floor;
		this.ho = ho;
		this.insideTemp = insideTemp;
		this.setTemp = setTemp;
		this.inHeating = inHeating;
		this.outHeating = outHeating;
		this.nowControlValue = nowControlValue;
		this.setControlValue = setControlValue;
		this.regDate = regDate;
		this.nowFlow = nowFlow;
		this.totalFlow = totalFlow;
		this.onOff = onOff;
		this.totalHeat = totalHeat;
		this.setDate = setDate;
	}
	
}
