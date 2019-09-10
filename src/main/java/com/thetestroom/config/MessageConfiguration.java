package com.thetestroom.config;

import com.thetestroom.beans.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Bean
    public Message getMessage() {
        return new Message();
    }
}
