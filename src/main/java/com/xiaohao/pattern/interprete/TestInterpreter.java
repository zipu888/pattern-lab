package com.xiaohao.pattern.interprete;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaohao on 2014/10/9.
 *
 * Interpreter pattern is used when some context needs to be interpreted.
 * The following example is a very simple Interpreter implementation.
 * What is does is interpreting letter "a" and "b" to "1" and "2".
 */
public class TestInterpreter {

    public static void main(String[] args) {

        String str ="ab";

        Context context = new Context(str);

        List<Expression> expressions = new ArrayList<Expression>();

        expressions.add(new AExpression());
        expressions.add(new BExpression());

        for(Expression expression:expressions){
            expression.interpret(context);
        }

        System.out.println(context.getOutPut());
    }

}
