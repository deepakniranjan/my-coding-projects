public class main {
    public static void main(String[]arg){
    leapyear(1901);
    leapyear(2001);
    leapyear(2400);
    leapyear(1700);
    leapyear(1800);
    leapyear(1900);
    leapyear(2012);
    leapyear(2200);
    leapyear(2500);
    leapyear(2600);
    leapyear(-1600);
    }
    public static int leapyear(int year)
    {
        if ((year <9999 && year >1) &&(((year % 4) == 0 && (year % 100)!= 0) || (year % 400 == 0))) {
            System.out.println(year + " is a LEAP YEAR ");
            return 1;
        }
        else if ((year <9999 && year >1) &&(((year % 4) != 0 && (year % 100== 0)) || (year % 400 != 0)))
        {
            System.out.println(year + " is NOT A LEAP YEAR ");
            return 2;
        }
        else {
        System.out.println("pls enter year between 1-9999");
        return 3;
        }
        }

    }

