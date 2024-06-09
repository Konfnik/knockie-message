package com.knockie.message.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MessageEntity {

    private Long id;

    private Long userId;

    private Long channelId;

    private Integer type;

    private String content;

    private Boolean isDel;

    private Timestamp insDtm;

    private Timestamp updDtm;
}
