package com.my.code.java8concepts;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for(int i =0; i < 10 ;i++) {
            System.out.println("child process");
        }
    }
}

public class LambdaRunnableTest {

    public static void main(String[] args) {
//        MyRunnable myRun = new MyRunnable();
//        Thread t1 = new Thread(myRun);
//        t1.start();

        // with lambda + functional interface
        Runnable run1 = () -> {
            for(int i =0; i < 10 ;i++) {
                System.out.println("child process");
            }
        };
        Thread t1= new Thread(run1);
        t1.start();
        for(int i =0; i < 10 ;i++) {
            System.out.println("Parent process");
        }
    }
}
