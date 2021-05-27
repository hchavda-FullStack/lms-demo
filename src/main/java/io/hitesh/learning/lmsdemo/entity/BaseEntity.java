package io.hitesh.learning.lmsdemo.entity;

import lombok.Data;

import javax.persistence.Column;
import java.time.Instant;

@Data
public abstract class BaseEntity {
    @Column
    protected Instant createDateTime;
    @Column
    protected Instant updateDateTime;

}
