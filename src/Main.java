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

//        if (score < 5000 && > 1000) {
//            System.out.println("Your score was less than 5000" +
//                    " but greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        //Using same variables used before, but what is in the Scope {} it remains there ;)
       score = 10000;
       levelCompleted = 8;
       bonus = 200;

        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " +finalScore);
        }


    }
}
