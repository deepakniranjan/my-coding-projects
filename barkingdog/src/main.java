public class main {
    public static void main(String[]arg){
        wakeup(true,7);
        wakeup(true,27);
        wakeup(false,10);
        wakeup(true,22);
        wakeup(true,3);
        wakeup(false,21);
        wakeup(true,30);
        wakeup(true,-2);

    }
    public static void wakeup(boolean barking,int time) {
        if (barking && ((time < 8 && time>1) || time == 23)) {
            System.out.println("true,should wake up" + ",  time = " + time);
        }   else if(barking && (time >8 && time<23))
            System.out.println("barking but it is day time"+",  time= "+time );
        else if(!barking&&(time>=1 && time<=23))
            System.out.println("the dog is not barking rgt now"+",  time ="+time);
        else
            System.out.println("invalid please give a proper time"+",  time = "+time);

        }
    }

