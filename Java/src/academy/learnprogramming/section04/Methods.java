package academy.learnprogramming.section04;

public class Methods {
    public static void main(String[] args) {
        /*boolean isGameOver = true;
        int levelScore = 5000;
        int completedLevel = 120;
        int unCompletedLevel = 100;
        int completedBonus = 100;
        int unCompletedBonus = 100;
        int myTotalCompletedScore = 0,
                myTotalUnCompletedScore =0;*/

        int finalScore = calculateScore(true, 5000,120,100,100,100);
        System.out.println("Final Score is: "+finalScore);

        calculateScore(false,5000,8,5,200,100);

        boolean isNewGameOver = true;
        int newLevelScore = 5000;
        int newCompletedLevel = 8;
        int newUnCompletedLevel = 5;
        int newCompletedBonus = 200;
        int newUnCompletedBonus = 100;
        int newMyTotalCompletedScore = 0,
                newMyTotalUnCompletedScore =0;

        if(isNewGameOver){
            newMyTotalCompletedScore = (newLevelScore * newCompletedLevel) * newCompletedBonus;
            System.out.println("New game is completed with level "+newCompletedLevel+" and with a score of "+newMyTotalCompletedScore+".");
        } else {
            newMyTotalUnCompletedScore = (newLevelScore * newUnCompletedLevel) * newUnCompletedBonus;
            System.out.println("You are yet to complete the new game to get a final score. But the score till  level "+newUnCompletedLevel+" is "
                    +newMyTotalUnCompletedScore+".");
        }

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Avinash", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("David", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Tim", highScorePosition);
    }

    // here in the above main method we had repeated the same code with different values, to reduce the
    //effort of this we can use methods

    public static int calculateScore(boolean isGameOver, int levelScore, int completedLevel, int unCompletedLevel,
                                     int completedBonus, int unCompletedBonus){

        int myTotalCompletedScore = 0,
                myTotalUnCompletedScore =0;

        if(!isGameOver){
            myTotalCompletedScore = (levelScore * completedLevel) * completedBonus;
            System.out.println("Game is completed with level "+completedLevel+" and with a score of "+myTotalCompletedScore+".");
        } else {
            myTotalUnCompletedScore = (levelScore * unCompletedLevel) * unCompletedBonus;
            System.out.println("You are yet to complete the game to get a final score. But the score till  level "+unCompletedLevel+" is "
                    +myTotalUnCompletedScore+".");
        }

        return myTotalUnCompletedScore;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println("\n"+playerName+" managed to get into position "+playerPosition+" on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position =4;
        if(playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        } else if (playerScore >= 100){
            position = 3;
        }
        return position;
    }
}
