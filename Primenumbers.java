public class Primenumbers {
    
    public static class Prime {
        
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int loopCounter = 0; 
        
        void checkPrime(int value) {
            loopCounter++;
            int primeCounter = 0; boolean isPrime = false;
            for (int i = 1; i <= value; i++) {
                if (value % i == 0) {
                    primeCounter++;
                }
                
                if (primeCounter > 2) {
                    isPrime = false; break;
                } else if (primeCounter == 2) {
                    isPrime = true;
                }
                
            }
            
            if (isPrime) {
                arrayList.add(value);
                
            }
            if (loopCounter == 4) {
                // do nothing
            } else {
                printArrayItems();  
            } 
                
            
        }
        
        void printArrayItems() {
            for (Integer item : arrayList) {
                System.out.print(item + " ");
            }
            System.out.println("");
        }
            
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        Prime prime = new Prime();
        while(scanner.hasNextInt()) {
            prime.checkPrime(scanner.nextInt());   
        }
           
    }
}