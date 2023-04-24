import java.util.Scanner;
 //no return type and no argument type
 class Volume{
            int l;
             int h=10;
            int w;
            void get_data(){
                Scanner sky=new Scanner(System.in);
                System.out.println("Enter the dimensions");
                l=sky.nextInt();
                h=sky.nextInt();
                w=sky.nextInt(); 
            }
            void print_data(){
                System.out.println(l);
                    System.out.println(h);
                    System.out.println(w);
            }
 }

                class MainVol{
                public static void main(String[] args){
                    Scanner sky=new Scanner(System.in);
                    
                    Volume v =new Volume();
                    Volume v1 =new Volume();
                //calling    
                v.get_data();
                v.print_data();
                 v1.get_data();
                 v1.print_data();
                }
                
                }
                
           // what is call by value and what is recursion and 
//no return type and no argument type 
//no return type and no return type
//with return type and no argument type
