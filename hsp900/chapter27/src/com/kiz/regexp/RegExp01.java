package com.kiz.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp01 {
    public static void main(String[] args) {
        String content = "https://www.youtube.com/watch?v=vIW1Yh7m7dM";
        String regStr = "^((http|https)://)";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if(matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }
    }
}
