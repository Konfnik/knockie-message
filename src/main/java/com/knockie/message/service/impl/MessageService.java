package com.knockie.message.service.impl;

import com.knockie.message.dto.MessageDto;
import com.knockie.message.repository.IMessageRepository;
import com.knockie.message.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class MessageService implements IMessageService {

    @Autowired
    IMessageRepository iMessageRepository;

    @Override
    public Flux<MessageDto> getMessagesByChannelId(Long channelId) {
        return iMessageRepository.findMessagesByChannelId(channelId).map(message -> MessageDto.builder()
                .id(message.getId())
                .senderId(message.getUserId())
                .channelId(message.getChannelId())
                .content(message.getContent())
                .type(message.getType())
                .sendDtm(message.getInsDtm())
                .build());
    }
}
