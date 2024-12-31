import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    Scanner input = new Scanner(System.in);
    public ArrayList<Assignment> assignments = new ArrayList<>();
    public ArrayList<Assignment> submitted = new ArrayList<>();

    public void welcomeMessage(){
        assignments.add(new Assignment("Assignment 1", "Maths", "12/01/25", "Make a calculator"));
        assignments.add(new Assignment("Assignment 2", "Programming", "15/02/25", "Personal project"));
        System.out.print("""
                Welcome to the Assignment Organiser\s
                Your current assignments due:\s
                """);
        showDue(assignments);
    }

    public int action(){

        System.out.println("What would you like to do?");
        System.out.print("""
                1: Add an assignment
                2: I have submitted an assignment
                3: See due assignments
                4: See submitted assignments
                5: Exit
                """);

        return input.nextInt();
    }

    public void addAssignment() throws InterruptedException {

        System.out.println("Enter the name of the assignment:");
        String currentName = input.next();

        System.out.println("Enter the module this assignment is for:");
        String currentModule = input.next();
        System.out.println("When is the assignment due? (dd/mm/yy)");
        String currentDue = input.next();
        System.out.println("What are the details of this assignment?");
        String currentDetails = input.next();

        assignments.add(new Assignment(currentName, currentModule, currentDue, currentDetails));

        System.out.printf("Assignments Currently Due:%n%n");
        showDue(assignments);
    }

    public void removeAssignment(ArrayList<Assignment> assignments) {
        System.out.println("Which assignment has been submitted?");
        showDue(assignments);
        int remove = input.nextInt();
        submitted.add(assignments.get(remove - 1));
        assignments.remove(remove - 1);

        System.out.printf("Submitted Assignments:%n%n");
        showSubmitted(assignments);

        System.out.printf("Assignments Currently Due:%n%n");
        showDue(assignments);

    }


    public void showSubmitted(ArrayList<Assignment> submitted){
        if(submitted.isEmpty()){
            System.out.println("No submitted assignments");
        } else {
            for (int i = 0; i < submitted.size(); i++) {
                System.out.printf("%s: ", i + 1);
                System.out.println(submitted.get(i));
            }
        }
    }

    public void showDue(ArrayList<Assignment> due){
        if(due.isEmpty()){
            System.out.println("No due assignments");
        } else {
            for (int i = 0; i < due.size(); i++) {
                System.out.printf("%s: ", i + 1);
                System.out.println(due.get(i));
            }
        }
    }


}
