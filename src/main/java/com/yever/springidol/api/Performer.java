package com.yever.springidol.api;

import com.yever.springidol.exception.PerformanceException;

/**
 * Created by ASUS on 2017/5/21.
 */
public interface Performer {
    void perform()throws PerformanceException;
}
