package com.example.demo.link;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;


public interface LinkRepository extends CrudRepository <LinkEntity, String>{

}
