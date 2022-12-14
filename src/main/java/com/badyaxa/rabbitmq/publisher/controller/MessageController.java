package com.badyaxa.rabbitmq.publisher.controller;

import com.badyaxa.rabbitmq.publisher.service.MessageSenderService;
import javax.validation.constraints.NotEmpty;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {
    private final MessageSenderService messageSenderService;

    @PostMapping(path = "/message")
    public void send(@RequestBody @NotEmpty String message) {
        messageSenderService.send(message);
    }
}
