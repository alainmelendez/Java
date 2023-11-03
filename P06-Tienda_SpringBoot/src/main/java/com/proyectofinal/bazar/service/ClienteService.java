package com.proyectofinal.bazar.service;

import com.proyectofinal.bazar.model.Cliente;
import com.proyectofinal.bazar.repository.IClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService{
    
    @Autowired
    private IClienteRepository clienteRepo;

    @Override
    public List<Cliente> getClientes() {
        List <Cliente> listaClientes = clienteRepo.findAll();
        return listaClientes;
    }

    @Override
    public void saveCliente(Cliente cliente) {
        clienteRepo.save(cliente);
    }

    @Override
    public void deleteCliente(Long id_cliente) {
        clienteRepo.deleteById(id_cliente);
    }

    @Override
    public Cliente findCliente(Long id_cliente) {
        Cliente cliente = clienteRepo.findById(id_cliente).orElse(null);
        return cliente;
    }

    @Override
    public void editCliente(Cliente cliente) {
        this.saveCliente(cliente);
    }
   
}