package com.yever.springidol.model;

import com.yever.springidol.api.Poem;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by ASUS on 2017/5/2.
 */
@Component
public class JokePoem implements Poem {
    private static  final List<String> JOKE = Arrays.asList("one","two","three","todo");
    @PostConstruct
    public void openBook(){
        System.out.println("Open the joke book");
    }
    @PreDestroy
    public void closeBook(){
        System.out.println("Close the joke book");
    }
    @Override
    public void recite() {
        for(String joke:JOKE){
            System.out.println(joke);
        }
    }

}
