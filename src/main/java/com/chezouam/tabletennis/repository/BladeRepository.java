package com.chezouam.tabletennis.repository;

import com.chezouam.tabletennis.entity.Blade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BladeRepository extends JpaRepository<Blade,Long> {
}
