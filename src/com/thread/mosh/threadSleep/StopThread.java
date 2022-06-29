package com.thread.mosh.threadSleep;

public class StopThread {

    public  static class StoppableRunnable implements Runnable {

        private boolean stopRequested = false;

        public synchronized boolean isStopRequested() {
            return stopRequested;
        }

        public synchronized void setStopRequested(boolean stopRequested) {
            this.stopRequested = stopRequested;
        }

        public synchronized void requestStoped() {
           this.stopRequested = true;
        }

        public void sleep(long mills){
            try {
                Thread.sleep(mills);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        @Override
        public void run() {
            System.out.println("Stoppable Runnable Running");
            while (!isStopRequested()){
                sleep(1000);
                System.out.println("...");
            }
            System.out.println("Stoppable Runnable Stopped");
        }
    }

    public static void main(String[] args) {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable , "The Thread");
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("requesting stop");
        stoppableRunnable.requestStoped();
        System.out.println("stop requested");
    }
}
