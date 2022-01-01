package lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
//        prior java-8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable");
            }
        };
        new Thread(runnable).start();

//        after java-8
        Runnable runnableLambda = () -> System.out.println("Inside Runnable 1");
        new Thread(runnableLambda).start();
    }
}
