package com.c13.stringbuffer_;

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        s.append(',');
        s.append("zhangsanfeng");
        s.append("zhaomin").append(100).append(true).append(10.5);
        System.out.println(s);

        s.delete(11,14);
        System.out.println(s);
        //修改 索引9-11的字符[9,11)
        s.replace(9,11,"周芷若");
        System.out.println(s);
        //插入
        s.insert(9,"赵敏");
        System.out.println(s);
        //长度
        System.out.println(s.length());
    }
}
