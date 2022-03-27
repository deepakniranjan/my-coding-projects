public class main {
    public static void main (String[]arg){
      kb(2500);
      kb(3500);
      kb(8424);
      kb(-12234);
    }
    public static void kb(int kilobytes){
        if(kilobytes<0){
            System.out.println("INVALID NUMBER");
        }else{
            int a=(kilobytes/1024);
            int b=(kilobytes%1024);
            System.out.println( kilobytes+"KB" +" = "+a+"MB AND "+b+"KB" );
        }
    }
}