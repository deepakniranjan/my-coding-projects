public class speedconverter {
    public static long toMilesPerHour(double KilometerPerHour) {
        if (KilometerPerHour < 0) {
            return -1;
        }
        long milesperhour = Math.round(KilometerPerHour / 1.609);
        return milesperhour;
    }
                public static void printconversion(double KilometerPerHour){
                if(KilometerPerHour<0){
                    System.out.println("Invalid value");
                }

        }
    }

