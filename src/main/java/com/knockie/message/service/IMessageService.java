package com.knockie.message.service;

import com.knockie.message.dto.MessageDto;
import reactor.core.publisher.Flux;

public interface IMessageService {

    Flux<MessageDto> getMessagesByChannelId(Long channelId);
}
