package com.yever.springidol.model;

import com.yever.springidol.api.Poem;
import com.yever.springidol.exception.PerformanceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ASUS on 2017/5/21.
 */
@Component
public class PoemJuggler extends Juggler {
    @Autowired
    private Poem poem;

   /* public PoemJuggler(){};

    public PoemJuggler(Poem poem) {
        this.poem = poem;
    }

    public PoemJuggler(int bags, Poem poem) {
        super(bags);
        this.poem = poem;
    }
    */
    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting");
        poem.recite();
    }
}
