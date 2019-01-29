package com.hmi.dto;

import com.hmi.domain.HmiDataAnalysis;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HmiDataAnalysisSaveRequestDto {
	
	private int no;
	private String dong;
	private int floor;
	private int ho;
	private float totalFlow;
	private float totalHeat;
	private String year;
	private String month;
	private String day;
	
	public HmiDataAnalysis toEntity() {
		return HmiDataAnalysis.builder()
				.no(no)
				.dong(dong)
				.floor(floor)
				.ho(ho)
				.totalFlow(totalFlow)
				.totalHeat(totalHeat)
				.year(year)
				.month(month)
				.day(day)
				.build();
	}
	
}
