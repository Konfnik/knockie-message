package com.knockie.message.api;

import com.knockie.message.dto.MessageDto;
import com.knockie.message.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/message/messages")
public class MessageApi {

    @Autowired
    IMessageService iMessageService;

    @GetMapping()
    public Flux<MessageDto> getMessagesByChannelId(@RequestParam Long channelId) {
        return iMessageService.getMessagesByChannelId(channelId);
    }
}
