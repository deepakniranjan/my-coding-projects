public class main {
    public static void main(String[]arg){
        getgcd(12,30);
        getgcd(25,15);
        getgcd(9,99);
        getgcd(81,153);
    }
    public static void getgcd(int first,int second){
        int rem1=0;
        int rem2=0;
        int ans=0;
        if(first>10&&second>10){
        for(int i=1;i<=first;i++){
                if(first%i==0) {
                   rem1=i;
                   for(int j=1;j<=second;j++){
                       if(second%j==0){
                           rem2=j;
                           if(rem1==rem2){
                               ans=rem2;
                           }
                       }
                   }
                }
        }
        System.out.println("The GCD of "+first+" and "+second+" is "+ans);
    }
        else
            System.out.println("The number sholud with in range >10");
    }
}
