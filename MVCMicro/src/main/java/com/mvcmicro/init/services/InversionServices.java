package com.mvcmicro.init.services;

import com.mvcmicro.init.web.model.InversionDto;

import java.util.UUID;

public interface InversionServices {
    InversionDto getInvById(UUID invId);

}
