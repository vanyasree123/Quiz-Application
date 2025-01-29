import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array of questions and answers
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the largest mammal on Earth?"
        };
        
        String[] options = {
            "1. Paris\n2. London\n3. Berlin\n4. Madrid",
            "1. Earth\n2. Mars\n3. Jupiter\n4. Saturn",
            "1. Elephant\n2. Blue Whale\n3. Giraffe\n4. Lion"
        };
        
        String[] answers = {
            "1", // Correct answer for question 1
            "2", // Correct answer for question 2
            "2"  // Correct answer for question 3
        };
        
        int score = 0;

        System.out.println("Welcome to the Quiz!");
        
        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            System.out.println(options[i]);
            System.out.print("Enter your answer (1/2/3/4): ");
            String userAnswer = scanner.nextLine();
            
            // Check if the user's answer is correct
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + answers[i]);
            }
        }
        
        // Display final score
        System.out.println("\nYour final score: " + score + "/" + questions.length);
        scanner.close();
    }
}
