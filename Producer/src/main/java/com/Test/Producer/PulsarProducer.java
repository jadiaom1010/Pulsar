package com.Test.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.pulsar.client.api.*;

@Service
public class PulsarProducer {

    private final Producer<AlertMessage> producer;
    @Autowired
    public PulsarProducer(PulsarClient pulsarClient) throws PulsarClientException {
        this.producer = pulsarClient.newProducer(Schema.JSON(AlertMessage.class))
                .topic("alert-topic")
                .create();
    }

    public void sendAlert(String topic, AlertMessage alertMessage) throws PulsarClientException {
        producer.send(alertMessage);
    }
}
