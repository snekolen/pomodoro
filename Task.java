//This class groups a task into one object

public class Task {
    private String taskName; //Name of task
    private boolean taskComplete; //Status of task

    public Task() {
        this.taskName = "";
        this.taskComplete = false;
    }

    public Task(String t) {
        this.taskName = t;
        this.taskComplete = false;
    }

    //Edit and return task and completion status
    public void editTask(String t) {
        this.taskName = t;
    }

    public void editStatus() {
        if(taskComplete) taskComplete = false; //Changing task to incomplete
        else taskComplete = true; //Changing task to complete
    }

    public String getTask() {
        return taskName;
    }

    public boolean getStatus() {
        return taskComplete;
    }
}