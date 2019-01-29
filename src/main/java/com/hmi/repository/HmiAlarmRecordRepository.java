package com.hmi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hmi.domain.HmiAlarmRecord;

public interface HmiAlarmRecordRepository extends JpaRepository<HmiAlarmRecord, Long> {

}
