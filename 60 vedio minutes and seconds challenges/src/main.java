public class main {
        public static void main(String[]arg){
            System.out.println( getduration(62,50));
            System.out.println(getduration(190,48));
            System.out.println(getduration(400,40));
            System.out.println( getduration(100,-26));
            System.out.println(getduration(7600));
            System.out.println(getduration(3000));
        }
        public static String getduration(int minutes,int seconds){
        if (minutes<0||seconds<0||seconds>59){
                return "INVALID";
        }
            int hours = minutes / 60;
            int min = minutes % 60;
            return hours + "hr :" + +min + "min :" + seconds + "sec";

        }
        public static String getduration(int seconds){
           if(seconds<0) {
               return "INVALID";
           }
               int minutes = seconds / 60;
               int sec = seconds % 60;
            return getduration(minutes, sec);
           }
}
