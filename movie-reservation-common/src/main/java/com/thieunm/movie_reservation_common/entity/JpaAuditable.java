package com.thieunm.movie_reservation_common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Timestamp;

@Getter
@Setter
@MappedSuperclass
public abstract class JpaAuditable<U> {

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private Timestamp createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", insertable = false)
    private Timestamp updatedAt;

    @CreatedBy
    @Column(name = "created_by", updatable = false)
    private U createdBy;

    @LastModifiedBy
    @Column(name = "updated_by")
    private U updatedBy;
}
