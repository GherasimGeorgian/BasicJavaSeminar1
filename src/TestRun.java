import container.Container;
import container.Strategy;
import factory.TaskContainerFactory;
import model.MessageTask;
import model.SortingTask;
import runner.DelayTaskRunner;
import runner.PrinterTaskRunner;
import runner.StrategyTaskRunner;
import sorter.SortStrategy;

import java.time.LocalDateTime;

public class TestRun {
    public static void main(String args[]){
//        if(args[0] == "LIFO"){
//            Strategy strategy = Strategy.LIFO;
//        }
//        else if(args[0] == "FIFO"){
//            Strategy strategy = Strategy.FIFO;
//        }
//        else{
//            System.out.println("Strategie invalida!");
//            Strategy strategy = Strategy.LIFO;
//        }
        Strategy strategy = Strategy.valueOf(args[0]);

        MessageTask t1 = new MessageTask("1","feedback","nota primita este 10","Alex","John", LocalDateTime.now());
        MessageTask t2 = new MessageTask("2","rezultate","nota primita este 8","Maria","Bob", LocalDateTime.now());

        MessageTask[] listMess = new MessageTask[]{t1,t2};

//        for(MessageTask mt: listMess){
//            mt.execute();
//        }
        StrategyTaskRunner runner  = new StrategyTaskRunner(strategy);
        runner.addTask(listMess[0]);
        runner.addTask(listMess[1]);




        DelayTaskRunner delayTaskRunner = new DelayTaskRunner(runner);
        delayTaskRunner.executeAll();

//        runner.addTask(listMess[0]);
//        runner.addTask(listMess[1]);
//
//        PrinterTaskRunner decorator =  new PrinterTaskRunner(runner);
//        decorator.executeAll();


    }
}
