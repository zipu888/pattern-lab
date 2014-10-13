package com.xiaohao.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by xiaohao on 2014/10/13.
 * Four Different Ways to Check If an Array Contains a Value
 */
public class FindValueFromArray {

    /**
     * use list to find
     * @param arrayStr
     * @param value
     * @return
     */
    public static boolean useList(String[] arrayStr,String value){
        return Arrays.asList(arrayStr).contains(value);
    }

    /**
     *
     * @param arrayStr
     * @param value
     * @return
     */
    public static boolean useSet(String[] arrayStr,String value){
        Set<String> sets =(HashSet<String>)Arrays.asList(arrayStr);
        return sets.contains(value);
    }

    /**
     *
     * @param arrayStr
     * @param value
     * @return
     */
    public static boolean useLoop(String[] arrayStr,String value){

        for(String str:arrayStr){
            if(str.equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * use binary search is BEST
     * @param arrayStr
     * @param value
     * @return
     */
    public static boolean useArraysBinarySearch(String[] arrayStr,String value){
        int a =Arrays.binarySearch(arrayStr,value);
        if(a>0){
            return true;
        }
        return false;
    }

}
