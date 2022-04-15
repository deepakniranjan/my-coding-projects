public class main {
    public static void main(String[]arg){
     sumodd(1,100);
     sumodd(-1,100);
     sumodd(100,100);
     sumodd(13,13);
     sumodd(100,1000);
     sumodd(100,10);
    }
    public static boolean isodd(int number){
        if(number<0){
            return false;}
        if(number%2!=0){
            return true;
        }
        else
            return false;
    }
    public static void sumodd(int start,int end) {
        int sum = 0;
        if (start<0||end<0){
            System.out.println("start and end number sholud be greater than 0");

        }
        int a = start;
        if (start>0 && end>0 && start < end) {
            for (int i = a; i <= end; i++) {
                if (isodd(i)) {
                    sum += i;
                    if (a > end) {
                        break;
                    }
                }
            }
            System.out.println("the sum of odd numbers in betweeen " + start + " and " + end + " = " + sum);
        }
        if(start==end){
            if(isodd(start)){
                System.out.println("these two numbers "+start+" and "+end+"are equal and the number is odd");
            }
            else
                System.out.println("these two numbers "+start+" and "+end+"are equal but it is not a odd no.");
        }
        if(start>end){
            System.out.println("start number must be greater than end no. ");
        }
    }
}
