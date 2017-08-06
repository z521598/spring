package com.baidu.langshiquan.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/8/6.
 */
public class RegexMainTest {
    public static void main(String[] args) {
        String regexStr = "hhhhello";
//        System.out.println(regexStr.matches(".{0,3}"));
        String regex = "^(\\S){3,5}\\s*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(regexStr);
        while (matcher.find()) {
            System.out.println(matcher.group() + " postion at " + matcher.start() + "-" + matcher.end());
        }
    }
}
