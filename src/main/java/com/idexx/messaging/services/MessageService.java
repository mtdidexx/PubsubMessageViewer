package com.idexx.messaging.services;

import com.idexx.messaging.domain.PubSubMessage;
import io.micronaut.core.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import javax.validation.constraints.NotNull;
import java.util.Base64;

@Singleton
public class MessageService {
    private static final Logger log = LoggerFactory.getLogger(MessageService.class);

    public void handleMessage(@NotNull PubSubMessage message) {
        log.info("Message received: {}", message);
        String data = message.getMessage().getData();
        String target = !StringUtils.isEmpty(data) ? new String(Base64.getDecoder().decode(data)) : "Message key is empty";
        log.info("Decoded data: {}", target);
    }
}
