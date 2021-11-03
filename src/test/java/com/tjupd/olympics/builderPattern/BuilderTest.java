package com.tjupd.olympics.builderPattern;

import com.tjupd.olympics.builderPattern.builders.FoodBuilder;
import com.tjupd.olympics.builderPattern.director.Director;
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
