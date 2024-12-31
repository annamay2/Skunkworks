public class Main {
    public static void main(String[] args) throws InterruptedException {
        UserInterface userInterface = new UserInterface();
        int action = 0;
        userInterface.welcomeMessage();

        while(action != 5) {

            action = userInterface.action();

            if (action == 1) {
                userInterface.addAssignment();
            } else if (action == 2) {
                userInterface.removeAssignment(userInterface.assignments);
            } else if (action == 3) {
                for(int i = 0; i < userInterface.assignments.size(); i++){
                    System.out.printf("%s: %s \n", i+1, (userInterface.assignments.get(i).toString()));
                }
            } else if (action == 4){
                {
                    userInterface.showSubmitted(userInterface.submitted);
                }
            }
        }


    }
}