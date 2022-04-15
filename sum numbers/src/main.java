public class main {
    public static void main(String[]arg){
        int count=0,a=0,sum=0,b=0;
        for(int i=1;i<=1000;i++){
           if (i%3==0 && i%5==0){
               System.out.println(i);
               sum=sum+i;
               count++;
               if(count==3){
                   break;
               }
           }
       }
        System.out.println("******************************"+"\nthe sum value of thess no. is "+sum);
}
}


