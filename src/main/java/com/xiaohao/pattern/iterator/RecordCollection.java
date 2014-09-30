package com.xiaohao.pattern.iterator;

/**
 * Created by xiaohao on 2014/9/30.
 */
public class RecordCollection implements IContainer {

    private String recordArray[] = {"first","second","third","fourth","fifth"};

    @Override
    public IIterator createIterator() {
        return null;
    }

    private class RecordIterator implements IIterator{
        private int index;

        public boolean hasNext(){
            if (index < recordArray.length)
                return true;
            else
                return false;
        }

        public Object next(){
            if (this.hasNext())
                return recordArray[index++];
            else
                return null;
        }
    }
}
