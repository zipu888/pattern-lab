package com.xiaohao.pattern.iterator;

/**
 * Created by xiaohao on 2014/9/30.
 */
public class TestIterator {

    public static void main(String[] args){

        RecordCollection recordCollection = new RecordCollection();

        IIterator iIterator =recordCollection.createIterator();

        while (iIterator.hasNext()){

            System.out.println(iIterator.next());

        }
    }

}
