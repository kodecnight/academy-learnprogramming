package academy.learnprogramming.section03;

public class Operators {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int result = a + b;// 1 + 2 = 3
        System.out.println("value of a: "+a+", value of b: "+b+", their sum: "+result);

        //here following is the code for abbreviating operators
        result = result +1; //3 + 1 = 4
        System.out.println("result: "+result);
        result++; //4 + 1 = 5
        System.out.println("result: "+result);

        result = result - 1; // 5 - 1 = 4
        System.out.println("result: "+result);
        result--; // 4 - 1 = 3
        System.out.println("result: "+result);

        result = result + 5; // 3 + 5 = 8
        System.out.println("result: "+result);
        result += 5; //8 + 5 = 13
        System.out.println("result: "+result);

        result = result - 5; // 13 - 5 = 8
        System.out.println("result: "+result);
        result -= 5; //8 - 5 = 3
        System.out.println("result: "+result);

        result = result * 5; // 3 * 5 = 15
        System.out.println("result: "+result);
        result *= 5; // 15 * 5 = 75
        System.out.println("result: "+result);

        result = result / 5; // 75 / 5 = 15
        System.out.println("result: "+result);
        result /= 5; // 15 / 5 = 3
        System.out.println("result: "+result);

        result = result % 2; // 3 % 2 = 1
        System.out.println("result: "+result);
        result += 8;
        result %= 5; // 9 % 5 = 4
        System.out.println("result: "+result);

        boolean isAlien = false;
        if(isAlien == true) // if this is false following both statements are printed on system
            //if the above condition is validated against true only 2nd statement is printed
            System.out.println("There is no alien");
        System.out.println("I am scared of aliens");
        //if we need to include both of above print statements with if condition then we use code block
        //if(expression/condition){
        //......any number of statements
        //}

        if(isAlien == false){
            System.out.println("There is no alien");
            System.out.println("I am scared of aliens");
        }

        //logical operators are == (equal to), !=(not eaqual to), >(greater than), <(less than),
        // >=(greater than or equal to), <=(less than or equal to), &&(logical and), ||(logical or)
        // &, | are bit wise operators not logical and, logical or they have different functionality

        int myScore = 100;
        if(myScore == 100){ //condition is true
            System.out.println("my score is top score for condition equal to"); //this will be printed
        }

        if(myScore != 100){ //condition is false
            System.out.println("my score is top score for condition not equal to"); // this won't be printed
        }

        if(myScore > 100){ //condition is false
            System.out.println("my score is top score for condition greater than"); //not printed
        }

        if(myScore < 100){ //condition is false
            System.out.println("my score is top score for condition less than"); //not printed
        }

        if(myScore >= 100){ //condition is true
            System.out.println("my score is top score for condition greater than or equal"); // printed
        }

        if(myScore <= 100){ //condition is true
            System.out.println("my score is top score for condition less than or equal ");//printed
        }

        int nextMatchScore = 200;
        if(myScore == 100 && nextMatchScore>100){ //condition is true
            System.out.println("my score is top score for condition logical and"); //printed
        }

        if(myScore == 100 || nextMatchScore == 200){ //condition is true
            System.out.println("my score is top score for condition logical or"); //printed
        }

        //assignment operator and equal to operator
        int myNumber = 50; //here '=' is assignment operator which assigns value 50 to variable 'myNumber'
        if(myNumber ==50) {//condition is true, here we cannot use '=' should always use '==' for conditional check
            System.out.println("this statement will be printed");
        }

        boolean myBooleanValue = false;
        if(myBooleanValue = true){ // here for using assigment operator '=' this will not through error and the condition will become true
            //because the boolean variable carries value true/false and for if this servers perfect for condition check
            System.out.println("This will be printed");
        }

        //if will always checks for boolean value
        boolean isMyCarRed = false;
        if(!myBooleanValue){ //here ! is logical not operator
            System.out.println("This will be printed");
        }

        //ternary operator
        boolean wasMyCarWhite = isMyCarRed ? false : true;
        System.out.println("My honda car was white in color: "+wasMyCarWhite);

        //challenge
        double myFirstValue = 20.00;
        double mySecondValue = 80.00;
        double resultValue = (myFirstValue + mySecondValue) * 100.00;// if () are not used then second value is multiplied first then
        //added with first value and the value would be '8020' instead of '10000'
        System.out.println("Result value before checking reminder: "+resultValue);
        resultValue %= 40.00;
        System.out.println(resultValue);

        boolean myNewBooleanValue = (resultValue ==0) ? true : false;
        System.out.println("myNewBooleanValue :"+myNewBooleanValue);

        if(!myNewBooleanValue){
            System.out.println("Got some reminder: "+resultValue);
        } else {
            System.out.println("There is no reminder");
        }
    }
}
