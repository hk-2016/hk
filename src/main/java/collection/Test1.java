package main.java.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test1 {

	static class MyTask implements Runnable {

        private String name;


        public MyTask(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public void run() {// 执行任务
            try {
                Random r = new Random();
                Thread.sleep(r.nextInt(1000)+2000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getId()+" sleep InterruptedException:"
                        +Thread.currentThread().isInterrupted());
            }
            System.out.println("任务 " + name + " 完成");
        }
    }

    public static void main(String[] args) {
    	 long startTime = System.currentTimeMillis();
    	    final Vector<Integer> l = new Vector<Integer>();
    	    ThreadPoolExecutor tp = new ThreadPoolExecutor(50, 100, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(20000));
    	    final Random random = new Random();
    	    for (int i = 0; i < 20000; i++)
    	    {
    	        tp.execute(new Runnable()
    	        {
    	            public void run()
    	            {
    	                l.add(random.nextInt());
    	            }
    	        });
    	    }
//    	    tp.shutdown();
    	    try
    	    {
    	        tp.awaitTermination(5, TimeUnit.SECONDS);
    	    }
    	    catch (InterruptedException e)
    	    {
    	        e.printStackTrace();
    	    }
    	    System.out.println(System.currentTimeMillis() - startTime);
    	    System.out.println(l.size());
    }

}
