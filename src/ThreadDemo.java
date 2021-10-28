public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i <= 10; i++) {
            Thread t = new Thread(new DownLoadFileTask());
            t.start();
        }
    }
}
