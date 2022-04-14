public class main {
    public static void main(String[]arg){
        get_day_in_month(1,2020);
        get_day_in_month(2,2000);
        get_day_in_month(2,2012);
        get_day_in_month(2,2016);
        get_day_in_month(2,2001);
        get_day_in_month(2,2005);
        get_day_in_month(3,-2002);
    }
    public static int isyearleap(int lyear) {
        if((lyear<9999 && lyear>1) && (((lyear%4==0)&&lyear%100!=0) || (lyear%400==0)))
            return 1;
        else if((lyear<9999 && lyear>1) && (((lyear%4!=0)&&lyear%100==0) || (lyear%400!=0)))
            return 2;
        else
            return 3;
        }
    public static void get_day_in_month(int month,int year){
        int years=isyearleap(year);
        if(month>1&&month<12) {
            switch (years) {
                case 1:
                    switch (month) {
                        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                            System.out.println("In " + month + " month has 31 ");
                            break;
                        case 2:
                            System.out.println("In " + month + " month has 28 days since" + year + "is NOT A LEAP YEAR");
                            break;
                        case 4: case 6: case 9: case 11:
                            System.out.println("In " + month + " month has 30 days");
                            break;
                    }
                    break;
                case 2:
                    switch (month) {
                        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                            System.out.println("In " + month + " month has 31 ");
                            break;
                        case 2:
                            System.out.println("In " + month + " month has 29 days since" + year + "is A LEAP YEAR");
                            break;
                        case 4: case 6: case 9: case 11:
                            System.out.println("In " + month + " month has 30 days");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("pls enter a valid year b/w 1-9999");
                    break;
            }
        }

    }
    }

