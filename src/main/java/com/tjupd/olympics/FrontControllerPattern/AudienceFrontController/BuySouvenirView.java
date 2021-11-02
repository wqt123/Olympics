package com.tjupd.olympics.FrontControllerPattern.AudienceFrontController;

import com.tjupd.olympics.audience.Audience;
import com.tjupd.olympics.iterator.BuySouvenir;

public class BuySouvenirView {
    public void show(Audience audience){
        BuySouvenir buySouvenir = new BuySouvenir();
        try {
            buySouvenir.run(audience);
        }catch (Exception e){
            //ignore
        }
    }
}
