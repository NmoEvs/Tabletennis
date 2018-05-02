package com.chezouam.tabletennis.repository;

import com.chezouam.tabletennis.entity.Rubber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//@Repository
public interface RubberRepository extends JpaRepository<Rubber,Long> {

    Optional<Rubber> findByName(String  name);
}
