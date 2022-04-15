public class main {
    public static void main(String[]arg){
        number(10);
        number(11);
        number(3);

    }
    public static void number(int n){
        int count=0,i;
        for(i=2;i<n/2;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0&&n!=1){
            System.out.println(n+" is a prime number");
        }
        else
            System.out.println(n+" is not a prime number");
    }
}