package com.thetestroom.beans;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class MessageTest {

    @Test
    public void shouldBeAbleToSetMessage() {
        // Given
        final String messageString = "Test Name";
        Message message = new Message();

        // When
        message.setMessage(messageString);

        // Then
        Assert.assertThat(message.getMessage(), is(messageString));
    }
}