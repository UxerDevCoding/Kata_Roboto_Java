package com.hevia;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RobotoTest {

    @Test

    public void greeting() {

        Roboto roboto = new Roboto();
        String initialGreeting = roboto.greetingReply("Hello");
        assertThat(initialGreeting, equalTo("Hello Human"));
    }
    
    @Test

    public void weatherReply() {

        Roboto roboto = new Roboto();
        String weatherCity= roboto.greetingReply("What is the weather in Gijon?");
        assertThat(weatherCity, equalTo("You go to Gijon and look at it"));
    }
}
