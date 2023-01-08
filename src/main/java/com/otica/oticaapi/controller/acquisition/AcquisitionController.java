package com.otica.oticaapi.controller.acquisition;

import com.otica.oticaapi.model.acquisition.Acquisition;
import com.otica.oticaapi.service.acquisition.AcquisitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/acquisition")
public class AcquisitionController {

    @Autowired
    private AcquisitionService acquisitionService;

    @GetMapping(value = "/id")
    public Acquisition searchId(@RequestBody Acquisition acquisition){
        return acquisitionService.searchId(acquisition);
    }

    @GetMapping(value = "/month")
    public List<Acquisition> searchMonth(@RequestBody Acquisition acquisition){
        return acquisitionService.searchMonth(acquisition);
    }

    @GetMapping
    public List<Acquisition> list(){
        return acquisitionService.list();
    }

    @PostMapping
    public ResponseEntity<Acquisition> save(@RequestBody Acquisition acquisition){
        return acquisitionService.save(acquisition);
    }

    @PutMapping
    public ResponseEntity<Acquisition> alteration(@RequestBody Acquisition acquisition){
        return acquisitionService.alteration(acquisition);
    }

    @DeleteMapping
    public void delete(@RequestBody Acquisition acquisition){
        acquisitionService.delete(acquisition);
    }
}
