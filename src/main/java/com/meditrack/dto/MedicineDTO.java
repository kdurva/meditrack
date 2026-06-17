package com.meditrack.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MedicineDTO {

    private Long id;

    private String name;

    private String batchNumber;

    private String manufacturer;

    private Integer quantity;

    private Integer minimumStock;

    private LocalDate expiryDate;

    private Double price;
}
