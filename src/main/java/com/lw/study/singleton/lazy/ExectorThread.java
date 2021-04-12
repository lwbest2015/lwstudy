package com.lw.study.singleton.lazy;


/**
 * Create by lw
 * on 2021/4/12 23:56
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton simpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + simpleSingleton);
    }
}
