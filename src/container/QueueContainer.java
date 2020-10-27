package container;

import Utils.Constants;
import model.Task;

public class QueueContainer implements Container {
    private Task[] tasks;
    private int size;

    public QueueContainer(){
        tasks = new Task[Constants.INITIAL_SIZE_TASKS];
        size = 0;
    }
    @Override
    public void showElements(){
        for(int i=0;i<size();i++){
            System.out.println(tasks[i].toString());
        }
    }

    @Override
    public Task remove(){
        Task aux = null;
        for(int i=0;i<size()-1;i++){
            tasks[i] = tasks[i+1];
        }

        if(!isEmpty()){
            Task t =(Task)tasks[--size];
            tasks[size] =null;
            return t;
        }
        else
            return null;
    }
    @Override
    public boolean isEmpty(){
        return size==0;
    }
    @Override
    public int size(){
        return size;
    }
    @Override
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
}
