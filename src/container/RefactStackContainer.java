package container;

import model.Task;

public class RefactStackContainer extends AbstractContainer {
    public RefactStackContainer(){
        super();
    }
    @Override
    public Task remove(){
        if(!isEmpty()){
            Task t =(Task)tasks[--size];
            tasks[size] =null;
            return t;
        }
        else
            return null;
    }
}
