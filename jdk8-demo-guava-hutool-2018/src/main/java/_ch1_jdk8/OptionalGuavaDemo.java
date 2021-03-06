package _ch1_jdk8;

import cn.hutool.core.lang.Console;
import com.google.common.base.Optional;
import org.junit.Test;

public class OptionalGuavaDemo {

    @Test
    public void test1() {
        Integer value1 = null;
        Integer value2 = 10;

        Optional<Integer> a = Optional.fromNullable(value1);

        // 返回包含给定的非空引用Optional实例
        Optional<Integer> b = Optional.of(value2);
//        Console.log("a -> {} b -> {}", a, b);

        System.out.println(sum(a, b));

        // 会报NullPointer
        // System.out.println(sum(Optional.fromNullable(2), Optional.of(null)));

    }


    private static Integer sum(Optional<Integer> a, Optional<Integer> b) {
        // isPresent()
        Console.log("参数1 -> {} 参数2 -> {}", a.isPresent(), b.isPresent());

        // 若引用缺失, 返回指定的值
        Integer value1 = a.or(0);

        // 返回所包含的实例,它必须存在
        Integer value2 = b.get();
        Console.log("value -> {} value2 -> {}", value1, value2);

        return value1 + value2;
    }



}
