package com.xiaohao.pattern.interprete;

/**
 * Created by xiaohao on 2014/10/9.
 */
public class Context {

    private String input;

    private String outPut;

    public Context(String input) {
        this.input = input;
        this.outPut ="";
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void setOutPut(String outPut) {
        this.outPut = outPut;
    }

    public String getInput() {
        return input;
    }

    public String getOutPut() {
        return outPut;
    }
}
