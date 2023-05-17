public class VarArgs {

    public static void main(String... args) {

        System.out.println("Hello World Again !");
        String [] textList = "Hello World Again !".split(" ");
        printText(textList);
    }

//    private static void printText(String [] textList){
//
//        for(String text : textList){
//            System.out.println(text);
//        }
//
//    }

    // Alt way through varargs
    // Can be only one var arg
    // var arg should be the last argument in the method
    private static void printText(String ... textList){

        for(String text : textList){
            System.out.println(text);
        }

    }
}
