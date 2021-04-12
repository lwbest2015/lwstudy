package com.lw.study.singleton.hungry;

/**
 * Create by lw
 * on 2021/4/12 23:41
 */
// 使用静态代码块,静态代码块得执行顺序
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    // 空参构造私有化
    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }
}
