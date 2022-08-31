package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Feedback;

@Repository
public interface MyRepo extends CrudRepository<Feedback, Integer>{

}
