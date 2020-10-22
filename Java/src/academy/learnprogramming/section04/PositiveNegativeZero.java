package academy.learnprogramming.section04;

public class PositiveNegativeZero {
    public static void main(String[] args){
        System.out.println("User given number '0' is "+whatNumberis(0));
        System.out.println("User given number '1' is "+whatNumberis(1));
        System.out.println("User given number '-1' is "+whatNumberis(-1));
        System.out.println("User given number '100' is "+whatNumberis(100));
        System.out.println("User given number '-100' is "+whatNumberis(-100));
        System.out.println("User given number '000' is "+whatNumberis(000));
    }

    public static String whatNumberis(int userNumberIs){
        String numberValue = "Zero";
        if (userNumberIs > 0){
            numberValue = "Positive (+ve)";
        } else if (userNumberIs < 0){
            numberValue = "Negative (-ve)";
        }
        return numberValue;
    }
}
