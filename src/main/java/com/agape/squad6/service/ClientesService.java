package com.agape.squad6.service;

import com.agape.squad6.model.cliente.exceptions.ClienteNotFoundException;
import org.springframework.stereotype.Service;

import com.agape.squad6.model.cliente.Cliente;
import com.agape.squad6.repository.ClienteRepository;

import lombok.RequiredArgsConstructor;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class ClientesService {

    private final ClienteRepository clienteRepository;

    public Cliente findClienteById(String clienteId) {
        Optional<Cliente> clienteOptional = this.clienteRepository.findById(clienteId);

        Cliente cliente = clienteOptional.orElseThrow(() -> new ClienteNotFoundException("Cliente não encontrado com ID " + clienteId));

        return cliente;
    }
}
