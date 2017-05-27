package com.yever.springidol.model;

import com.yever.springidol.api.Instrument;
import org.springframework.stereotype.Component;

/**
 * Created by yeverwang on 2017/5/22.
 */
@Component
public class Sax implements Instrument {
    @Override
    public void play() {
            System.out.println(Sax.class.getName()+"TOOT TOOT");
    }
}
