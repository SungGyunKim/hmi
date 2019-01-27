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
public class HmiAlarmRecord {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	
	@Column(nullable = false)
	private int isRead;
	
	@Column(nullable = false)
	private Timestamp alarmTime;
	
	@Column(nullable = false, length = 100)
	private String alarmContents;
	
	@Column(nullable = false, length = 100)
	private String alarmPlace;
	
	@Builder
	public HmiAlarmRecord(int no, int isRead, Timestamp alarmTime, String alarmContents, String alarmPlace) {
		super();
		this.no = no;
		this.isRead = isRead;
		this.alarmTime = alarmTime;
		this.alarmContents = alarmContents;
		this.alarmPlace = alarmPlace;
	}
	
}
