package first;

import container.*;
import factory.TaskContainerFactory;
import model.MessageTask;
import model.SortingTask;
import sorter.SortStrategy;

import java.time.LocalDateTime;

public class cerinte {
    public static void main(String[] args) {
        System.out.println("-------------------1------------------");
        // SortingTask BubbleSort
        SortingTask sortingTask = new SortingTask("1","Sortare bubblesort",new int[]{1,234,4,32,5,6}, SortStrategy.BUBBLESORT);
        sortingTask.execute();
        // SortingTask QuickSort
        SortingTask sortingTask2 = new SortingTask("2","Sortare quicksort",new int[]{4234,5354,235,545,54,64,56}, SortStrategy.QUICKSORT);
        sortingTask2.execute();
        System.out.println("-------------------2------------------");

        TaskContainerFactory tcf = TaskContainerFactory.getInstance();
        Container stackcontainer = tcf.createContainer(Strategy.LIFO);
        stackcontainer.add(new MessageTask("1","feedback","nota primita este 10","Alex","John", LocalDateTime.now()));
        stackcontainer.add(new MessageTask("2","feedback2","nota primita este 2","Mihai","Hihi", LocalDateTime.now()));
        stackcontainer.add(new MessageTask("3","feedback3","nota primita este 3","Gigi","Uuiui", LocalDateTime.now()));
        System.out.println(stackcontainer.size());
        stackcontainer.remove();
        stackcontainer.remove();
        stackcontainer.showElements();
        System.out.println("-------------------3------------------");
        Container queueContainer = tcf.createContainer(Strategy.FIFO);
        queueContainer.add(new MessageTask("4","feedback","nota primita este 10","Alex","John", LocalDateTime.now()));
        queueContainer.add(new MessageTask("5","feedback2","nota primita este 2","Mihai","Hihi", LocalDateTime.now()));
        queueContainer.add(new MessageTask("6","feedback3","nota primita este 3","Gigi","Uuiui", LocalDateTime.now()));
        queueContainer.remove();
        queueContainer.remove();
        queueContainer.showElements();
        System.out.println("------------------4-------------------");
        AbstractContainer refactStack = new RefactStackContainer();
        refactStack.add(new MessageTask("7","feedback","nota primita este 10","Alex","John", LocalDateTime.now()));
        refactStack.add(new MessageTask("8","feedback2","nota primita este 2","Mihai","Hihi", LocalDateTime.now()));
        refactStack.add(new MessageTask("9","feedback3","nota primita este 3","Gigi","Uuiui", LocalDateTime.now()));
        System.out.println(refactStack.size());
        refactStack.remove();
        refactStack.remove();
        refactStack.showElements();
        System.out.println("------------------5-------------------");
        AbstractContainer refactQueue = new RefactQueueContainer();
        refactQueue.add(new MessageTask("10","feedback","nota primita este 10","Alex","John", LocalDateTime.now()));
        refactQueue.add(new MessageTask("11","feedback2","nota primita este 2","Mihai","Hihi", LocalDateTime.now()));
        refactQueue.add(new MessageTask("12","feedback3","nota primita este 3","Gigi","Uuiui", LocalDateTime.now()));
        System.out.println(refactQueue.size());
        refactQueue.remove();
        refactQueue.remove();
        refactQueue.showElements();
        System.out.println("------------------6-------------------");

    }
}
