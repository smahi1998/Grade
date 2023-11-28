//Author : Shubham Mahi
import java.util.Scanner;
public class Grade {

    public static double homework;
    public static double quiz;

    public Grade(){
        homework=0;
        quiz=0;
    }
    public String getLetterGrade(double finalper) {
        if (finalper >= 90) {
            return "A";
        } else if (finalper >= 80) {
            return "B";
        } else if (finalper >= 70) {
            return "C";
        } else if (finalper >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void home(int H1,int H2,int H3,int H4,int H5,int H6, int H7, int H8){
        double a = (double) (H1 + H2 + H3 + H4 + H5 + H6 + H7 + H8) /800;
        homework = a * 100;

    }
    public void quizz(int Q1,int Q2,int Q3,int Q4,int Q5){
        double a = (double) (Q1 + Q2 + Q3 + Q4 + Q5) /500;
        quiz = a * 100;

    }



    public  double calculateFinalgrade(int E1,int E2, int P) {
        double homeworkAvg = 0.15;
        double quizAvg = 0.05;
        double exam1Avg = 0.25;
        double exam2Avg = 0.30;
        double projectAvg = 0.25;


        double finalper = (homework * homeworkAvg)+ (quiz * quizAvg) + (E1 * exam1Avg)
                + (E2 * exam2Avg) + (P * projectAvg);

        return finalper;
    }



    public static void main(String[] args) {
        System.out.println("Name: Shubham Mahi");

        //System.in is a standard input stream
        Scanner scan = new Scanner(System.in);
        System.out.println("Percent in homework 1 : ");

        int h1 = scan.nextInt();
        System.out.println("Percent in homework 2 : ");

        int h2 = scan.nextInt();
        System.out.println("Percent in homework 3 : ");

        int h3 = scan.nextInt();
        System.out.println("Percent in homework 4 : ");

        int h4 = scan.nextInt();
        System.out.println("Percent in homework 5 : ");

        int h5 = scan.nextInt();
        System.out.println("Percent in homework 6 : ");

        int h6 = scan.nextInt();
        System.out.println("Percent in homework 7 : ");

        int h7 = scan.nextInt();
        System.out.println("Percent in homework 8 : ");

        int h8 = scan.nextInt();

        System.out.println("Percent in quiz 1 : ");
        int q1 = scan.nextInt();
        System.out.println("Percent in quiz 2 : ");
        int q2 = scan.nextInt();
        System.out.println("Percent in quiz 3 : ");
        int q3 = scan.nextInt();
        System.out.println("Percent in quiz 4 : ");
        int q4 = scan.nextInt();
        System.out.println("Percent in quiz 5 : ");
        int q5 = scan.nextInt();
        System.out.println("Mid term percentage : ");
        int e1 = scan.nextInt();
        System.out.println("Final term percentage : ");
        int e2 = scan.nextInt();
        System.out.println("Project percentage : ");
        int  p = scan.nextInt();



        Grade grade = new Grade();

        grade.home(h1,h2,h3,h4,h5,h6,h7,h8);
        grade.quizz(q1,q2,q3,q4,q5);
        double finalper = grade.calculateFinalgrade(e1,e2,p);
        String letterGrade = grade.getLetterGrade(finalper);


        System.out.print(" \nFinal Percentage is: " +finalper);
        System.out.println("\nLetter Grade: " + letterGrade);



    }
}
