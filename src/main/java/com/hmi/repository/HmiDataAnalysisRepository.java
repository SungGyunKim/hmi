package com.hmi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hmi.domain.HmiDataAnalysis;

public interface HmiDataAnalysisRepository extends JpaRepository<HmiDataAnalysis, Long> {

}
