public class Main {

    public static void main(String[] args) {

        // 1 mile = 1,609344 km
        double kilometres = (100 * 1.609344);

        int highScore = 50;
        if (highScore == 50) {
            System.out.println("It's an expression");
        }
        //Statements, whitespace and indentation (code organization)

        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("It's a test");

        int anotherVariable = 50;
        myVariable--;

        //if keywords and code blocks

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        //Using same variables used before, but what is in the Scope {} it remains there ;)
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " +finalScore);
        }

        // We're using method from below just here (instead of typing all these lines)

        calculateScore();

        calculateScoreShortMethod(true, 800, 4,100);

//        if (score < 5000 && > 1000) {
//            System.out.println("Your score was less than 5000" +
//                    " but greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }
//
//        if(gameOver == true) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

        //   M   E   T   H   O   D   S
    }
    // methods should be outside the main() method

    public static void calculateScore() {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
        //SHORTER WAY - using parameters in the brackets ( , , ) and returning int finalScore
    public static int calculateScoreShortMethod(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
    }

}
