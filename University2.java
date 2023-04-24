import java.util.Scanner;

class University{
int reg;
University(){
Scanner sky=new Scanner(System.in);
System.out.println("enter the registration number:"+reg);
reg=sky.nextInt();
}
void print(){
System.out.println("registration number:"+reg);
}
}
class details extends University{
String name;
char grade;
details(int a,String b,char c){
System.out.println("Details class constructor");
reg=a;
name=b;
grade=c;

}
void print(){
super.print();
System.out.println("name:"+name);
System.out.println("grade:"+grade);
}
}
public class University2 {
public static void main(String[] args) {
details d=new details(1,"Shesh Kumar",'A');
d.print();
d.print();

}