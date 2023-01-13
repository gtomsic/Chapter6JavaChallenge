public class PositiveNegativeZero {

    public static void main(String[] args) {
    //        System.out.println(hasTeen(14, 23, 34));
    }

//    FIRST CHALLENGE COMPLETE
//    public static long toMilesPerHour(double kilometersPerHour) {
//        double milesPerHouse = 1.609d;
//        double result = kilometersPerHour / milesPerHouse;
//
//        if (result < 0) {
//            return -1;
//        }
//
//        result = Math.round(result);
//
//        return (long) result;
//    }
//
//    public static void printConversion(double kilometersPerHour) {
//        long milesPerHour = toMilesPerHour(kilometersPerHour);
//        int defaultValue = 0;
//        if(kilometersPerHour < 0 ) {
//            System.out.println("Invalid Value");
//        }  else {
//            System.out.println(kilometersPerHour + " km/h = " + milesPerHour  + " mi/h");
//        }
//    }

//    SECOND CHALLENGE COMPLETE
//   public static void printMegaBytesAndKiloBytes(int kiloBytes) {
//        long oneMegabytes = 1024;
//        if(kiloBytes < 0) {
//            System.out.println("Invalid Value");
//        } else {
//            System.out.println(kiloBytes + " KB = " +  kiloBytes / oneMegabytes + " MB and " + kiloBytes % oneMegabytes + " KB" );
//        }
//   }

//    THIRD CHALLENGE COMPLETE
//    public static boolean shouldWakeUp(boolean isDogBarking, int hourOfDay) {
//        if((hourOfDay >= 0) && (hourOfDay <= 23)) {
//            if((hourOfDay < 8 || hourOfDay > 22) && isDogBarking) {
//                return true;
//            } else {
//                return  false;
//            }
//        }
//        return false;
//    }

//    FOURTH CHALLENGE COMPLETE
//    public static boolean isLeapYear(int year) {
//        if(year > 0 && year < 10000) {
//            if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
//                return true;
//            } else {
//                return false;
//            }
//        } else {
//            return false;
//        }
//    }
//
//    FIFTH CHALLENGE COMPLETE
//    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
//        double firstNumbMove = (long) (firstNum * 1000);
//        double secondNumMove = (long) (secondNum * 1000);
////        System.out.println((double) firstNumbMove / 1000 + " == " + (double) secondNumMove / 1000);
//        if(((double) firstNumbMove / 1000 )== ((double) secondNumMove / 1000)) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    SIX CHALLENGE COMPLETE
//    public static boolean hasEqualSum(int firstNum, int secondNum, int result) {
//        int sum = firstNum + secondNum;
//        if(sum == result) {
//            return true;
//        }
//        return false;
//    }

//    SEVEN CHALLENGE COMPLETED
//    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
//        if(isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge)) {
//            return true;
//        }
//        return false;
//    }
//
//    public static boolean isTeen(int age) {
//        if(age >= 13 && age <= 19) {
//            return true;
//        }
//        return false;
//    }
}
