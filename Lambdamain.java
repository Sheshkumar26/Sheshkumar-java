interface in1
{
boolean test(int n);
boolean test(int m);

}

class LambdaMain{
public static void main(String[]args){


  in1 isFactor;
  isFactor=(n,m)-> {

if(n%m == 0)

return true;

else 
return false;
}
}
};