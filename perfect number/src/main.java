public class main {
    public static void main(String[]arg){
        perfetcnum(6);
        perfetcnum(-9);
        perfetcnum(32);
        perfetcnum(5);
        perfetcnum(28);

    }
    public static void perfetcnum(int number){
        int sum=0;
        if(number>0){
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum=sum+i;
            }
        }
        if(sum==number)
            System.out.println("The number "+ number +" is a perfect square ");
            else
            System.out.println("The number "+ number+" is not a perfect square ");

    }
        else
            System.out.println("invalid");
    }
}
