import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String[] args) {

        Stream<String> sampleStream = Stream.of("i12","j23","k22","l230");
        sampleStream.map(String::toUpperCase).filter(str->str.startsWith("L")).forEach(System.out::println);
    }
}
