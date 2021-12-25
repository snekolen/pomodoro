//This class groups a task into one object

public class Task {
    private String taskName; //Name of task
    private boolean taskComplete; //Status of task
    private String note; //Note about task

    public Task() {
        this.taskName = "";
        this.taskComplete = false;
    }

    public Task(String t) {
        this.taskName = t;
        this.taskComplete = false;
        this.note = "";
    }

    //Edit and return task and completion status
    public void editTask(String t) {
        this.taskName = t;
    }

    public void editStatus() {
        if(taskComplete) this.taskComplete = false; //Changing task to incomplete
        else this.taskComplete = true; //Changing task to complete
    }

    public void editNote(String n){
        this.note = n;
    }

    public String getTask() {
        return taskName;
    }

    public boolean getStatus() {
        return taskComplete;
    }

    public String getNote(){
        return note;
    }
}