package db;

import models.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClientesDb {
    private List<Cliente> clientesList = new ArrayList<>();

    public List<Cliente> getClientesList(){
        return clientesList;
    }
    public Cliente getClientePorNome(String nome){
        return clientesList.stream()
                .filter((cliente -> cliente.getNome() == nome))
                .findFirst()
                .get();
    }
    public void addNovoCliente(Cliente cliente){
        clientesList.add(cliente);
    }
}
