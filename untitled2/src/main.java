public class main {
    public static void main(String[]arg) {
        arithmetic(4,2);
        arithmetic(5,10);
        arithmetic(12,24);
    }
    public static void arithmetic(int a,int b){
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a%b;
        System.out.println("sum ="+sum+
                '\n'+"sub ="+sub+
                '\n'+"mul ="+mul+
                '\n'+"div ="+div +'\n'+'\n' );
    }
}
