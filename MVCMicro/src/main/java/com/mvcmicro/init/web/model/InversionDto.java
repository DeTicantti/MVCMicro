package com.mvcmicro.init.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InversionDto {
    private UUID id;
    private String cliente;
    private String plazo;
    private Long inversion;

}
