package com.proyectofinal.bazar.service;

import com.proyectofinal.bazar.model.Cliente;
import java.util.List;

public interface IClienteService {
    
    //método para traer a todos los Clientes
    public List<Cliente> getClientes();
    
    //alta
    public void saveCliente(Cliente cliente);
    
    //baja
    public void deleteCliente(Long id_cliente);
    
    //lectura de un solo objeto
    public Cliente findCliente(Long id_cliente);

    //editar
    public void editCliente(Cliente cliente);
    
}
