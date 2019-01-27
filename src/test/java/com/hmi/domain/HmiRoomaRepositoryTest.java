package com.hmi.domain;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.sql.Timestamp;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HmiRoomaRepositoryTest {
	
	@Autowired
	private HmiRoomaRepository hmiRoomaRepository;
	
	@After
	public void cleanup() {
		/** 
	        이후 테스트 코드에 영향을 끼치지 않기 위해 
	        테스트 메소드가 끝날때 마다 respository 전체 비우는 코드
        **/
		hmiRoomaRepository.deleteAll();
	}
	
	@Test
	public void hmiRoomA저장_불러오기() {
		// given
		hmiRoomaRepository.save(HmiRooma.builder()
				.floor(1)
				.ho(103)
				.insideTemp(26)
				.setTemp(27.5f)
				.inHeating(21)
				.outHeating(22)
				.nowControlValue(10)
				.setControlValue(11)
				.regDate(new Timestamp(System.currentTimeMillis()))
				.nowFlow(110)
				.totalFlow(120)
				.onOff(1)
				.totalHeat(30)
				.setDate(new Timestamp(System.currentTimeMillis()))
				.build());
		
		// when
		List<HmiRooma> list = hmiRoomaRepository.findAll();
		
		// then
		HmiRooma hmiRooma = list.get(0);
		assertThat(hmiRooma.getFloor(), is(1));
		assertThat(hmiRooma.getHo(), is(103));
	}
	
}
