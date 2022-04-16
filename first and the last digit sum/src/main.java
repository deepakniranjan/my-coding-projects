public class main {
    public static void main(String[]arg){
    firstandlastsum(3434);
    firstandlastsum(22340);
    firstandlastsum(3573678);
    firstandlastsum(-12132);
    }
    public static void firstandlastsum(int number){
        int lastno=number%10;
       int firstno=number;
       if(number>0){
       while(number>10){
          firstno/=10;
           number/=10;
         }
       System.out.println("the sum of the 1st and last digit is ="+(lastno+firstno));
    }
    else
        System.out.println("the no. is less than 0");

    }

}
