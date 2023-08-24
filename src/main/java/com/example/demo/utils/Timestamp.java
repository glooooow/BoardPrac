package com.example.demo.utils;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass /* BaseEntity 정의를 위한 Superclass 선언 */
@Getter
public abstract class Timestamp {

    @CreatedDate
    protected LocalDateTime createdAt;
}
