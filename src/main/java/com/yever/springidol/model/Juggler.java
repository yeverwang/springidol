package com.yever.springidol.model;

import com.yever.springidol.api.Performer;
import com.yever.springidol.exception.PerformanceException;
import org.springframework.stereotype.Component;

/**
 * Created by ASUS on 2017/5/21.
 */
@Component
public class Juggler implements Performer {

    private int bags =3;

    public Juggler() {
    }

    public Juggler(int bags) {
        this.bags = bags;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Juggler "+bags+" bags");
    }
}
