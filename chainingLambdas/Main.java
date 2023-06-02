package chainingLambdas;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        String name = "tom";
        Function<String , String> ucase = String::toUpperCase;
        System.out.println("--- ucase"+ucase.apply(name));

        Function<String , String> lastName = s->s.concat("ford");
        Function<String , String> ucaseLastName = ucase.andThen(lastName);

        ucaseLastName = ucase.compose(lastName);
        System.out.println(ucaseLastName.apply(name));
    }
}
