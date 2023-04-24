class Dog 
{
 protected String name;

public Dog(String name){
this.name= name;

}
public String getname()
{
return name;
}

public String speak()
{
return "Barks";
}

public class labrador extends Dog
{
private String color;

public labrador(String color){
this.color=color;
}

public String speaks(String speaks)
{

this.speaks=speaks;
}
public labrador (String color,String speaks){

String color="Black";
String speaks="ZZZZZzz";

}
}
class MainDog
{
public static void main(String[]args)

{
 
Dog d=new Dog(color,speaks);
System.out.println(d);

}
}
}







 


