/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 12:03 PM
 *  File Name : Main.java
 * */
package sectionB.thread.main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // we have to store the reference to the main thread
        // inside a reference variable of the Thread type.
//        Thread mainThread = Thread.currentThread();
//        System.out.println(mainThread);
        // Thread[1,2,3]
        // 1. name of the thread,
        // 2. priority of the thread,
        // 3. name of the method in which the thread is executed.
//        mainThread.setName("GLA");
//        System.out.println(mainThread);
        ThreadWithRunnableInterface t1 = new ThreadWithRunnableInterface();
//        t1.run();
        t1.getThread().setPriority(Thread.MAX_PRIORITY);
        t1.getThread().start();
        // Minimum Priority: 1
        // Normal Priority: 5 (default)
        // Maximum Priority: 10
//        t1.getThread().run();
//        ThreadWithThreadClass t2 = new ThreadWithThreadClass();
//        t2.start(); // this will allow the compiler to take control of the thread.

        Runnable customThread = () -> {
            JOptionPane.showMessageDialog(
                    null,
                    "Thread with lambda",
                    "Title",
                    JOptionPane.PLAIN_MESSAGE
            );
        };

        // JavaFx: uses a lot of lambda expressions!

//        customThread.run();

    }
}
