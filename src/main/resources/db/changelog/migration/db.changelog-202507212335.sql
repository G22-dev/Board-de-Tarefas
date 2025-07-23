--liquibase formatted sql
--changeset guilherme:202507212335
--comment: set unblock_reason nullable

ALTER TABLE BLOCKS MODIFY COLUMN unblock_reason VARCHAR(255) NULL;

--rollback ALTER TABLE BLOCKS MODIFY COLUMN unblock_reason VARCHAR(255) NULL