package com.mvcmicro.init.web.controller;

import com.mvcmicro.init.InversionDto;
import com.mvcmicro.init.services.InversionServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping({"/api/v1/inv"})
@RestController
public class InversionController {
    private final InversionServices inversionServices;

    public InversionController(InversionServices inversionServices) {
        this.inversionServices = inversionServices;
    }

    @GetMapping({"/{invId}"})
    public ResponseEntity<InversionDto> getInversion(@PathVariable(name="invId") UUID invId){
        return new ResponseEntity<>(inversionServices.getInvById(invId), HttpStatus.OK);
    }
}
