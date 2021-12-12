package com.hugostorm.heroesapi.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.hugostorm.heroesapi.documents.Heroes;


@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String>{

}
