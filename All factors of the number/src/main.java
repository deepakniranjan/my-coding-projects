public class main {
    public static void main(String[]arg){
      factors(32);

    }
    public static void factors(int number){
        int sum=0;

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i+" ");
                }
            }

        }
    }

