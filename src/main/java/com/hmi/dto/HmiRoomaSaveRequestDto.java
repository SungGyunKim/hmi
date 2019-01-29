package com.hmi.dto;

import java.sql.Timestamp;

import com.hmi.domain.HmiRooma;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HmiRoomaSaveRequestDto {
	
	private int floor;
	private int ho;
	private int insideTemp;
	private float setTemp;
	private int inHeating;
	private int outHeating;
	private int nowControlValue;
	private float setControlValue;
	private Timestamp regDate;
	private float nowFlow;
	private float totalFlow;
	private int onOff;
	private float totalHeat;
	private Timestamp setDate;
	
	public HmiRooma toEntity() {
		return HmiRooma.builder()
				.floor(floor)
				.ho(ho)
				.insideTemp(insideTemp)
				.setTemp(setTemp)
				.inHeating(inHeating)
				.outHeating(outHeating)
				.nowControlValue(nowControlValue)
				.setControlValue(setControlValue)
				.regDate(regDate)
				.nowFlow(nowFlow)
				.totalFlow(totalFlow)
				.onOff(onOff)
				.totalHeat(totalHeat)
				.setDate(setDate)
				.build();
	}
	
}
