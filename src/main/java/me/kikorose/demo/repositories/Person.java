package me.kikorose.demo.repositories;

import org.springframework.data.repository.CrudRepository;

public interface Person extends CrudRepository<Person, Long> {
}
