public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
       // for (int i = 0; i <= 10; i++) {
            Thread t = new Thread(new DownLoadFileTask());
            t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("file is ready to scanned");
        //}

    }
}
