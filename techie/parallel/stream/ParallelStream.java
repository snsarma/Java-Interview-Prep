package techie.parallel.stream;

import java.sql.SQLOutput;
import java.util.stream.IntStream;

public class ParallelStream {

    public static void main(String[] args) {

        long start = 0;
        long end = 0;

         start = System.currentTimeMillis();
        IntStream.range(1,100).forEach(System.out::println);
         end = System.currentTimeMillis();
//        System.out.println("start :"+start+"end:"+end);
        System.out.println("Time taken:"+(end-start));

        System.out.println("--------------------");
        start = System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
//        System.out.println("start :"+start+"end:"+end);
        System.out.println("Parallel Stream Time taken:"+(end-start));
    }
}
