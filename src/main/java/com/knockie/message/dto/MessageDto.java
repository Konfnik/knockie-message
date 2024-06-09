package com.knockie.message.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MessageDto {

    private Long id;

    private Long senderId;

    private Long channelId;

    private String content;

    private Integer type;

    private Timestamp sendDtm;
}
