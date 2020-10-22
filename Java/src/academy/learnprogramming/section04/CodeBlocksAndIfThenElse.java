package academy.learnprogramming.section04;

public class CodeBlocksAndIfThenElse {
    public static void main(String[] args) {
        boolean isGameOver = true;
        int levelScore = 5000;
        int completedLevel = 120;
        int unCompletedLevel = 100;
        int completedBonus = 100;
        int unCompletedBonus = 100;
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
    }
}
