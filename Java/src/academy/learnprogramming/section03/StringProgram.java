package academy.learnprogramming.section03;

public class StringProgram {
    public static void main(String[] args) {
        // here listed are my 8 primitive datatypes in Java
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        //in java there is a most commonly used non primitive datatype 'String' that is actually a class
        String myString = "\"Avinash Mandalapu\"";
        System.out.println("My name is "+myString);
        String myNumberString = "1313";
        String myNumberString2 = "1035";

        System.out.println(myNumberString+myNumberString2);

        int myIntNumber = Integer.parseInt(myNumberString);
        int myIntNumber2 = Integer.parseInt(myNumberString2);
        int myNumber = 13;
        int myNumber2 = 13;
        int myTotal = myIntNumber+myIntNumber2;
        int myTotal2 = myNumber+myNumber2;
        System.out.println("\n"+myIntNumber+myIntNumber2);
        System.out.println("\n"+myTotal);
        System.out.println("\n"+myNumber+myNumber2);
        System.out.println("\n"+myTotal2);
        //String is immutable in java, any action is performed on the string will create a new string by discarding the old string memory
        //we cannot delete characters from a string once declared, on functions performed a new string is created.
    }
}
