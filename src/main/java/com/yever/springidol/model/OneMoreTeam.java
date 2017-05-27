package com.yever.springidol.model;

import com.yever.springidol.api.Instrument;
import com.yever.springidol.api.Performer;
import com.yever.springidol.exception.PerformanceException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ASUS on 2017/5/23.
 */
@Component
public class OneMoreTeam implements Performer {

    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() throws PerformanceException {
        for(Instrument instrument :instruments){
            instrument.play();
        }
    }
}
