package factory;

import container.Container;
import container.QueueContainer;
import container.StackContainer;
import container.Strategy;

public class TaskContainerFactory implements Factory {
    
    private static TaskContainerFactory instance = null;
    // un singleton are o singura instanta
    private TaskContainerFactory(){

    }
    public static  TaskContainerFactory getInstance(){
        if(instance == null){ instance =  new TaskContainerFactory(); }
        return instance;
    }
    @Override
    public Container createContainer(Strategy strategy){
        //to do QContainer
        if(strategy == Strategy.LIFO){
            return new StackContainer();
        }
        if(strategy == Strategy.FIFO){
            return new QueueContainer();
        }
        return null;

    }
}
