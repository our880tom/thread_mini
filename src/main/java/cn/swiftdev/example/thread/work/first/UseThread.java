package cn.swiftdev.example.thread.work.first;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class UseThread {
    public static void main(String[] args) throws Exception{
        System.out.println("烧水10分钟");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("烧水同时洗菜10分钟");
            }
        }).start();

        TimeUnit.SECONDS.sleep(10);
        System.out.println("做面10分钟");

    }
}
