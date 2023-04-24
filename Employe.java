import java.util.Scanner;
class Employe
{
int eid;
char rank;

void get_employedetails()
{
Scanner sc = new Scanner(System.in);
System.out.print(" Enter the eid: " );
eid = sc.nextInt();
System.out.print(" Enter the rank: ");
rank = sc.next().charAt(0);
}

void print_employedetails()
{
System.out.println("employe id = " + eid);
System.out.println("employe rank = " + rank);
}

public static void main (String[] args)
{
employee emp[] = new employe[5];
for (int i=0; i<5; i++)
{
emp[i] = new employe();
emp[i].get_employedetails();
}

for (int i=0; i<5; i++)
{
emp[i].print_employedetails();
}
}
}