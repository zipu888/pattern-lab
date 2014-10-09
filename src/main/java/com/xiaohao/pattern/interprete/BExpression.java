package com.xiaohao.pattern.interprete;

/**
 * Created by xiaohao on 2014/10/9.
 */
public class BExpression extends Expression {

    @Override
    public void interpret(Context context) {
        System.out.println("b expression");

        String input = context.getInput();

        context.setInput(input.substring(1));
        context.setOutPut(context.getOutPut()+"2");
    }
}
