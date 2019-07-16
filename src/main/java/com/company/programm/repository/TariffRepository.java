package com.company.programm.repository;

import com.company.programm.model.Tariff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TariffRepository extends JpaRepository<Tariff, Integer> {
}
