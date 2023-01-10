package com.example.asserts;

/**
 * @author zsl
 * @date 2022/12/30
 * @apiNote 要执行assert语句，必须给Java虚拟机传递-enableassertions（可简写为-ea）参数启用断言
 */
public class Test1 {
    public static void main(String[] args) {
        double x = Math.abs(-123.45);
        // assert x >= 0;
        assert x < 0;
        System.out.println(x);
    }
}
