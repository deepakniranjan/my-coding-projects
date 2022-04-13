public class main {
    public static void main(String[]arg){
        iscatplaying(true,10);
        iscatplaying(false,36);
        iscatplaying(false,35);
        iscatplaying(true,42);
        iscatplaying(false,24);
        iscatplaying(true,33);

    }
    public static int finalmsg(){
        System.out.println("the cat is playing");
        return 0;
    }
    public static int iscatplaying(boolean summer,int temperature){
        if (!summer&&(temperature>25&&temperature<=35)){
           finalmsg();
            return 1;
        }
        else if (summer&&(temperature>25&&temperature<45)) {
            finalmsg();
            return 2;
        }
        else
            System.out.println("cat is not playing");
            return 3;
    }

}
