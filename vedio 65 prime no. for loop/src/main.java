public class main {
    public static void main(String[] arg) {
        int count=0;
        for(int i=10;i<50;i++){
            if(isprime(i)){
                System.out.println(i+"is a prime no.");
                count++;
                if(count==6){
                    break;
                }
            }
        }
    }
    public static boolean isprime(int n) {
        if(n==0){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}







