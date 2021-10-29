package com.tjupd.olympics.diet.BuilderPattern;

import com.tjupd.olympics.diet.BuilderPattern.*;
import com.tjupd.olympics.diet.BuilderPattern.builders.FoodBuilder;
import com.tjupd.olympics.diet.BuilderPattern.director.Director;
import org.junit.Before;
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
