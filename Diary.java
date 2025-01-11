import java.util.ArrayList;
import java.util.List;

public class Diary {
private int id;
private String name;
private String tittle;

private static List<Diary> myDiaryList = new  ArrayList<>();


public Diary(){
diary.setId(id);
diary.setName(name);
diary.setTittle(tittle);

}
public void setName(String name){
this.name = name;
};

public void setId(int id){
this.id = id;
};
public void setTittle(String tittle){
this.tittle = tittle;
};



public String getName(){
return name;
};

public int getId(){
return id;
};

public String getTittle(){
return tittle;
};

public  static void createDiary(int id,String name,String tittle){

Diary diary = new Diary(); 
diary.setId(id);
diary.setName(name);
diary.setTittle(tittle);
myDiaryList.add(diary);

}

public static List<Diary> getDiaryList(){

return myDiaryList;

}

//public static String viewDiaryList(){

//return myDiaryList;
//}

}