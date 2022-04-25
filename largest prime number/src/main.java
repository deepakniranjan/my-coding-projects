public class main{
    public static void main(String[]arg){
        int max=0;
        value(45);
        value(21);
        value(217);

    }
    public static void value(int a){
        int max=0;
        int count=0;
        for(int i=2;i<a+1;i++){
               if(abc(i,a)==true){
                   max=i;
                   count++;
               }
        }
        System.out.println("The largest prime factor of " + a + " is =" + max+'\n'+"*********************");
    }
    public static boolean abc(int a,int given) {
        int count = 0;
        int max = 0;
        for (int j = 2; j < a; j++) {
            if (a % j == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            if (given % a == 0) {
                if (max < a) {
                    max = a;
                    //System.out.println("The largest prime factor of " + given + " is =" + max);
                    return true;
                }
            }
        }
        return false;
    }

}