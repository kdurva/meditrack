package com.meditrack.service;

import com.meditrack.dto.MedicineDTO;
import com.meditrack.entity.Medicine;
import com.meditrack.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;

    public Medicine saveMedicine(MedicineDTO medicineDTO) {

        Medicine medicine = new Medicine();

        medicine.setName(medicineDTO.getName());
        medicine.setBatchNumber(medicineDTO.getBatchNumber());
        medicine.setManufacturer(medicineDTO.getManufacturer());
        medicine.setQuantity(medicineDTO.getQuantity());
        medicine.setMinimumStock(medicineDTO.getMinimumStock());
        medicine.setExpiryDate(medicineDTO.getExpiryDate());
        medicine.setPrice(medicineDTO.getPrice());

        return medicineRepository.save(medicine);
    }

    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }

    public Medicine getMedicineById(Long id) {
        return medicineRepository.findById(id).orElse(null);
    }

    public Medicine updateMedicine(Long id, MedicineDTO medicineDTO) {

        Medicine medicine = medicineRepository.findById(id).orElse(null);

        if (medicine != null) {
            medicine.setName(medicineDTO.getName());
            medicine.setBatchNumber(medicineDTO.getBatchNumber());
            medicine.setManufacturer(medicineDTO.getManufacturer());
            medicine.setQuantity(medicineDTO.getQuantity());
            medicine.setMinimumStock(medicineDTO.getMinimumStock());
            medicine.setExpiryDate(medicineDTO.getExpiryDate());
            medicine.setPrice(medicineDTO.getPrice());

            return medicineRepository.save(medicine);
        }

        return null;
    }

    public void deleteMedicine(Long id) {
        medicineRepository.deleteById(id);
    }

    public List<Medicine> getLowStockMedicines() {
        return medicineRepository.findAll()
                .stream()
                .filter(medicine ->
                        medicine.getQuantity() <= medicine.getMinimumStock())
                .toList();
    }

    public List<Medicine> getExpiredMedicines() {
        return medicineRepository.findAll()
                .stream()
                .filter(medicine ->
                        medicine.getExpiryDate().isBefore(java.time.LocalDate.now()))
                .toList();
    }
}