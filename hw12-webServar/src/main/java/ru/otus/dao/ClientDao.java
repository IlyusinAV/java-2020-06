package ru.otus.dao;

import ru.otus.crm.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientDao {
    List<Client> getClients();
    Optional<Client> findById(long id);
    Optional<Client> findByName(String name);
}
