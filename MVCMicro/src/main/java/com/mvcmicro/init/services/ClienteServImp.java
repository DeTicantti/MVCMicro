package com.mvcmicro.init.services;

import com.mvcmicro.init.web.model.ClienteDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ClienteServImp implements ClienteServices {

    @Override
    public ClienteDto getCliById(UUID id) {
        return ClienteDto.builder()
                .id(UUID.randomUUID())
                .nombre("carlos")
                .build();
    }
}
