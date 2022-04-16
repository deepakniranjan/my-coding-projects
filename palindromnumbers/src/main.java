public class main {
    public static void main(String[]arg){
       // compare(-121);
        //compare(3456);
        compare(32343);
    }
    public static int palindrom(int number){
        int reverse=0;
        while(number!=0){
            int a=number%10;
            reverse=(reverse*10)+a;
            number=number/10;
        }
        return reverse;

    }
    public static void compare(int number){
        int rev =palindrom(number);
        if(number==rev){
            System.out.println("the no."+number+" is palindrom ");
        }
        else
            System.out.println("the no."+number+" is NOT a palindrom ");
    }
}
