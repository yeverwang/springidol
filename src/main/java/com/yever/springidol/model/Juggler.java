package com.yever.springidol.model;

import com.yever.springidol.api.Performer;
import com.yever.springidol.exception.PerformanceException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by yeverwang on 2017/5/21.
 */
@Component
public class Juggler implements Performer {
    @Value("${bags}")
    private int bags;

    public Juggler() {
    }


    public void setBags(int bags) {
        this.bags = bags;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Juggler "+bags+" bags");
    }
}
