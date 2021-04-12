package com.lw.study.singleton.hungry;

/**
 * Create by lw
 * on 2021/4/12 23:33
 */
// 饿汉式单例模式
public class HungrySingleton {

    // 类加载时候创建对象
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    // 构造方法私有(空参构造)
    private HungrySingleton() {
    }
    // 全局唯一入口
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
