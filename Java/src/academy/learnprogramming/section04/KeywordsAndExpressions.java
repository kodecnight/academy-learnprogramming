package academy.learnprogramming.section04;

public class KeywordsAndExpressions {
    public static void main(String[] args) {
        //expression is combination of variables, vales and operators does not include the datatype
        //1 mile is 1.609344 kilometers
        double myDistance = (100 * 1.609344);
        System.out.println("100 miles in kilometers :"+myDistance);

        int myScore = 100; // here 'myScore = 100' is an expression
        if(myScore == 100){ // here 'myScore == 100' is an expression
            System.out.println("You got high score");// here 'You got high score' is an expression
            myScore = 0; //here 'myScore = 0' is an expression
        }
    }
}
