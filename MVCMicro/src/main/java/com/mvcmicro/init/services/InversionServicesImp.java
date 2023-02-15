package com.mvcmicro.init.services;

import com.mvcmicro.init.InversionDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class InversionServicesImp implements InversionServices {

    @Override
    public InversionDto getInvById(UUID invId) {
        return InversionDto.builder()
                .id(UUID.randomUUID())
                .cliente("Carlos")
                .plazo("6MS")
                .build();
    }
}
