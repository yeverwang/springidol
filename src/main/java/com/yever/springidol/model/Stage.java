package com.yever.springidol.model;


import org.springframework.stereotype.Component;

/**
 * Created by ASUS on 2017/5/21.
 */
@Component
public class Stage {
    private static final Stage INSTANCE = new Stage();

    private Stage() {
    }

    public static Stage getInstance() {
        return INSTANCE;
    }
}
