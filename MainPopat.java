import java.util.*;

class Popat
{

 String name;
String hometown;
String state;
String university;
int age;


public void Details() {
System.out.println("character");
}

public void printname(){
System.out.println(this.name);
}
public void printhometown(){
System.out.println(this.hometown);
}
public void printstate(){
System.out.println(this.state);
}
public void printuniversity(){
System.out.println(this.university);
}
public void printage(){
System.out.println(this.age);
}
}

public class MainPopat{
public static void main(String[]args)
{
  Popat popat1=new Popat();
popat1.name="Afzal";
popat1.hometown="Sitamarhi";
popat1.state="Bihar";
popat1.university="LPU";
popat1.age=21;

Popat popat2=new Popat();
popat2.name="Aniket";
popat2.hometown="Harnaut";
popat2.state="Bihar";
popat2.university="LPU";
popat2.age=21;

popat1.printname();
popat2.printname();
popat1.printuniversity();
popat2.printage();
popat1.printstate();

}
}
