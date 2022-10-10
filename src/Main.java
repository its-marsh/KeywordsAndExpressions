public class Main {
    public static void main(String[] args) {
        int
                myVariable

                =
                50

                ;//white spaces still work, but terrible to read
        System.out.println("MyVariable = " + myVariable);

        int anotherVariable = 50;myVariable--;System.out.println("Not good code practice to put multiple statements on same line");

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        /*if(score != 5000)
            System.out.println("Your score was 5000");
        System.out.println("This was executed still because of no code block");

        if(score < 5000 && score > 1000){
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here.");
        }*/

        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //int savedFinalScore = finalScore; //can't access variables made inside above code block "scope"

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver){
            System.out.println("Your final score was " + (score + (levelCompleted * bonus)));
        }//bad practice to duplicate code blocks
    }
}