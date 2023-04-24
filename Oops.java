import java.util.*;

class Ball{
String color;
String type;

public void play(){
System.out.println("cricket");
}

public void printcolor(){
System.out.println(this.color);
}
public void printtype(){
System.out.println(this.type);
}
}
public class Oops{

public static  void main(String [] args){

Ball Ball1=new Ball();

Ball1.color="Red";
Ball1.type="leather";

Ball Ball2=new Ball();

Ball2.color="white";
Ball2.type="tennis";

Ball1.play(); 
Ball1.printcolor();
Ball1.printtype();
Ball2.printcolor();
Ball2.printtype();
}
}
