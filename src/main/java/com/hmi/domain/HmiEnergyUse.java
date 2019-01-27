package com.hmi.domain;

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
public class HmiEnergyUse {
	
	@Id
	@Column(nullable = false)
	private int euId;
	
	@Column(nullable = false, length = 20)
	private String energyName;
	
	@Column(nullable = false, length = 10)
	private String unit;
	
	@Column(nullable = false, length = 4, columnDefinition="CHAR(4)")
	private String year;
	
	@Column
	private float jan;
	
	@Column
	private float feb;
	
	@Column
	private float mar;
	
	@Column
	private float apr;
	
	@Column
	private float may;
	
	@Column
	private float jun;
	
	@Column
	private float jul;
	
	@Column
	private float aug;
	
	@Column
	private float sep;
	
	@Column
	private float oct;
	
	@Column
	private float nov;
	
	@Column
	private float dec;
	
	@Builder
	public HmiEnergyUse(int euId, String energyName, String unit, String year, float jan, float feb, float mar,
			float apr, float may, float jun, float jul, float aug, float sep, float oct, float nov, float dec) {
		super();
		this.euId = euId;
		this.energyName = energyName;
		this.unit = unit;
		this.year = year;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
		this.apr = apr;
		this.may = may;
		this.jun = jun;
		this.jul = jul;
		this.aug = aug;
		this.sep = sep;
		this.oct = oct;
		this.nov = nov;
		this.dec = dec;
	}
	
}
