package academy.learnprogramming.section01;

public class ByteShortIntLong {
    public static void main(String[] args) {
        // write your code here
        int myValue = 10000;
        int myValue2 = 10_000; //we can put underscore to numbers for making them easily readable and is called literal number

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte min value:" + myByteMinValue);
        System.out.println("Byte max value:" + myByteMaxValue);
        System.out.println("Busted max byte value:" + (myByteMaxValue + 1)); //this is the example for overflow
        System.out.println("Busted min byte value:" + (myByteMinValue - 1)); //this is the example for underflow
        System.out.println("Byte occupies a memory size of 8 bits");

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("\n"+"Short min value:" + myShortMinValue);
        System.out.println("Short max value:" + myShortMaxValue);
        System.out.println("Busted max short value:" + (myShortMaxValue + 1)); //this is the example for overflow
        System.out.println("Busted min short value:" + (myShortMinValue - 1)); //this is the example for underflow
        System.out.println("Short occupies a memory size of 16 bits");

        int myIntegerMinValue = Integer.MIN_VALUE;
        int myIntegerMaxValue = Integer.MAX_VALUE;
        System.out.println("\n"+"Integer min value:" + myIntegerMinValue);
        System.out.println("Integer max value:" + myIntegerMaxValue);
        System.out.println("Busted max integer value:" + (myIntegerMaxValue + 1)); //this is the example for overflow
        System.out.println("Busted min integer value:" + (myIntegerMinValue - 1)); //this is the example for underflow
        System.out.println("Int occupies a memory size of 32 bits");

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("\n"+"Long min value:" + myLongMinValue);
        System.out.println("Long max value:" + myLongMaxValue);
        System.out.println("Busted max long value:" + (myLongMaxValue + 1)); //this is the example for overflow
        System.out.println("Busted min long value:" + (myLongMinValue - 1)); //this is the example for underflow
        System.out.println("Long occupies a memory size of 64 bits");

        long myLongValue = 100L;// cap 'L' at the end of the number helps to understand that the number is of type long
        long myBigLongNonLiteral = 2_147_483_647;// this doesn't through error as the value is max value for integer
        // and java is smart enough to convert this into long
        long myBigLongLiteral = 222_147_483_647L; //if not plated L at the end will through error,
        // as the value is bigger than max integer value

        int myNewIntValue = (myIntegerMinValue/2);
        byte myNewByteValue = (byte) (myByteMinValue/2); //explicitly telling system to treat the result as byte - casting
        short myNewShortValue = (short) (myShortMinValue/2);

        System.out.println("\n"+"Byte value after casting:" + myNewByteValue);
        System.out.println("Short value after casting:" + myNewShortValue);

    }
}
