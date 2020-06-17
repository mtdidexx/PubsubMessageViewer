package com.idexx.messaging.controllers

import com.idexx.messaging.domain.PubSubMessage
import com.idexx.messaging.services.MessageService
import io.micronaut.http.HttpResponse
import spock.lang.Specification


class SubscriptionControllerSpec extends Specification {
    def SubscriptionController controller = new SubscriptionController(new MessageService())

    def "Controller consumes a string body"() {
            when:
            HttpResponse<String> response = controller.subscriber(new PubSubMessage())

            then:
            response.body() == "success\n"
    }
}
