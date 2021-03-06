package com.tjudp.olympics.visitor;

import com.tjudp.olympics.filter.Criteria;
import com.tjudp.olympics.filter.CriteriaWithMedal;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athlete;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athletes;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.GameWithScore;


import java.util.*;

/**
 * @author Yuqi Kuang
 * 访问者模式
 * 访问奖牌榜的实体类
 */

public class MedalTableAll implements MedalTable {

        private Athletes athletes;

        private List<CountryMedal> countryMedal=new ArrayList();;

        public MedalTableAll(Athletes athletes) {
            super();
            this.athletes=athletes;
            //对于每一个运动员athlete进行处理，构造奖牌榜
            for(Athlete athlete:athletes.getAthletes()) {

                //首先要创建他们的国家
                String tempCountry = athlete.getCountry();//暂存他们的国家名称
                if (countryMedal.isEmpty()) {//奖牌榜如果为空
                    CountryMedal e = new CountryMedal(tempCountry);//创建这个运动员的国家
                    countryMedal.add(e);
                }
                boolean inTable=false;
                for (CountryMedal t : countryMedal) {//遍历奖牌榜
                    if (Objects.equals(t.getCountry(), tempCountry)) {//如果有这个国家
                        inTable=true;
                    }
                }
                if(!inTable) {
                    CountryMedal e = new CountryMedal(tempCountry);
                    countryMedal.add(e);
                }
                //下面添加奖牌
                for(GameWithScore result:athlete.getScores()){
                    for(CountryMedal t : countryMedal){
                        if(Objects.equals(t.getCountry(), tempCountry)){
                            if(result.getRank()==1)
                                t.addGold();
                            else if(result.getRank()==2)
                                t.addSilver();
                            else if(result.getRank()==3)
                                t.addBronze();
                            t.addTotal();
                        }
                    }
                }
            }

            for(int i=0;i<countryMedal.size();i++)
                for(int j=0;j<countryMedal.size() - 1 - i;j++)
                    if(countryMedal.get(j).getBronze()<countryMedal.get(j+1).getBronze())
                        Collections.swap(countryMedal,j,j+1);
            for(int i=0;i<countryMedal.size() ;i++)
                for(int j=0;j<countryMedal.size() - 1 - i;j++)
                    if(countryMedal.get(j).getSilver()<countryMedal.get(j+1).getSilver())
                        Collections.swap(countryMedal,j,j+1);
            for(int i=0;i<countryMedal.size() ;i++)
                for(int j=0;j<countryMedal.size() - 1 - i;j++)
                    if(countryMedal.get(j).getGold()<countryMedal.get(j+1).getGold())
                        Collections.swap(countryMedal,j,j+1);
            for(int i=0;i<countryMedal.size() ;i++)
                for(int j=0;j<countryMedal.size() - 1 - i;j++)
                    if(countryMedal.get(j).getTotal()<countryMedal.get(j+1).getTotal())
                        Collections.swap(countryMedal,j,j+1);
        }




        @Override
        public void accept(MedalTableVisitor medalTableVisitor) {
            System.out.println("是否过滤掉没有获得过奖牌的国家？");
            System.out.println("[y]是\t[n]否");
            Scanner input = new Scanner(System.in);
            String option = input.nextLine();
            System.out.print("\n");
            System.out.println("||==================奥运奖牌榜==================||");
            System.out.println("排名\t\t国家\t\t  金牌数\t  银牌数\t  铜牌数\t  奖牌数");
            if(Objects.equals(option, "n")){
                int rank=0;
                for(CountryMedal t : countryMedal) {
                    rank++;
                    System.out.print(" ");
                    System.out.print(rank);
                    System.out.print("\t\t");
                    System.out.print(t.getCountry());
                    System.out.print("\t\t");
                    System.out.print(t.getGold());
                    System.out.print("\t\t");
                    System.out.print(t.getSilver());
                    System.out.print("\t\t");
                    System.out.print(t.getBronze());
                    System.out.print("\t\t");
                    System.out.println(t.getTotal());
                }
                System.out.print("\n");
            }
            else if(Objects.equals(option, "y")){
//                List<CountryMedal> countryMedalList = new ArrayList<CountryMedal>();
                Criteria withMedal = new CriteriaWithMedal();
                int rank = 0;
                for(CountryMedal t : withMedal.meetCriteria(countryMedal)) {
                    rank++;
                    System.out.print(" ");
                    System.out.print(rank);
                    System.out.print("\t\t");
                    System.out.print(t.getCountry());
                    System.out.print("\t\t");
                    System.out.print(t.getGold());
                    System.out.print("\t\t");
                    System.out.print(t.getSilver());
                    System.out.print("\t\t");
                    System.out.print(t.getBronze());
                    System.out.print("\t\t");
                    System.out.println(t.getTotal());
                }
                System.out.print("\n");
            }
            else
                System.out.println("错误的操作码。");
            medalTableVisitor.visit(this);
        }

}
