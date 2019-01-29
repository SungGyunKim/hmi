package com.hmi.dto;

import java.sql.Timestamp;

import com.hmi.domain.HmiAlarmRecord;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HmiAlarmRecordSaveRequestDto {
	
	private int no;
	private int isRead;
	private Timestamp alarmTime;
	private String alarmContents;
	private String alarmPlace;
	
	public HmiAlarmRecord toEntity() {
		return HmiAlarmRecord.builder()
				.no(no)
				.isRead(isRead)
				.alarmTime(alarmTime)
				.alarmContents(alarmContents)
				.alarmPlace(alarmPlace)
				.build();
	}
	
}
