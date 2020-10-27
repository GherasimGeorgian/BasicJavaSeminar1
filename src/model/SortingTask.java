package model;

import Utils.Constants;
import sorter.AbstractSorter;
import sorter.SortStrategy;

import java.time.LocalDateTime;

public class SortingTask extends Task {
    AbstractSorter abstractSorter;
    public SortingTask(String taskId,String descriere, int[] numbers, SortStrategy sortStrategy) {
        super(taskId, descriere);
        abstractSorter = new AbstractSorter(numbers,sortStrategy);
    }

    @Override
    public void execute(){
        System.out.println(this.toString());
    }

    public String toString(){
        return abstractSorter.sort();
    }
}
