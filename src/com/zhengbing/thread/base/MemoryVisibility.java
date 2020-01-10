package com.zhengbing.thread.base;

/**
 * 内存可见性问题
 * @author zhengbing_vendor
 * @date 2020/1/10
 **/
public class MemoryVisibility {

    private  static  boolean flag;

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i <10000 ; i++) {
            flag = false;
             final  int no = i;

             Thread t1 = new Thread(new Runnable() {
                 @Override
                 public void run() {
                    flag = true;
                     System.out.println(String.format("No.%d loop, t1 is done.", no));
                 }
             });

             Thread t2 = new Thread(new Runnable() {
                 @Override
                 public void run() {
                     while (!flag) {
                         System.out.println(String.format("No.%d loop, t2 is done.", no));
                     }
                 }
             });

             t1.start();
             t2.start();

             t1.join();
             t2.join();
        }

    }
}
