package com.zhengbing.thread.base;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhengbing_vendor
 * @date 2020/1/10
 **/
public class SimpleThreadAtomicInteger {

    private  static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Runnable  task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000000 ; i++) {
                    synchronized (SimpleThreadAtomicInteger.class) {
                        count.incrementAndGet();
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
