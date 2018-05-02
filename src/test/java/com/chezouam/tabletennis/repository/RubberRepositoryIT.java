package com.chezouam.tabletennis.repository;

import com.chezouam.tabletennis.entity.Rubber;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@DataJpaTest
public class RubberRepositoryIT {


    @Autowired
    RubberRepository rubberRepository;



    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getRubberById() {

        Optional<Rubber> byName = rubberRepository.findById(1L);

        Long id = byName.get().getId();
        assertEquals( 1,(long) id);
    }

    @Test
    public void getRubberByName() {

        Optional<Rubber> byName = rubberRepository.findByName("est");

        assertEquals("est", byName.get().getName());
    }

}