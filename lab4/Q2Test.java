import java.util.Scanner;
public class Q2Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();
        try{
            PSUStudent p1 = new UndergradStudent(age, gpa);
            PSUStudent p2 = new GradStudent(age, gpa);
            System.out.println(p1.getAge());
            System.out.println(p2.getAge());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}