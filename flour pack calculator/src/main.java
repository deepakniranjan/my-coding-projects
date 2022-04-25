public class main {
    public static void main(String[]arg){
        pack(2,4,11);
        pack(3,1,13);
        pack(1,0,4);
        pack(1,0,5);
        pack(2,2,11);
        pack(3,2,12);
        pack(-4,6,80);
        pack(5,2,0);
    }
    public static void pack(int big,int small,int goal){
        int i_value=0;
        int smallvalue=0;
       int bigbag= big*5;
       int smallbag=small*1;
       if(bigbag==goal){
           System.out.println("TRUE since, bigback :- "+bigbag+"kgs and smallbag :- "+smallbag +", CAN fill goal: "+goal);
       }
        else if(big>=0&&small>=0&&goal>0){
                for (int i =0;i<=goal;i+=5){
                    i_value=i;
                    if(i==bigbag)
                        break;
                }
            int remd=goal-i_value;
            if(smallbag>=remd){
                System.out.println("TRUE since, bigback :- "+i_value+"kgs and smallbag :- "+smallbag +", CAN fill goal: "+goal);
            }else
                System.out.println("FALSE since, bigback :- "+i_value+" and smallbag :- " +smallbag +", canot fill goal: "+goal);
            }
        else
            System.out.println("invalid no.");
    }
 }
