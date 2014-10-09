package com.xiaohao.pattern.interprete;

/**
 * Created by xiaohao on 2014/10/9.
 */
public class AExpression extends Expression {

    @Override
    public void interpret(Context context) {

        System.out.println("a expression");

        String input = context.getInput();

        context.setInput(input.substring(1));
        context.setOutPut(context.getOutPut()+"1");


    }
}
