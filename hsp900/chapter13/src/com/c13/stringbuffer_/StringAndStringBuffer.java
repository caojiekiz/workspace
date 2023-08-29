package com.c13.stringbuffer_;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        String str = "hello tom";
        StringBuffer stringBuffer1 = new StringBuffer(str);
        stringBuffer1 = stringBuffer1.append(str);
        //
        StringBuffer stringBuffer3 = new StringBuffer("hspjy");
        String s = stringBuffer3.toString();
        //String s1 = new StringBuffer();
    }
}
