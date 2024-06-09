package com.knockie.message.repository;

import com.knockie.message.entity.MessageEntity;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface IMessageRepository extends R2dbcRepository<MessageEntity, Long> {

    @Query("SELECT * FROM main.message WHERE channel_id = :channelId;")
    Flux<MessageEntity> findMessagesByChannelId(Long channelId);
}
