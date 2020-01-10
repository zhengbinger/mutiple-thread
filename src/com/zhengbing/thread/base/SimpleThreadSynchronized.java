package com.zhengbing.thread.base;

/**
 * @author zhengbing_vendor
 * @date 2020/1/10
 **/
public class SimpleThreadSynchronized {

    private  static  int   count = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable  task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000000 ; i++) {
                    synchronized (SimpleThreadSynchronized.class) {
                        count += 1;
                    }
                }
            }
        };

        Thread   t1 = new Thread(task);
        Thread   t2 = new Thread(task);

        t1.start();
        t2.start();

        // 等待两个线程执行完成
        t1.join();
        t2.join();
        System.out.println("count:"+count);
    }

}
