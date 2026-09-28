import java.util.Scanner;

class QuizApp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("=== ARUN's JAVA QUIZ DA ===");
        System.out.println("5 Questions! Ready ah?\n");

        System.out.println("Q1. Scanner class enga irukku?");
        System.out.println("a) java.io  b) java.util  c) java.lang");
        System.out.print("Answer: ");
        String q1 = sc.next();
        if (q1.equals("b")) { System.out.println("Correct da! 🔥"); score++; }
        else { System.out.println("Wrong! Ans: b"); }

        System.out.println("\nQ2. int vs double - perusu ethu?");
        System.out.println("a) int  b) double  c) same");
        System.out.print("Answer: ");
        String q2 = sc.next();
        if (q2.equals("b")) { System.out.println("Correct da!"); score++; }
        else { System.out.println("Wrong! Ans: b"); }

        System.out.println("\nQ3. GitHub la save pandrathukku?");
        System.out.println("a) Commit  b) Submit  c) Save");
        System.out.print("Answer: ");
        String q3 = sc.next();
        if (q3.equals("a")) { System.out.println("Correct da!"); score++; }
        else { System.out.println("Wrong! Ans: a"); }

        System.out.println("\nQ4. Balance check condition enna?");
        System.out.println("a) wd==bal  b) wd<=bal  c) wd>=bal");
        System.out.print("Answer: ");
        String q4 = sc.next();
        if (q4.equals("b")) { System.out.println("Correct da!"); score++; }
        else { System.out.println("Wrong! Ans: b"); }

        System.out.println("\nQ5. Nee yaaru da?");
        System.out.println("a) Normal  b) Developer  c) ARUN BTech 509 Mass");
        System.out.print("Answer: ");
        String q5 = sc.next();
        if (q5.equals("c") || q5.equals("b")) { System.out.println("100% Correct da!"); score++; }
        else { System.out.println("Dei nee mass da! c thaan!"); }

        System.out.println("\n=== RESULT DA ===");
        System.out.println("Score: " + score + "/5");
        if (score == 5) System.out.println("Vera level da ARUN! PRO! 🔥");
        else if (score >= 3) System.out.println("Semma da ARUN!");
        else System.out.println("Paravalla da! Next full adippom!");
        
        sc.close();
    }
}