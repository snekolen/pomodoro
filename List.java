import java.util.*;

//Creates a queue for tasks

public class List {
    //Include queue for all and complete and incomplete tasks
    private Queue<Task> allTasks = new PriorityQueue<Task> ();
    private Queue<Task> incompleteTasks = new PriorityQueue<Task> ();
    private Queue<Task> completeTasks = new PriorityQueue<Task> ();

    public List() {}//Creates empty queues

    //Getter and setter functions
    public Queue<Task> getAll() {
        return allTasks;
    }

    public Queue<Task> getIncomplete() {
        return incompleteTasks;
    }

    public Queue<Task> getComplete() {
        return completeTasks;
    }
}

