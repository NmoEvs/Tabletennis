package com.chezouam.tabletennis.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BladeTest {

    Blade blade;

    @Before
    public    void setup(){
        blade = new Blade();
    }

    @Test
    public void getId() {
        Long idValue = 4L;
        blade.setId(idValue);
        assertEquals(idValue,blade.getId());
    }

    @Test
    public void getName() {
    }

    @Test
    public void getDescription() {
    }

}