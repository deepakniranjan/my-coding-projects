public class main {
    public static void main(String[]arg){
        sumdigits(125);
    }
    public static void sumdigits(int number){
        int sum=0;
        if(number<10){
            System.out.println("the no. should greater than >10");
        }
        while(number>0){
            int digit=number%10;
            sum+=digit;
            number=number/10;
        }
        System.out.println("the sum of the number of "+number+" is ="+sum );
    }
}
