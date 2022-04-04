public class main {
    public static void main(String[]arg){
        System.out.println(teen(15,30,40));
        System.out.println(teen(40,50,60));
    }
    public static boolean teen(int one,int two,int three){
     if((one>13&&one<19)||(two>13&&two<19)||(three>13&&three<19))
     {
     return true;
     }
        else
        {
         return false;

        }
    }
}
