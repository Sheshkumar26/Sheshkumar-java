class Stats<T extends Number>
{
T[] nums;

Stats(T[] o)
{
nums = o;
}
double average()
{

double sum = 0.0;
for(int i = 0;i<nums.length;i++)
sum+=nums[i].doubleValues();
return sum/nums.length;}

boolean sameAvg(Stats<?> ob)

{
if (average()== ob.avergae())
return true ;
else

return false;
}
}

class BoundDemo
{
public static void main(String[]args)
{

Integer inums[]={1,2,3,4,5};
Stats<Integer> iob=new Stats<Integer>(inums);
System.out.println("average of Integer is:" +iob);

double dnums[]={1.2,2.3,3.4,4.5,5.6};
Stats<Double> dob=new Stats<Double>(dnums);
System.out.println("average of Double is:" +dob);


System.out.println("same Average:" +iob.average(dob));

}
}