package academy.learnprogramming.section04;

public class SpeedConverter {
    public static void main(String[] args){
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(24.42));
        System.out.println(toMilesPerHour(95.75));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(24.42);
        printConversion(95.75);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        } else {
            return (long)Math.round((0.622*kilometersPerHour));
        }
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour+" km/h = "+Math.round((0.622*kilometersPerHour))+" mi/h");;
        }
    }
}
