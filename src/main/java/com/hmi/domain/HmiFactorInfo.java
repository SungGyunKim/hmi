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
public class HmiFactorInfo {
	
	@Id
	private int fId;
	
	@Column(nullable = false, length = 4, columnDefinition="CHAR(4)")
	private String year;
	
	@Column(nullable = false)
	private int value;
	
	@Column(nullable = false, length = 20)
	private String name;
	
	@Column(nullable = false, length = 20)
	private String type;
	
	@Column(nullable = false, length = 20)
	private String kind;
	
	@Column(nullable = false)
	private Timestamp regDate;
	
	@Builder
	public HmiFactorInfo(int fId, String year, int value, String name, String type, String kind, Timestamp regDate) {
		super();
		this.fId = fId;
		this.year = year;
		this.value = value;
		this.name = name;
		this.type = type;
		this.kind = kind;
		this.regDate = regDate;
	}
	
}
