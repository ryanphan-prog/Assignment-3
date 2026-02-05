public class ArrayPractice {
    public static void main(String[] args) {

        int[] scores = {90, 85, 78, 92, 88};

        System.out.println("First score: " + scores[0]);
        System.out.println("Last score: " + scores[scores.length - 1]);

        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        double average = (double) total / scores.length;
        System.out.println("Average: " + average);

        String[] colors = {"Red", "Green", "Blue"};
        for (int i = 0; i < colors.length; i++) {
            System.out.println("Color " + i + ": " + colors[i]);
        }

        String[] rps = {"Scissor", "Rock", "Paper"};
        System.out.println("Index 0 is: " + rps[0]);
        System.out.println("Index 1 is: " + rps[1]);
        System.out.println("Index 2 is: " + rps[2]);

        System.out.println();
        System.out.println("--- Week 4 Lab Complete! ---");
        System.out.println("You're ready for Assignment 3: Rock-Paper-Scissors");
    }
}
