package com.meditrack.controller;

import com.meditrack.dto.MedicineDTO;
import com.meditrack.entity.Medicine;
import com.meditrack.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/medicines")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @PostMapping
    public Medicine addMedicine(@RequestBody MedicineDTO medicineDTO) {
        return medicineService.saveMedicine(medicineDTO);
    }

    @GetMapping
    public List<Medicine> getAllMedicines() {
        return medicineService.getAllMedicines();
    }

    @GetMapping("/{id}")
    public Medicine getMedicineById(@PathVariable Long id) {
        return medicineService.getMedicineById(id);
    }

    @PutMapping("/{id}")
    public Medicine updateMedicine(
            @PathVariable Long id,
            @RequestBody MedicineDTO medicineDTO) {

        return medicineService.updateMedicine(id, medicineDTO);
    }

    @DeleteMapping("/{id}")
    public String deleteMedicine(@PathVariable Long id) {
        medicineService.deleteMedicine(id);
        return "Medicine deleted successfully";
    }

    @GetMapping("/low-stock")
    public List<Medicine> getLowStockMedicines() {
        return medicineService.getLowStockMedicines();
    }

    @GetMapping("/expired")
    public List<Medicine> getExpiredMedicines() {
        return medicineService.getExpiredMedicines();
    }

    @GetMapping("/search")
    public List<Medicine> searchMedicine(@RequestParam String name) {
        return medicineService.searchMedicine(name);
    }

    @GetMapping("/stats")
    public Map<String, Object> getStatistics() {
        return medicineService.getStatistics();
    }
}