import java.util.*;
public class StudentGradeCalculatorApp{
    Scanner scanner=new Scanner(System.in);
    void Developer(){
        System.out.println("****************************");
        System.out.println("| STUDENT GRADE CALCULATOR |");
        System.out.println("|\tBY SOORAT ALI \t   |");
        System.out.println("****************************\n\n");
    }
    void Calculator(){
        System.out.print("Enter Obtained Marks in English : ");
        int eMarks=scanner.nextInt();
        System.out.print("Enter Obtained Marks in Mathematics : ");
        int mMarks=scanner.nextInt();
        System.out.print("Enter Obtained Marks in Biology : ");
        int bMarks=scanner.nextInt();
        System.out.print("Enter Obtained Marks in Physics : ");
        int pMarks=scanner.nextInt();
        System.out.print("Enter Obtained Marks in Chemistry : ");
        int chMarks=scanner.nextInt();
        System.out.print("Enter Obtained Marks in Computer : ");
        int cMarks=scanner.nextInt();
        int obtainedMarks=eMarks+mMarks+bMarks+pMarks+chMarks+cMarks;
        System.out.println("\n\nResult");
        System.out.println("Total Obtained Marks : "  +obtainedMarks);
        System.out.println("Total Marks : 600");
        float percentage=((float)obtainedMarks/600)*100;
        System.out.println("Percentage : " +percentage +"%");
        System.out.print("Status : ");
        if(percentage>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        System.out.print("Grade : ");
        if(percentage>=90){
            System.out.println("A+");
        }
        else if(percentage>=80){
            System.out.println("A");
        }
        else if(percentage>=75){
            System.out.println("B+");
        }
        else if(percentage>=69){
            System.out.println("B");
        }
        else if(percentage>=60){
            System.out.println("C+");
        }
        else if(percentage>=50){
            System.out.println("C");
        }
        else if(percentage<50){
            System.out.println("F");
        }

    }
    void ControlPanel(){
        Developer();
        Calculator();
        scanner.close();
    }
    public static void main(String[] args){
        StudentGradeCalculatorApp sgc=new StudentGradeCalculatorApp();
        sgc.ControlPanel();
    }
}