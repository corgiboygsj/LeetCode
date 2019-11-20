package test;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 生产者消费者
 */
public class ProducerConsumer {

    public static void main(String[] args) {
        final BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        Consumer consumer1 = new Consumer(queue, "消费者1号");
        Consumer consumer2 = new Consumer(queue, "消费者2号");

        Producer producer1 = new Producer(queue, "生产者1号");
        Producer producer2 = new Producer(queue, "生产者2号");
        Producer producer3 = new Producer(queue, "生产者3号");

        new Thread(consumer1).start();
        new Thread(consumer2).start();
        new Thread(producer1).start();
        new Thread(producer2).start();
        new Thread(producer3).start();
    }

    public static class Consumer implements Runnable{
        private final BlockingQueue<String> queue;
        private final String name;

        public Consumer(BlockingQueue<String> queue, String name){
            this.queue = queue;
            this.name = name;
        }

        @Override
        public void run() {
            while(true){
                try {
                    String item = queue.take();
                    System.out.println(String.format("%s消费了：%s", name, item));
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Producer implements Runnable{
        private final Random random = new Random(1000);
        private final BlockingQueue<String> queue;
        private final String name;

        public Producer(BlockingQueue<String> queue, String name){
            this.queue = queue;
            this.name = name;
        }

        @Override
        public void run() {
            while(true){
                String item = String.format("%s生产的%d", name, random.nextInt(100));
                queue.offer(item);
                System.out.println(String.format("%s生产了：%s", name, item));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
