import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main{

  public static void main(String[] args){


Diary diary = new Diary();
diary.createDiary(1,"khris","story");
diary.createDiary(2,"kasha","Aondofa");
diary.createDiary(2,"john","jogo");
diary.createDiary(3,"terna","bigie");

System.out.print(Diary.viewDiaryList());


  }

}