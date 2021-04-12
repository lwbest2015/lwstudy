package com.lw.study.singleton.lazy;

/**
 * Create by lw
 * on 2021/4/12 23:50
 */
//  懒汉式单例对象创建
public class LazySimpleSingleton {
    private LazySimpleSingleton() {
    }

    private static LazySimpleSingleton lazy = null;

    public static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            // 这句和下一句有什么区别吗？ 作用域提出去  这句不生效
            //LazySimpleSingleton lazy = new LazySimpleSingleton();
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
