package com.Proyecto.proyecto.cliente;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public  ClienteService(ClienteRepository clienteRepository){this.clienteRepository = clienteRepository;}

    public void saveCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public void deleteCliente(Long id){
        Optional<Cliente> optimalCliente = clienteRepository.findById(id);
        if (optimalCliente.isPresent()){
            clienteRepository.deleteById(id);
        }
        else {
            throw new Error("Paila nea, No hay ningun Cliente para eliminar con ese Id");
        }
    }

    public void updateCliente(Long id, Cliente nuevoCliente){
        Cliente clienteInsertar = clienteRepository.findById(id).orElse(null);

        clienteInsertar.setNombre(nuevoCliente.getNombre());
        clienteInsertar.setCiudad(nuevoCliente.getCiudad());
        clienteInsertar.setEmail(nuevoCliente.getEmail());

        clienteRepository.save(clienteInsertar);
        System.out.println("Cliente Actualizado");
    }

    public List<Cliente> getAllClientes(){
        return clienteRepository.findAll();
    }

    public Cliente getClienteById(Long id){
        Optional<Cliente> optionalCliente = clienteRepository.findById(id);
        if (optionalCliente.isPresent()){
            return optionalCliente.get();
        }
        else {
            throw new Error("Paila nea, No existe ninguna cliente con ese Id");
        }
    }
}
