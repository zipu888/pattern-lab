package com.xiaohao.pattern.decorator;

/**
 * Created by xiaohao on 2014/10/8.
 *
 * BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
 * System.in is an InputStream object
 *
 * 动态地给一个对象添加一些额外的职责。
 * 优点：把类中的装饰功能从类中搬移出去，
 * 这样可以简化原有的类。有效地把类的核心功能和装饰功能区分开了。
 */
public class Main {

    public static void main(String[] args) {
        Girl girl = new AmericanGirl();

        System.out.println(girl.getDescription());

        Science science = new Science(girl);

        System.out.println(science.getDescription());

        Art art = new Art(science);

        System.out.println(art.getDescription());

        //Girl g = new Science(new Art(new AmericanGirl()));

    }

}
