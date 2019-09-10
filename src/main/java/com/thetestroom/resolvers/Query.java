package com.thetestroom.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.thetestroom.beans.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private Message message;

    public String hello(String name) {
        message.setMessage(name);
        return "hello " + message.getMessage();
    }
}
