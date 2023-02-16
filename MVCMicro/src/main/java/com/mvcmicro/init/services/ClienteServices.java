package com.mvcmicro.init.services;

import com.mvcmicro.init.web.model.ClienteDto;

import java.util.UUID;

public interface ClienteServices {

    ClienteDto getCliById(UUID id);
}