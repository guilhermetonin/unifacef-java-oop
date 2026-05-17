package com.loja.api_clientes.service;

import com.loja.api_clientes.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private List<Cliente> listaClientes = new ArrayList<>();
    private Long id = 1L;

    // listar
    public List<Cliente> listar() {
        return this.listaClientes;
    }

    // criar
    public Cliente criar(Cliente c) {
        c.setId(id);
        id++;
        this.listaClientes.add(c);
        return c;
    }

    // buscar por id
    public Cliente buscarPorId(Long id) {
        for (Cliente cliente : this.listaClientes) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        return null; // não encontrado
    }

    // remover
    public boolean remover(Long id) {
        return this.listaClientes.removeIf(c -> c.getId().equals(id));
    }

    // atualizar
    public Cliente atualizar(Long id, Cliente novo) {
        novo.setId(id);

        for (int i = 0; i < this.listaClientes.size(); i++) {
            if (this.listaClientes.get(i).getId().equals(id)) {
                // encontrado
                this.listaClientes.set(i, novo);
                return novo;
            }
        }
        return null;
    }
}
