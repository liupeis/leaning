package pei.jdk8.concurrence;

/**
 *
 * volatile语义:保证线程间变量的可见性
 * 1.线程对变量进行修改之后，要立刻回写到主内存。
 * 2.线程对变量读取的时候，要从主内存中读，而不是缓存。
 *
 *volatile的第二条语义：禁止指令重排序。
 *
 *  volatile不能保证原子性
 * @author pei
 */

public class Volatile1 extends Thread {

    private static  boolean flag = false;

    // jvm在有volatile关键字时，会同步不存在工作内存中存储主内存的副本，来保证多线程的可见性，但是没有的时候，jvm也会尽可能的在空闲的时候会去同步主内存中的值
    @Override
    public void run() {
        while (!flag){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("循环结束！");
    }

    public static void main(String[] args) throws InterruptedException {
      new Volatile1().start();
      Thread.sleep(1000);
      flag=true;
    }
}
