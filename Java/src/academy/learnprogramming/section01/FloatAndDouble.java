package academy.learnprogramming.section01;

public class FloatAndDouble {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My min float value: "+myMinFloatValue);
        System.out.println("My max float value: "+myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("\nMy min double value: "+myMinDoubleValue);
        System.out.println("My max double value: "+myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25; //we can try using casting
        float myFloatValue2 = 5.25F; //we can try using placing 'F' at the end of value, best way to use than casting
        double myDoubleValue = 5.25D; //just like integer we can just have the value and system can understand as we had included the datatype

        int myIntValue2 = 5/3;
        float myFloatValue3 = 5f/3f;
        double myDoubleValue2 = 5d/3d;
        double myDoubleValue3 = 5.00/3.00;//cab also do in this way
        System.out.println("\nMy int value: "+myIntValue2);
        System.out.println("My float value: "+myFloatValue3);
        System.out.println("My double value: "+myDoubleValue2);
        System.out.println("My double value2: "+myDoubleValue3);

        //converting giving value of pounds to kilograms

        int myPoundValue = 20;
        double myKilogramValue = (myPoundValue * 0.45359237);

        System.out.println("\nValue of "+myPoundValue+" pounds, is equals to "+myKilogramValue+" kilograms");
    }
}
