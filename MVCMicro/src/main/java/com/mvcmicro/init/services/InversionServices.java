package com.mvcmicro.init.services;

import com.mvcmicro.init.InversionDto;

import java.util.UUID;

public interface InversionServices {
    InversionDto getInvById(UUID invId);

}
