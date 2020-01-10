package com.zhengbing.thread.base;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhengbing_vendor
 * @date 2020/1/10
 **/
public class SimpleThreadReentrantLock {

    private  static  int   count = 0;

    public static void main(String[] args) throws InterruptedException {
        final ReentrantLock lock = new ReentrantLock();

        Runnable  task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000000 ; i++) {
                    lock.lock();
                    try {
                        count += 1;
                    }finally {
                        if (lock.isLocked()) {
                            lock.unlock();
                        }
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
