package com.hmi.dto;

import java.sql.Timestamp;

import com.hmi.domain.HmiLookServer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HmiLookServerSaveRequestDto {
	
	private int no;
	private float setTemp;
	private int isRead;
	private int onOff;
	private float setControlValue;
	private String dong;
	private int floor;
	private int ho;
	private Timestamp regDate;
	
	public HmiLookServer toEntity() {
		return HmiLookServer.builder()
				.no(no)
				.setTemp(setTemp)
				.isRead(isRead)
				.onOff(onOff)
				.setControlValue(setControlValue)
				.dong(dong)
				.floor(floor)
				.ho(ho)
				.regDate(regDate)
				.build();
	}
	
}
