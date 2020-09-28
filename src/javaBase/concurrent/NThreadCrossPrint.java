package javaBase.concurrent;

/**
 * N个线程交叉打印到某一个值
 * @author guoshoujing
 * @create 2020-09-03 6:51 下午
 */
public class NThreadCrossPrint {
    public static void main(String[] args) {
        Integer N = 100;
        Integer printMaxNum = 1000;

        Object lock = new Object();
        for(int i = 0; i < N; i++){
            new Thread(new PrintThread(printMaxNum, i, N, lock)).start();
        }
    }

    public static class PrintThread implements Runnable{
        private static Integer currentNum = 0;

        private Integer maxNum;
        private Integer threadNum;
        private Integer threadCount;

        private Object lock;

        public PrintThread(Integer maxNum, Integer threadNum, Integer threadCount, Object lock) {
            this.maxNum = maxNum;
            this.threadNum = threadNum;
            this.threadCount = threadCount;
            this.lock = lock;
        }

        @Override
        public void run() {
            synchronized (lock){
                while(currentNum < maxNum){
                    if(currentNum % threadCount != threadNum){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println(Thread.currentThread().getName() + "  " + (++currentNum));
                        lock.notifyAll();
                    }
                }
            }
        }
    }
}
