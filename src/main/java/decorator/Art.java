package decorator;

/**
 * Created by xiaohao on 2014/10/8.
 */
public class Art extends GirlDecorator {

    private Girl girl;

    public Art(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() +" 爱艺术";
    }

    public void draw(){
        System.out.println(" 画画 啦啦 ");
    }
}
