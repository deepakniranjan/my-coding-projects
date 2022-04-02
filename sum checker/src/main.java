public class main {
    public static void main(String[]arg) {
        System.out.println(numbers(1,2,3));
        System.out.println(numbers(1,6,7));
        System.out.println( numbers(7,0,7));
        System.out.println( numbers(-5,5,0));
        System.out.println(numbers(9,10,5));
        }
    public static boolean numbers(int first,int second,int third ){
        int sum=(first + second);
        if (sum==third){
            return true;
        }
        else{
            return false;
        }
    }
}
