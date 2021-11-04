package com.tjupd.olympics.builder;

import com.tjupd.olympics.builder.builders.FoodBuilder;
import com.tjupd.olympics.builder.director.Director;
import org.junit.Test;

public class BuilderTest {
    @Test
    public void BuilderTest(){
        //创建导演
        Director director = new Director();
        //创建工人
        FoodBuilder builder = new FoodBuilder();
        director.BuyMilk(builder);
        builder.getResult();
    }
}
