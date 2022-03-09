package com.hevia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Roboto {

    public String greetingReply(String sentence) {

    Pattern pattern = Pattern.compile(("What is the weather in (?<city>\\w+)\\?"));
    Matcher matcher = pattern.matcher(sentence);
    if (matcher.find()) {
        return "You go to " +matcher.group("city")+ " and look at it";
    }
    return "Hello Human";
    }

}
