package academy.learnprogramming.section01;

public class Challenge {
    public static void main(String[] args){
        byte myByteValue = 54;
        short myShortValue = 123;
        int myIntValue = 1313;
        long myLongValue = 50000L + ((myByteValue + myShortValue + myIntValue) * 10L);

        System.out.println("Byte value: "+myByteValue);
        System.out.println("Short value: "+myShortValue);
        System.out.println("Int value: "+myIntValue);
        System.out.println("Long value: "+myLongValue);
    }
}
