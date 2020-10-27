package container;

import Utils.Constants;
import model.Task;

public class RefactQueueContainer extends AbstractContainer {
    public RefactQueueContainer(){
        super();
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
}
