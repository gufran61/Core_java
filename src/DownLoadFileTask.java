public class DownLoadFileTask implements Runnable{
    @Override
    public void run() {
        System.out.println("downloading a file"+Thread.currentThread().getName());
    }
}
