package first;

import Utils.Constants;
import container.Container;
import container.StackContainer;
import container.Strategy;
import factory.Factory;
import factory.TaskContainerFactory;
import model.MessageTask;
import model.SortingTask;
import model.Task;
import runner.StrategyTaskRunner;
import sorter.SortStrategy;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("ji");

        TaskContainerFactory tcf = TaskContainerFactory.getInstance();
        Container stackcontainer = tcf.createContainer(Strategy.LIFO);
        stackcontainer.add(new MessageTask("1","feedback","nota primita este 10","Alex","John", LocalDateTime.now()));
        stackcontainer.add(new MessageTask("2","feedback2","nota primita este 2","Mihai","Hihi", LocalDateTime.now()));
        stackcontainer.add(new MessageTask("3","feedback3","nota primita este 3","Gigi","Uuiui", LocalDateTime.now()));
        System.out.println(stackcontainer.size());
        stackcontainer.remove();
        stackcontainer.showElements();


    }
}
