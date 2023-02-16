package com.mvcmicro.init.web.controller;

import com.mvcmicro.init.services.ClienteServices;
import com.mvcmicro.init.web.model.ClienteDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.util.UUID;

@RequestMapping({"/api/v1/cli"})
@RestController
public class ClienteController {

    private final ClienteServices clienteServices;

    public ClienteController(ClienteServices clienteServices) {
        this.clienteServices = clienteServices;
    }

    @GetMapping("/{cliId}")
    public ResponseEntity<ClienteDto> getCliente(@PathVariable UUID cliId){
        return new ResponseEntity<>(clienteServices.getCliById(cliId),HttpStatus.OK);
    }
}
