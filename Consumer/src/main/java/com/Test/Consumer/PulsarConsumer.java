package com.Test.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.pulsar.client.api.*;

@Service
public class PulsarConsumer {

    @Autowired
    public PulsarConsumer(PulsarClient pulsarClient) throws PulsarClientException {
        Consumer<AlertMessage> consumer = pulsarClient.newConsumer(Schema.JSON(AlertMessage.class))
                .topic("alert-topic")
                .subscriptionName("my-subscription")
                .subscribe();

        new Thread(() -> {
            while (true) {
                try {
                    Message<AlertMessage> msg = consumer.receive();
                    System.out.println("Received message: " + msg.getValue());
                    consumer.acknowledge(msg);
                } catch (PulsarClientException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
