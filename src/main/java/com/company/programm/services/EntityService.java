package com.company.programm.services;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EntityService<T> {
    public List<T> getAll();

    public void deleteById(Integer id);

    public T save(@RequestBody T newElement);

    public T update(@RequestBody T newElement);

}
