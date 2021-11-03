package com.tjupd.olympics.MedalTable.visitor;

/**
 * @author Yuqi Kuang
 * 奖牌榜列表类
 */
public class CountryMedal {

        private String country;

        private int gold;

        private int silver;

        private int bronze;

        private int total;

        public CountryMedal(String country)
        {
            this.country = country;
            this.gold = 0;
            this.silver = 0;
            this.bronze = 0;
            this.total = 0;
        }
        public String getCountry() { return country; }

        public void addGold(){this.gold++;}

        public void addSilver(){this.silver++;}

        public void addBronze(){this.bronze++;}

        public void addTotal(){this.total=this.bronze+this.silver+this.gold;}

        public int getGold() {
        return gold;
    }

        public int getSilver(){return silver;}

        public int getBronze() {
        return bronze;
    }

        public int getTotal(){return total;}
}
