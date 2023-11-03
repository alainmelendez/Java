package com.proyectofinal.bazar.controller;

import com.proyectofinal.bazar.model.Cliente;
import com.proyectofinal.bazar.service.IClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    @Autowired
    private IClienteService clienteServ;
    
    //2. CRUD/ABML de clientes
    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return clienteServ.getClientes();
    }
    
    @GetMapping("/clientes/{id_cliente}")
    public Cliente findCliente(@PathVariable Long id_cliente){
        return clienteServ.findCliente(id_cliente);
    }
    
    @PostMapping("/clientes/crear")
    public String saveCliente(@RequestBody Cliente cliente){
        clienteServ.saveCliente(cliente);
        return "El cliente fue creado correctamente";
    }
    
    @DeleteMapping("/clientes/eliminar/{id_cliente}")
    public String deleteCliente(@PathVariable Long id_cliente){
        clienteServ.deleteCliente(id_cliente);
        return "El cliente fue eliminado correctamente";
    }
    
    @PutMapping("/clientes/editar/{id_cliente}")
    public Cliente editCliente(@RequestBody Cliente cliente){
        clienteServ.editCliente(cliente);
        return clienteServ.findCliente(cliente.getId_cliente());
    }
    
}