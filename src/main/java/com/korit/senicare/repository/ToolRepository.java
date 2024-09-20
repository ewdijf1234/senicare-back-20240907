package com.korit.senicare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korit.senicare.entity.ToolEntity;

@Repository
public interface ToolRepository extends JpaRepository <ToolEntity,Integer> {

    ToolEntity findByToolNumber(Integer toolNumber); // toolNumber 기준을 조회
    List<ToolEntity> findByOrderByToolNumberDesc();
    
}
