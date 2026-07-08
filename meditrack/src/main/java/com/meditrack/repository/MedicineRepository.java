package com.meditrack.repository;

import com.meditrack.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {

    List<Medicine> findByQuantityLessThanEqual(Integer quantity);

    List<Medicine> findByExpiryDateBefore(LocalDate date);

    List<Medicine> findByNameContainingIgnoreCase(String name);
}