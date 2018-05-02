package com.chezouam.tabletennis.bootstrap;

import com.chezouam.tabletennis.entity.Color;
import com.chezouam.tabletennis.entity.PlayStyle;
import com.chezouam.tabletennis.entity.Rubber;
import com.chezouam.tabletennis.repository.RubberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Slf4j
@Component
public class ApplicationBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private RubberRepository rubberRepository;

    @Autowired
    public ApplicationBootstrap(RubberRepository rubberRepository) {
        this.rubberRepository = rubberRepository;

    }


    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Rubber backend = new Rubber();
//        backend.setId(Long.get);
        backend.setColor(Color.BLACK);
        backend.setDescription("Mousse de ouf");
        backend.setName("Roxxor");
        backend.setThickness((float) 1.7);
        backend.setPlayStyle(PlayStyle.OFF);

        byte[] bFile = new byte[0];
        try {
            bFile = extractImage();
        } catch (IOException e) {
            log.debug(e.getStackTrace().toString());
        }


        backend.setPicture(bFile);

        rubberRepository.save(backend);
    }

    private byte[] extractImage() throws IOException {
        File file = new File(this.getClass().getClassLoader().getResource("rasanter.jpg").getPath());
        byte[] bFile = new byte[(int) file.length()];



        try(FileInputStream fileInputStream = new FileInputStream(file);) {


           fileInputStream.read(bFile);

        } catch (IOException e) {
            log.debug(e.getStackTrace().toString());
        }
        return bFile;
    }
}
