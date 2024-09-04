package com.Test.Producer;

import com.Test.Producer.AlertMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alerts")
public class AlertController {

    @Autowired
    private PulsarProducer pulsarProducer;

    @PostMapping("/send")
    public String sendAlert(@RequestBody AlertMessage alertMessage) {
        try {
            pulsarProducer.sendAlert("alert-topic", alertMessage);
            return "Message sent successfully!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to send message.";
        }
    }
}
