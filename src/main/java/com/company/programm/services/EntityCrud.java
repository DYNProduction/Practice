package com.company.programm.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.ArrayList;
import java.util.List;

@NoRepositoryBean
public class EntityCrud<T, E extends JpaRepository<T, Integer>> implements EntityService<T> {

    private E repository;

    EntityCrud(E repository) {
        this.repository = repository;
    }

    @Override
    public List<T> getAll() {
        List<T> users = repository.findAll ();

        return users == null ? new ArrayList<T> () : users;
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById (id);
    }

    @Override
    public T save(T newElement) {
        return repository.saveAndFlush (newElement);
    }

    @Override
    public T update(T newElement) {
        return repository.saveAndFlush (newElement);
    }
}
