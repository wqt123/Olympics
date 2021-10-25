package com.tjupd.olympics.athletes;

import com.tjupd.olympics.other.Game.GetScore;
import com.tjupd.olympics.other.Game.NameWithScore;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * @author ShaoCHi
 *
 * 运动员的数据操作类
 */
public class Athletes  implements athletesInterface{

    private final List<Athlete> athletes=initialization();

    /**
     * 运动员的初始生成接口
     * @return List<Athlete></Athlete>
     */
    @Override
    public List<Athlete> initialization() {
        List<Athlete> athletes=new LinkedList<>();
        List<String> maleNames=new LinkedList<>();
        List<String> femaleNames=new LinkedList<>();
        List<String> countryNames=new LinkedList<>();
        maleNames.add("Aaron");maleNames.add("Bill");maleNames.add("Carl");maleNames.add("Dick");maleNames.add("Evan");maleNames.add("Ford");
        femaleNames.add("Taylor");femaleNames.add("Rose");femaleNames.add("Zoe");femaleNames.add("Mila");femaleNames.add("Ella");femaleNames.add("Judy");
        countryNames.add("China");countryNames.add("Japan");countryNames.add("Korea");countryNames.add("Russian");
        for(int i=0;i<6;i++){
            Athlete female=new Athlete();
            female.setSex(false);
            Athlete male=new Athlete();
            male.setSex(true);
            female.setName(femaleNames.get(i));
            male.setName(maleNames.get(i));
            female.setCountry(countryNames.get(((i+2)%4)));
            male.setCountry(countryNames.get(i%4));
            female.setScores(new LinkedList<>());
            male.setScores(new LinkedList<>());
            double score;
            do {
                score = Math.random() * 100;
            } while (!(score > 50) || !(score < 70));
            female.setBodyScore(score);
            do {
                score = Math.random() * 100;
            } while (!(score > 60) || !(score < 80));
            male.setBodyScore(score);
            athletes.add(female);
            athletes.add(male);
        }
        return athletes;
    }

    /**
     * 获取所有的运动员信息
     * @return List<Athlete></Athlete>
     */
    @Override
    public List<Athlete> getAll(){
        return athletes;
    }

    /**
     * 根据性别来获取运动员
     * @param sex（boolean）
     * @return List<Athlete></Athlete>
     */
    @Override
    public List<Athlete> getAthletes(boolean sex) {
        List<Athlete> athletesWithSex=new LinkedList<>();
        for (Athlete athlete : athletes) {
            if (athlete.isSex() == sex) {
                athletesWithSex.add(athlete);
            }
        }
        return athletesWithSex;
    }

    /**
     * 根据姓名来获取运动员
     * @param name（String）
     * @return Athlete
     */
    @Override
    public Athlete getAthlete(String name) {
        for (Athlete athlete : athletes) {
            if (Objects.equals(athlete.getName(), name)) {
                return athlete;
            }
        }
        return new Athlete();
    }

    /**
     * 更新运动员身体素质
     * @param name（String）
     * @param score（double）
     */
    @Override
    public void updateAthletesBody(String name, double score) {
        for(Athlete athlete:athletes){
            if(Objects.equals(athlete.getName(), name)){
                athlete.setBodyScore(athlete.getBodyScore()+score);
                break;
            }
        }
    }

    /**
     * 用户创建属于自己的运动员对象
     *
     * @param name（String）
     * @param sex（boolean）
     * @param country（String）
     */
    @Override
    public String addAthlete(String name, boolean sex, String country) {
        String[] names={"Aaron","Bill","Carl","Dick","Evan","Ford","Taylor","Rose","Zoe","Mila","Ella","Judy"};
        String[] countrys={"China","Japan","Korea","Russian"};
        for (String s : names) {
            if (s.equals(name)) {
                return "Your name already exists!Please try again!";
            }
        }
        for(String s:countrys){
            if(s.equals(country)){
                Athlete athlete=new Athlete();
                athlete.setName(name);
                athlete.setCountry(country);
                athlete.setSex(sex);
                athlete.setScores(new LinkedList<>());
                athletes.add(athlete);
                return "Hello "+name+"!";
            }
        }
        return "Your Country doesn't exist!Please try again!";
    }

    /**
     * 更新运动员的比赛成绩
     * @param score（GetScore）
     * @param sex（boolean）
     */
    @Override
    public void updateScores(GetScore score,boolean sex){
        List<Athlete> athletesWithSex=getAthletes(sex);
        for(NameWithScore nameWithScore:score.getScores()){
            GameWithScore gameWithScore=new GameWithScore();
            gameWithScore.setType(score.getType());
            for(Athlete athlete:athletes){
                if(Objects.equals(athlete.getName(), nameWithScore.getName())){
                    gameWithScore.setScore(nameWithScore.getScore());
                    gameWithScore.setRank(nameWithScore.getRank());
                    athlete.getScores().add(gameWithScore);
                    break;
                }
            }
        }
    }

}