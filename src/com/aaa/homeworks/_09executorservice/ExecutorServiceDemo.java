package com.aaa.homeworks._09executorservice;
import java.util.concurrent.*;
//1)	Define a inner class A has method “getMethod()” which return string “A.getMethod”
// and another inner class B has method “getMethod()” which return string “B.getMethod”.
// write another method “runSameTime()” which should let A and B getMethod to run at the same time,
// but the “runSameTime()” method should return a string “B.getMethod A.getMethod”

public class ExecutorServiceDemo {

    static void runSameTime(){
        ExecutorService es = Executors.newFixedThreadPool(2);

        try{
            Future<String> aFuture = es.submit(new Callable(){
                public Object call(){
                    return "A.getMethod";
                }
            });
            Future<String> bFuture = es.submit(new Callable(){
                public Object call(){
                    return "B.getMethod";
                }
            });

            boolean allDone = false;

            while (!allDone){
                if(aFuture.isDone() && bFuture.isDone()){
                    allDone = true;
                    System.out.println(aFuture.get()+" " + aFuture.get());
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {es.shutdown();}

    }

    public static void main(String[] args) {
        ExecutorServiceDemo obj = new ExecutorServiceDemo();
        obj.runSameTime();
    }

}
