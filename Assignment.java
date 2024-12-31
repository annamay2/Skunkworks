public class Assignment {
    String assignmentName;
    String assignmentModule;
    String dueDate;
    String details;

    public Assignment(String assignmentName, String assignmentModule, String dueDate, String details){
        this.assignmentName = assignmentName;
        this.assignmentModule = assignmentModule;
        this.dueDate = dueDate;
        this.details = details;
    }

    @Override
    public String toString(){
        return String.format("Name: %s\n" +
                            "Module: %s\n" +
                            "Due: %s\n" +
                            "Details: %s\n", assignmentName, assignmentModule, dueDate, details);
    }
}
