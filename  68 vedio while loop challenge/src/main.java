public class main {
    public static void main(String[]arg){
        int number=4;
        int final_num=20;
        int count=0;
        int sum=0;
        while(number<=final_num){
            number++;
            if(!isevennumber(number)){
                continue;
            }
            sum++;
            System.out.println(number);
            count++;
            if(count==5){
                break;
            }
        }
        System.out.println("total sum =  "+sum);

    }
    public static boolean isevennumber(int num){
        if(num%2==0)
            return true;
        else
                return false;
    }
}
