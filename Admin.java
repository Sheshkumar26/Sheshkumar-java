import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.*;

class Admin {
    
    private String username;
    private String password;
    
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    // getters and setters for the fields
    
    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    
    public void addData(Dictionary<Integer, String[]> dictionary,int id) {
        Scanner input=new Scanner(System.in);
        String s1=input.nextLine();
        String s2=input.nextLine();
        String s3=input.nextLine();
        dictionary.put(id, new String[] {s1, s2, s3});
    }
    public void editData(Dictionary<Integer, String[]> dictionary,int id) {
        System.out.println("edit");

    }
    public void deleteData(Dictionary<Integer, String[]> dictionary,int id) {
        dictionary.remove(id);
        System.out.println("REMOVED THE ELEMENT");

    }
}

public class demop {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        Dictionary<Integer, String[]> train = new Hashtable<>();
        Dictionary<Integer, String[]> bus = new Hashtable<>();
        Dictionary<Integer, String[]> airplane = new Hashtable<>();

        Admin a1=new Admin("abcd","a1b2c3");
        if((a1.authenticate("abcd", "a1b2c3"))==true){
            System.out.println("abc");

            boolean conti=true;
            while(conti){

                System.out.println("==============<<SELECT>>=============\n 1: TO ADD DATA \n 2: TO EDIT DATA \n 3: TO DELETE DATA \n OR ANY OTHER KEY TO EXIT \n=====================================");

                int choice=input.nextInt();
                
                if(choice==1){
                    System.out.println("==================<<ADDING DATA>>===================");
                    System.out.println("==============<<SELECT>>=============\n 1: FOR TRAIN \n 2: FOR BUS \n 3: FOR AIRPORT \n=====================================");
                    int select=input.nextInt();
                    if(select==1){
                        System.out.println("========<<ENTER TRAIN_NUMBER, NAME, DATE AND TIME>>=========");
                        int id=input.nextInt();
                        a1.addData(train,id);
                    }
                    else if(select==2){
                        System.out.println("========<<ENTER BUS_NUMBER, NAME, DATE AND TIME>>=========");
                        int id=input.nextInt();
                        a1.addData(bus,id);
                    }
                    else if(select==3){
                        System.out.println("========<<ENTER AIRPLANE_NUMBER, NAME, DATE AND TIME>>=========");
                        int id=input.nextInt();
                        a1.addData(airplane,id);
                    }
                    else{
                        System.out.println("Wrong choice");
                    }
                    
                }
                else if(choice==2){
                    System.out.println("==================<<EDITING DATA>>===================");
                    System.out.println("========<<ENTER TRANSPORT_NUMBER, NAME, DATE AND TIME>>=========");
                    System.out.println("==============<<SELECT>>=============\n 1: FOR TRAIN \n 2: FOR BUS \n 3: FOR AIRPORT \n=====================================");
                    int select=input.nextInt();
                    if(select==1){
                        // int id=input.nextInt();
                        // if (train.containsKey(id)) {
                        //     a1.editData(train,id);
                        //   } else {
                        //     System.out.println(id + " is train number is not present in data base");
                        //   }
                    }
                    else if(select==2){
                        int id=input.nextInt();
                        
                        a1.editData(bus,id);
                    }
                    else if(select==3){
                        int id=input.nextInt();
                        a1.editData(airplane,id);
                    }
                    else{
                        System.out.println("Wrong choice");
                    }
                }
                else if(choice==3){
                    System.out.println("==================<<DELETING DATA>>===================");
                    System.out.println("==============<<SELECT>>=============\n 1: FOR TRAIN \n 2: FOR BUS \n 3: FOR AIRPORT \n=====================================");
                    int select=input.nextInt();
                    if(select==1){
                        System.out.println("========<<ENTER TRAIN_NUMBER>>=========");
                        int id=input.nextInt();
                        a1.deleteData(train,id);

                    }
                    else if(select==2){
                        System.out.println("========<<ENTER BUS_NUMBER>>=========");
                        int id=input.nextInt();
                        a1.deleteData(bus,id);
                    }
                    else if(select==3){
                        System.out.println("========<<ENTER AIRPLANE_NUMBER>>=========");
                        int id=input.nextInt();
                        a1.deleteData(airplane,id);
                    }
                    else{
                        System.out.println("WRONG CHOICE");
                    }
                }
                else{
                        conti=false;
                    
                }
            }
        }
        // Integer key = entry.getKey();
        // String[] values = entry.getValue();
        // System.out.println("Key: " + key + " Values: " + Arrays.toString(values));
        // string [] k valueA = dictionary.get(1);
        // System.out.println("Value of A: " + valueA);



        System.out.println("select 1,2,3 you want if you want to see the records of train bus airplane respectively:");
        int s=input.nextInt();
        if (s==1){
            Enumeration<Integer> keys = train.keys();
            while (keys.hasMoreElements()) {
                Integer key = keys.nextElement();
                String[] value = train.get(key);
                System.out.println("transport id: " + key);
                System.out.println("details: " + Arrays.toString(value));
            }
        }
        
    }
}