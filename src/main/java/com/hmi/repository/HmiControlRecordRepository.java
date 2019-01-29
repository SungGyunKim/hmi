package com.hmi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hmi.domain.HmiControlRecord;

public interface HmiControlRecordRepository extends JpaRepository<HmiControlRecord, Long> {

}
