package com.yever.springidol.model;

import com.yever.springidol.api.Instrument;
import com.yever.springidol.api.Performer;
import com.yever.springidol.exception.PerformanceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


import org.springframework.stereotype.Component;

import javax.annotation.Resources;

/**
 * Created by yeverwang on 2017/5/22.
 */
@Component
public class Instrumentalist implements Performer {
    @Value("${song}")
    private String song ;
    @Autowired
    private Instrument instrument;


    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing " + song);
        instrument.play();
    }
}
