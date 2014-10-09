package com.xiaohao.pattern.decorator;

/**
 * Created by xiaohao on 2014/10/8.
 */
public class Science extends GirlDecorator {

    private Girl girl;

    public Science(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + " 爱科学 ";
    }

    public void caltulateStuff(){
        System.out.println("科学的计算");
    }
}
