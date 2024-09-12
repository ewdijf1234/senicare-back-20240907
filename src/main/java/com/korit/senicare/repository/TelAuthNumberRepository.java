package com.korit.senicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korit.senicare.entity.TelAuthNumberEntity;

@Repository
// Repository는 interface만 가능!!
public interface TelAuthNumberRepository extends JpaRepository<TelAuthNumberEntity, String> {
    
    boolean existsByTelNumberAndAuthNumber(String telNumber, String authNumber);

}
