import java.io.*;

class StringBuilderMain
{
public static void main(String[]aargs)
{
StringBuilder sky=new StringBuilder();
sky.append("");
System.out.println(sky);
System.out.println(sky.capacity());
System.out.println(sky);

sky.insert(1,2,"The King Kohli era");
System.out.println(sky.capacity());
System.out.println(sky);
sky.replace(1,2,"");
System.out.println(sky.capacity());
System.out.println(sky);
sky.reverse(" ");
System.out.println(sky.capacity());
System.out.println(sky);
}
}