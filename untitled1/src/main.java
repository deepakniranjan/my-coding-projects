public class main {
    public static void main(String[]arg){
     whsum(125);
    }
  //  public static void sumdigits(int number){
  //    int sum;
  //      for(sum=0;number!=0;number/=10)
  //    {
  //      sum=sum+(number%10);
  //}
  //System.out.println("the sum of the no. is ="+sum);
  //}
    public static void whsum(int number){
        int sum=0;
        while(number!=0){
            sum=sum+(number%10);
             number/=10;
        }
        System.out.println("the sum of the no. is ="+sum);
    }
}
