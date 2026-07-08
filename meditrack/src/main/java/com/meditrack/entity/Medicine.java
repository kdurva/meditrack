package com.meditrack.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String batchNumber;

    private String manufacturer;

    private Integer quantity;

    private Integer minimumStock;

    private LocalDate expiryDate;

    private Double price;

    private LocalDateTime createdAt = LocalDateTime.now();
}