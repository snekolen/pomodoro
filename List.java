import java.util.Vector;

//Creates a vector for tasks

public class List {
    //Include queue for all and complete and incomplete tasks
    private Vector<Task> incompleteTasks;
    private Vector<Task> completeTasks;

    public List() { //Creates empty queues
        this.incompleteTasks = new Vector<Task> ();
        this.completeTasks  = new Vector<Task> ();
    }

    //Getter and setter functions
    public Vector<Task> getIncomplete() {
        return incompleteTasks;
    }

    public Vector<Task> getComplete() {
        return completeTasks;
    }

    //Functions for changing status of tasks
    public void addTask(Task t) { //Adds task to vector of all tasks
        incompleteTasks.add(t);
    }

    public void deleteTask(Task t) { //Deletes a task from all vectors
        if(incompleteTasks.contains(t)){
            incompleteTasks.removeElement(t);
        }

        if(completeTasks.contains(t)){
            completeTasks.removeElement(t);
        }
    }

    public void clearTasks(){ //Clears all vectors
        incompleteTasks.clear();
        completeTasks.clear();
    }

    public void markComplete(Task t) { //Marks an incomplete task complete
        t.editStatus();
        incompleteTasks.removeElement(t);
        completeTasks.add(t);
    }

    public void markIncomplete(Task t) { //Marks a complete task incomplete
        t.editStatus();
        completeTasks.removeElement(t);
        incompleteTasks.add(t);
    }

    //Task priority functions
    public int priorityNum(Task t) { //Returns priority of a incomplete task (p = index + 1)
        return incompleteTasks.indexOf(t) + 1;
    }

    public void changePriority(Task t, int p) { //Changes priority of incomplete tasks (p is the priority value) (Include error handling)
        if(p > incompleteTasks.size() || p < 1){
            throw new ArrayIndexOutOfBoundsException("Priority value is out of range");
        }

        incompleteTasks.removeElement(t);
        incompleteTasks.insertElementAt(t, p - 1);
    }

    public void priorityUp(Task t) { //Moves priority up
        int p = incompleteTasks.indexOf(t);

        if(p == 0){
            throw new ArrayIndexOutOfBoundsException("Unable to move task up");
        }

        incompleteTasks.removeElement(t);
        incompleteTasks.insertElementAt(t, p - 1);
    }

    public void priorityDown(Task t) { //Moves priority down
        int p = incompleteTasks.indexOf(t);

        if(p == incompleteTasks.size() - 1){
            throw new ArrayIndexOutOfBoundsException("Unable to move task down");
        }

        incompleteTasks.removeElement(t);
        incompleteTasks.insertElementAt(t, p + 1);
    }

    //Testing
    public Task getIncomAt(int i){
        return incompleteTasks.get(i);
    }

    public Task getComAt(int i){
        return completeTasks.get(i);
    }


    public static void main(String args[]){
        Task taskA = new Task("Finish List class");
        Task taskB = new Task("Learn UX design");
        Task taskC = new Task("Play around with JFrame");

        List a = new List();

        a.addTask(taskA);
        a.addTask(taskB);
        a.addTask(taskC);

        a.markComplete(taskB);
        a.markComplete(taskC);

        a.markIncomplete(taskC);

        //Incomplete tasks
        System.out.println("===============================");
        System.out.println("Incomplete tasks: ");
        for(int i = 0; i < a.getIncomplete().size(); i++){
            System.out.println(a.getIncomAt(i).getTask());
        }

        //Complete tasks
        System.out.println("===============================");
        System.out.println("Complete tasks: ");
        for(int i = 0; i < a.getComplete().size(); i++){
            System.out.println(a.getComAt(i).getTask());
        }
    }
}

//Other notes: 
//When displaying all tasks, have complete tasks on top and incomplete ones on bottom