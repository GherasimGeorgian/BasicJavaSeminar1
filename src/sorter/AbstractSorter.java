package sorter;

import container.StackContainer;
import container.Strategy;

public class AbstractSorter implements Sort {

    private int[] numbers;
    private SortStrategy sortStrategy;

    public AbstractSorter(int[] numbers,SortStrategy sortStrategy){
        this.numbers = numbers;
        this.sortStrategy = sortStrategy;
    }

    @Override
    public String sort(){
        if(this.sortStrategy == SortStrategy.BUBBLESORT){
            return new BubbleSort(numbers).toString();
        }
        if(this.sortStrategy == SortStrategy.QUICKSORT){
            return new QuickSort(numbers).toString();
        }
        return null;
    }
}
