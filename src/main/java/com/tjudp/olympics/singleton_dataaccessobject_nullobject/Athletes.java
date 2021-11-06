package com.tjudp.olympics.singleton_dataaccessobject_nullobject;

import com.tjudp.olympics.builder.food.FoodType;
import com.tjudp.olympics.chainofresponsibility.ChainPatternDemo;
import com.tjudp.olympics.commandandcomposite.BuyCommand;
import com.tjudp.olympics.commandandcomposite.MultipleCommand;
import com.tjudp.olympics.observer.ObserverDemo;
import com.tjudp.olympics.state.StateDemo;
import com.tjudp.olympics.other.Game.GetScore;
import com.tjudp.olympics.other.Game.NameWithScore;

import java.util.*;

/**
 * @author ShaoCHi
 * <p>
 * 运动员的数据操作类
 */
public class Athletes implements athletesInterface {

  private final List<Athlete> athletes;
  public Athlete myAthlete;
  private MultipleCommand mulcmd;

  public List<Athlete> getAthletes() {
    return athletes;
  }

  public static Athletes getAthlete() {
    return athlete;
  }

  private static final Athletes athlete = new Athletes();

  private Athletes() {
    this.athletes = initialization();
    this.mulcmd=new MultipleCommand();
  }

  /**
   * 运动员的初始生成接口
   *
   * @return List
   */
  @Override
  public List<Athlete> initialization() {
    List<Athlete> athletes = new LinkedList<>();
    List<String> maleNames = new LinkedList<>();
    List<String> femaleNames = new LinkedList<>();
    List<String> countryNames = new LinkedList<>();
    maleNames.add("Aaron");
    maleNames.add("Bill");
    maleNames.add("Carl");
    maleNames.add("Dick");
    maleNames.add("Evan");
    maleNames.add("Ford");
    femaleNames.add("Taylor");
    femaleNames.add("Rose");
    femaleNames.add("Zola");
    femaleNames.add("Mila");
    femaleNames.add("Ella");
    femaleNames.add("Judy");
    countryNames.add("China");
    countryNames.add("Japan");
    countryNames.add("Korea");
    countryNames.add("Russian");
    for (int i = 0; i < 6; i++) {
      Athlete female = new Athlete();
      female.setSex(false);
      Athlete male = new Athlete();
      male.setSex(true);
      female.setName(femaleNames.get(i));
      male.setName(maleNames.get(i));
      female.setCountry(countryNames.get(((i + 2) % 4)));
      male.setCountry(countryNames.get(i % 4));
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
   *
   * @return List
   */
  public static Athletes getAll() {
    return athlete;
  }

  /**
   * 根据性别来获取运动员
   *
   * @param sex（boolean）
   * @return List
   */
  @Override
  public List<Athlete> getAthletes(boolean sex) {
    List<Athlete> athletesWithSex = new LinkedList<>();
    for (Athlete athlete : this.athletes) {
      if (athlete.isSex() == sex) {
        athletesWithSex.add(athlete);
      }
    }
    return athletesWithSex;
  }

  /**
   * 根据姓名来获取运动员
   *
   * @param name（String）
   * @return Athlete
   */
  @Override
  public Athlete getAthlete(String name) {
    for (Athlete athlete : this.athletes) {
      if (Objects.equals(athlete.getName(), name)) {
        return athlete;
      }
    }
    return new Athlete();
  }

  /**
   * 更新运动员身体素质
   *
   * @param name（String）
   * @param score（double）
   */
  @Override
  public void updateAthletesBody(String name, double score) {
    for (Athlete athlete : this.athletes) {
      if (Objects.equals(athlete.getName(), name)) {
        athlete.setBodyScore(athlete.getBodyScore() + score);
        break;
      }
    }
  }

  /**
   * 用户创建属于自己的运动员对象
   */
  @Override
  public void createAthlete() {
    String name = "";
    boolean sex = true;
    String country = "";
    Scanner input = new Scanner(System.in);
    System.out.println("下面开始角色创建，请依次输入您的信息：");
    System.out.println("姓名：");
    name = input.nextLine();
    boolean stop = false;
    while (!stop) {
      System.out.println("性别：[1] 男 [2] 女");
      String tmp1 = input.nextLine();
      switch (tmp1){
        case "1":
          sex = true;
          stop = true;
          break;
        case "2":
          sex = false;
          stop = true;
          break;
        default:
          System.out.println("未识别字符，请重新输入");
      }
    }
    stop = false;
    while (!stop) {
      System.out.println("国家：[1] 中国 [2] 日本 [3] 韩国 [4] 俄国");
      String tmp2 = input.nextLine();
      switch (tmp2){
        case "1":
          country = "China";
          stop = true;
          break;
        case "2":
          country = "Japan";
          stop = true;
          break;
        case "3":
          country = "Korea";
          stop = true;
          break;
        case "4":
          country = "Russian";
          stop = true;
          break;
        default:
          System.out.println("未识别字符，请重新输入");
      }

    }

    String[] names = {"Aaron", "Bill", "Carl", "Dick", "Evan", "Ford", "Taylor", "Rose", "Zoe", "Mila", "Ella", "Judy"};
    String[] countries = {"China", "Japan", "Korea", "Russian"};
    for (String s : names) {
      if (s.equals(name)) {
        System.out.println("您的名字已经存在，请重新输入！");
      }
    }
    Athlete athlete = new Athlete();
    double score;
    do {
      score = Math.random() * 100;
    } while (!(score > 65) || !(score < 80));
    myAthlete = athlete;
    athlete.setName(name);
    athlete.setBodyScore(score);
    athlete.setCountry(country);
    athlete.setSex(sex);
    athlete.setScores(new LinkedList<>());
    athletes.add(athlete);
    System.out.println("角色创建成功！");
  }

  /**
   * 更新运动员的比赛成绩
   *
   * @param score（GetScore）
   * @param sex（boolean）
   */
  @Override
  public void updateScores(GetScore score, boolean sex) {
    List<Athlete> athletesWithSex = this.getAthletes(sex);
    for (NameWithScore nameWithScore : score.getScores()) {
      GameWithScore gameWithScore = new GameWithScore();
      gameWithScore.setType(score.getType());
      for (Athlete athlete : athletesWithSex) {
        if (Objects.equals(athlete.getName(), nameWithScore.getName())) {
          gameWithScore.setScore(nameWithScore.getScore());
          gameWithScore.setRank(nameWithScore.getRank());
          athlete.getScores().add(gameWithScore);
          break;
        }
      }
    }
  }

  /**
   * 用户更新自己的健康码
   *
   * @param name（String）
   * @param code（int）
   */
  @Override
  public void updateHealthCode(String name, int code) {
    String country = null;
    for (Athlete athlete : this.athletes) {
      if (Objects.equals(athlete.getName(), name)) {
        athlete.setHealthCode(code);
        if (code == 2) {
          athlete.setStatus(false);
        }
        country = athlete.getCountry();
        break;
      }
    }
    for (Athlete athlete : this.athletes) {
      if (Objects.equals(athlete.getCountry(), country)) {
        athlete.setHealthCode(code);
        if (code == 2) {
          athlete.setStatus(false);
        }
      }
    }
  }

  /**
   * 更新运动员住户信息
   *
   * @param name（String）
   * @param building（String）
   * @param roomNumber（String）
   */
  @Override
  public void deliverRoom(String name, String building, String roomNumber) {
    for (Athlete athlete : this.athletes) {
      if (Objects.equals(athlete.getName(), name)) {
        athlete.setBuilding(building);
        athlete.setRoomNumber(roomNumber);
        break;
      }
    }
  }

  /**
   * 饮食
   * 命令模式
   * @return（Multiplecommand）
   */
    @Override
    public MultipleCommand getMulcmd() {
        return mulcmd;
    }

    @Override
    public void creatCommand(FoodType buyFoodType, int number) {
        BuyCommand cmd=new BuyCommand(buyFoodType,number);
        mulcmd.append(cmd);
    }

    @Override
    public void doAllCommand() {
        mulcmd.buy();
    }

    @Override
    public void undoCommand() {
        mulcmd.undo();
    }

    @Override
    public void clearCommand() {
        mulcmd.clear();
    }

  @Override
  public void runEpidemicCheck(Athlete athlete) throws InterruptedException {

    int healthCode;
    Random r = new Random();
    int k=r.nextInt(101);
    if(k>=0&&k<=15) {//15%
      healthCode = 2;
    }
    else if(k>15&&k<=40) {//25%
      healthCode = 1;
    }
    else {//60%
      healthCode = 0;
    }
//    healthCode = 2; //用于调试
    //因为需要测试，设置一个国家，实际是自己输入的
    athlete.setHealthCode(healthCode);
    //athlete.setHealthCode(healthcode);

    //运动员当前各项状态
    System.out.println("运动员身体状态：");
    System.out.println(athlete.getName() + "	"+ athlete.getCountry() +"	"+ athlete.getHealthCode());

    //责任链模式
    ChainPatternDemo chainPatternDemo = new ChainPatternDemo();
//    System.out.println("查找责任链中不同疫情健康码级别的记录器：");
    chainPatternDemo.run(athlete);
    System.out.println();

    //状态模式
//    System.out.println("根据不同健康吗状态采取不同措施：");
    StateDemo statedemo = new StateDemo();
    statedemo.run(athlete);
    System.out.println();

    //观察者模式
    System.out.println("其他运动员作为观察者更新其他运动员自己的健康码：");
    ObserverDemo observerdemo = new ObserverDemo();
    observerdemo.run(athlete,this);
    athlete.setStatus(true);
  }
}
