public class main {
    public static void main(String[]arg){
        printequal(1,2,-1);
        printequal(1,1,1);
        printequal(2,3,4);
        printequal(1,2,2);

    }
    public static int printequal(int a,int b,int c){
        if(a<0||b<0||c<0){
            System.out.println("INVALID VALUE");
            return 1;
        }
        else if(a==b&&b==c&&c==a){
            System.out.println("ALL VALUES ARE EQUAL");
            return 2;
        }
        else if(a!=b&&b!=c&&c!=a){
            System.out.println("ALL VALUES ARE DIFFERENT");
            return 3;
        }
        else
            System.out.println("NEITHER EQUAL OR DIFFERENT");
            return 4;
    }
}
