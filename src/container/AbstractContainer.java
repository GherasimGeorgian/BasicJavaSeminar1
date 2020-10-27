package container;

import Utils.Constants;
import model.Task;

public abstract class AbstractContainer implements  Container {
    public Task[] tasks;
    public int size;

    public AbstractContainer(){
        tasks = new Task[Constants.INITIAL_SIZE_TASKS];
        size = 0;
    }

    public abstract Task remove();

    public void add(Task task){
        if(tasks.length == size){
            //crestem lungimea vectorului
            Task t[]= new Task[tasks.length*2];
            System.arraycopy(tasks,0,t,0,tasks.length);
            tasks = t;
        }
        tasks[size]=task;
        size++;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void showElements() {
        for(int i=0;i<size();i++){
            System.out.println(tasks[i].toString());
        }
    }
}
