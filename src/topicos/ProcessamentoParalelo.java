package topicos;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;



public class ProcessamentoParalelo {

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        SumTask task = new SumTask(numbers);
        Integer result = forkJoinPool.invoke(task);
        System.out.println("Soma: " + result);
    }
}

class SumTask extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 2;
    private List<Integer> numbers;

    public SumTask(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    protected Integer compute() {
        if (numbers.size() <= THRESHOLD) {
            return numbers.stream().mapToInt(Integer::intValue).sum();
        } else {
            int mid = numbers.size() / 2;
            SumTask leftTask = new SumTask(numbers.subList(0, mid));
            SumTask rightTask = new SumTask(numbers.subList(mid, numbers.size()));
            leftTask.fork();
            return rightTask.compute() + leftTask.join();
        }
    }
}
