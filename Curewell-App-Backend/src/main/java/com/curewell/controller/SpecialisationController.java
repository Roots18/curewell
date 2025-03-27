package com.curewell.controller;

import com.curewell.entity.Doctor;
import com.curewell.entity.Specialisation;
import com.curewell.services.SpecialisationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/specialisations")
@CrossOrigin(origins = "*")
public class SpecialisationController {

    private final SpecialisationService specialisationService;

    public SpecialisationController(SpecialisationService specialisationService) {
        this.specialisationService = specialisationService;
    }

    @GetMapping
    public List<Specialisation> getAllSpecialisations() {
        return specialisationService.getAllSpecialisation();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Specialisation> getSpecialisationById(@PathVariable String specCode) {
        return ResponseEntity.ok(specialisationService.getSpecialisationById(specCode));
    }

    @PostMapping
    public ResponseEntity<Specialisation> addSpecialisation(@RequestBody Specialisation specialisation) {
        System.out.println("Received Specialisation: Name = " + specialisation.getSpecName() + ", Code = " + specialisation.getSpecCode());

        Specialisation savedSpecialisation = specialisationService.addSpecialisation(specialisation);
        return ResponseEntity.ok(savedSpecialisation);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Specialisation> updateSpecialisation(@PathVariable String specCode, @RequestBody Specialisation specialisation) {
        return ResponseEntity.ok(specialisationService.updateSpecialisation(specCode, specialisation));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSpecialisation(@PathVariable String specCode) {
        specialisationService.deleteSpecialisation(specCode);
        return ResponseEntity.noContent().build();
    }

}