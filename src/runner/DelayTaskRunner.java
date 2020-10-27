package runner;

import Utils.Constants;

import java.time.LocalDateTime;

public class DelayTaskRunner extends AbstractTaskRunner {
    public DelayTaskRunner(TaskRunner runner){
        super(runner);
    }
    @Override
    public void executeOneTask(){
        System.out.println("Intarziere 3 sec!");
        runner.executeOneTask();
        delayTask();
    }
    public void delayTask(){

        try{
            Thread.sleep(3000);

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
