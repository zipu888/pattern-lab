package com.xiaohao.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaohao on 2014/10/13.
 */
public class Composite implements Component {

    private List<Component> childComponent = new ArrayList<Component>();

    public void addComponent(Component component){
        childComponent.add(component);
    }

    public void remoteComponent(Component component){
        childComponent.remove(component);
    }

    @Override
    public void show() {
        for (Component c:childComponent){
            c.show();
        }
    }
}
