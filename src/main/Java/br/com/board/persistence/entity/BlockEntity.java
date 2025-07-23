package br.com.board.persistence.entity;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class BlockEntity {

    private Long id;
    private OffsetDateTime blockedAll;
    private String blockReason;
    private OffsetDateTime unblockedAll;
    private String unblockReason;

}
