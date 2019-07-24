package cn.swiftdev.example.thread.work.first;

import java.util.concurrent.TimeUnit;

public class UnUseThread {

    public static void main(String[] args) throws Exception{
        //烧水
        System.out.println("烧水10分钟");
        TimeUnit.SECONDS.sleep(10);
        //洗菜
        System.out.println("洗菜10分钟");
        TimeUnit.SECONDS.sleep(10);
        //做面条
        System.out.println("做面条10分钟");
    }

}
