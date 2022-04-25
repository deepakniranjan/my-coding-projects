public class main {
    public static void main(String[]arg){
        words(106);
        words(234);
        words(678);
        words(100);

    }
    public static int reversenumber(int number){
        int sum=0;
        for(int i=number;i!=0;i/=10){
            int a=i%10;
            sum=(sum*10)+a;
        }
        return sum;
    }
    public static void words(int number1){
        int m=0;
        number1=reversenumber(number1);
        for(int i=number1;i!=0;i/=10){
            m=i%10;
            switch(m) {
                case 0:
                    System.out.print("zero ");
                    break;
                case 1:
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
            }
        }
        System.out.println("");
    }
}
