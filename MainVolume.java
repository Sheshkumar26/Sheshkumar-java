import java.util.Scanner;
 
 class Volume{
            int l;
            public int h;
            static int w;
 }
                class MainVolume{
                    
                public static void main(String[] args){
                    
                    Scanner sky=new Scanner(System.in);
                    
                    Volume v =new Volume();
                    Volume v1 =new Volume();
                    
                     v.l=sky.nextInt();
                  v.h=sky.nextInt();
                      Volume.w=sky.nextInt();
                    v1.l=sky.nextInt();
                    v1.h=sky.nextInt();
                    System.out.println(v.l);
                    System.out.println(v.h);
                    System.out.println(Volume.w);
                    System.out.println(v1.l);
                    System.out.println(v1.h);
                    System.out.println(v.w);
                     System.out.println(v1.w);
                }
                
                }
                
            