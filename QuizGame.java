import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Enhanced Java Quiz Game!");
        System.out.println("Answer the following questions by typing the correct option (a, b, c, or d).");
        System.out.println("Let's get started!\n");

        // Question 1
        System.out.println("1. What is the default value of a boolean in Java?");
        System.out.println("a) true");
        System.out.println("b) false");
        System.out.println("c) null");
        System.out.println("d) 0");
        System.out.print("Your answer: ");
        if (scanner.nextLine().equalsIgnoreCase("b")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is b) false\n");
        }

        // Question 2
        System.out.println("2. Which method is used to find the length of a string in Java?");
        System.out.println("a) size()");
        System.out.println("b) length()");
        System.out.println("c) count()");
        System.out.println("d) measure()");
        System.out.print("Your answer: ");
        if (scanner.nextLine().equalsIgnoreCase("b")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is b) length()\n");
        }

        // Question 3
        System.out.println("3. What is the output of the following code?");
        System.out.println("   int x = 5;");
        System.out.println("   System.out.println(x++);");
        System.out.println("a) 5");
        System.out.println("b) 6");
        System.out.println("c) Error");
        System.out.println("d) None of the above");
        System.out.print("Your answer: ");
        if (scanner.nextLine().equalsIgnoreCase("a")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is a) 5\n");
        }

        // Question 4
        System.out.println("4. What is a correct syntax to declare a two-dimensional array in Java?");
        System.out.println("a) int[][] arr = new int[3][3];");
        System.out.println("b) int arr[3][3] = new int;");
        System.out.println("c) int[3][3] arr;");
        System.out.println("d) array arr = int[3][3];");
        System.out.print("Your answer: ");
        if (scanner.nextLine().equalsIgnoreCase("a")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is a) int[][] arr = new int[3][3];\n");
        }

        // Question 5
        System.out.println("5. Which keyword is used to inherit a class in Java?");
        System.out.println("a) implement");
        System.out.println("b) extends");
        System.out.println("c) inherits");
        System.out.println("d) super");
        System.out.print("Your answer: ");
        if (scanner.nextLine().equalsIgnoreCase("b")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is b) extends\n");
        }

        // Question 6
        System.out.println("6. Which of these data types is used to create objects?");
        System.out.println("a) int");
        System.out.println("b) float");
        System.out.println("c) class");
        System.out.println("d) object");
        System.out.print("Your answer: ");
        if (scanner.nextLine().equalsIgnoreCase("c")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is c) class\n");
        }

        // Question 7
        System.out.println("7. What is the base class for all classes in Java?");
        System.out.println("a) java.base");
        System.out.println("b) Object");
        System.out.println("c) Class");
        System.out.println("d) JavaClass");
        System.out.print("Your answer: ");
        if (scanner.nextLine().equalsIgnoreCase("b")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is b) Object\n");
        }

        // Question 8
        System.out.println("8. Which access modifier makes a member visible only within its own package?");
        System.out.println("a) public");
        System.out.println("b) private");
        System.out.println("c) protected");
        System.out.println("d) default");
        System.out.print("Your answer: ");
        if (scanner.nextLine().equalsIgnoreCase("d")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is d) default\n");
        }

        // Question 9
        System.out.println("9. Which operator is used to check object equality in Java?");
        System.out.println("a) ==");
        System.out.println("b) equals()");
        System.out.println("c) instanceof");
        System.out.println("d) equalsIgnoreCase()");
        System.out.print("Your answer: ");
        if (scanner.nextLine().equalsIgnoreCase("b")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is b) equals()\n");
        }

        // Question 10
        System.out.println("10. What will happen if we do not write a constructor in a Java class?");
        System.out.println("a) Compile-time error");
        System.out.println("b) Runtime error");
        System.out.println("c) Default constructor is provided");
        System.out.println("d) Object cannot be created");
        System.out.print("Your answer: ");
        if (scanner.nextLine().equalsIgnoreCase("c")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is c) Default constructor is provided\n");
        }

        // Display the final score
        System.out.println("Quiz Over!");
        System.out.println("Your final score is: " + score + "/10");
        if (score == 10) {
            System.out.println("Excellent! You're a Java expert!");
        } else if (score >= 7) {
            System.out.println("Great job! You're doing well.");
        } else if (score >= 5) {
            System.out.println("Good effort! Keep practicing.");
        } else {
            System.out.println("Don't worry, keep learning and you'll improve!");
        }

        scanner.close();
    }
}