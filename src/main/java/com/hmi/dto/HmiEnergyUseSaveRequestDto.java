package com.hmi.dto;

import com.hmi.domain.HmiEnergyUse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HmiEnergyUseSaveRequestDto {
	
	private int euId;
	private String energyName;
	private String unit;
	private String year;
	private float jan;
	private float feb;
	private float mar;
	private float apr;
	private float may;
	private float jun;
	private float jul;
	private float aug;
	private float sep;
	private float oct;
	private float nov;
	private float dec;
	
	public HmiEnergyUse toEntity() {
		return HmiEnergyUse.builder()
				.euId(euId)
				.energyName(energyName)
				.unit(unit)
				.year(year)
				.jan(jan)
				.feb(feb)
				.mar(mar)
				.apr(apr)
				.may(may)
				.jun(jun)
				.jul(jul)
				.aug(aug)
				.sep(sep)
				.oct(oct)
				.nov(nov)
				.dec(dec)
				.build();
	}
	
}
