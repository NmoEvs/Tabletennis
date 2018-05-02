package com.chezouam.tabletennis.service;

import com.chezouam.tabletennis.entity.Rubber;
import com.chezouam.tabletennis.repository.RubberRepository;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class RubberServiceTest {

    private RubberService service;

    @Mock
    private
    RubberRepository repository;


    @Before
    public  void setUp() {
        MockitoAnnotations.initMocks(this);
        service = new RubberService(repository);

    }

    @Test
    public void getRubberByNonExistingName() {


        when(service.getRubberByName("tutu")).thenReturn(Optional.empty());

        Optional<Rubber> result = service.getRubberByName("tutu");
        assertFalse(result.isPresent());
        //Permet de vérifier le passage dans la méthode
        verify(repository, times(1)).findByName("tutu");

    }

    @Test
    public void testMockMvc() throws Exception {
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
//        mockMvc.perform(get("/rubber")).andExpect(status().isOk());
    }

    @Test
    public void getRubberByName() {

        Rubber rubber = new Rubber();

        String rubberName = "Roxxor";
        when(service.getRubberByName(rubberName)).thenReturn(Optional.of(rubber));

        Optional<Rubber> result = service.getRubberByName(rubberName);
        assertTrue(result.isPresent());
        //Permet de vérifier le passage dans la méthode
        verify(repository, times(1)).findByName(rubberName);

    }

}