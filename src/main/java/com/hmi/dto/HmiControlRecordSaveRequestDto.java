package com.hmi.dto;

import java.sql.Timestamp;

import com.hmi.domain.HmiControlRecord;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HmiControlRecordSaveRequestDto {
	
	private int no;
	private String dong;
	private int floor;
	private int ho;
	private float nowTemp;
	private float setTemp;
	private int nowControlValue;
	private float setControlValue;
	private Timestamp regDate;
	private int onOff;
	
	public HmiControlRecord toEntity() {
		return HmiControlRecord.builder()
				.no(no)
				.dong(dong)
				.floor(floor)
				.ho(ho)
				.nowTemp(nowTemp)
				.setTemp(setTemp)
				.nowControlValue(nowControlValue)
				.setControlValue(setControlValue)
				.regDate(regDate)
				.onOff(onOff)
				.build();
	}
	
	@Builder
	public HmiControlRecordSaveRequestDto(int no, String dong, int floor, int ho, float nowTemp, float setTemp,
			int nowControlValue, float setControlValue, Timestamp regDate, int onOff) {
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
