//aggregation in java

class Address
{
String city,state;
Address(String city,String state)
{
this.city=city; this.state=state;
}}

class student
{
int rollno;
String name;
String address;

student(int rollno, String name,String address)
{

this.rollno=rollno;  this.name=name; this.address=address;
{

void_show ()
{
System.out.println(rollno+" " +name);
System.out.println(address.city+ " " +address.state);//aggregation



class MainAddress 
{
public static void main(String[]args)
{

Address obj1=new Address("jalandhar", "Punjab");
student obj2=new student(10,"aa",obj1); obj2.show();
}
}
}