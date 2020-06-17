package com.idexx.messaging.controllers;

import com.idexx.messaging.domain.PubSubMessage;
import com.idexx.messaging.services.MessageService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

@Controller("/subscription")
public class SubscriptionController {
    private static final Logger log = LoggerFactory.getLogger(SubscriptionController.class);
    private MessageService service;

    @Inject
    public SubscriptionController(MessageService service) {
        this.service = service;
    }

    @Post(value = "/logMessage")
    public HttpResponse<String> subscriber(@Body PubSubMessage pubsubMessage) {
        service.handleMessage(pubsubMessage);
        return HttpResponse.ok("success\n");
    }
}
