package com.example.rest_example.service;

import com.example.rest_example.model.Client;

import java.util.List;

public interface ClientService {
    void createClient(Client client);

    List<Client> readAll();

    Client read(int id);

    boolean update(Client client ,int id);

    boolean delete(int id);

}
