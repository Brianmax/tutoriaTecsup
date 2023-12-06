package com.example.demo.dao;

import com.example.demo.entity.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartphoneDao extends JpaRepository<Smartphone, Long> {
}
