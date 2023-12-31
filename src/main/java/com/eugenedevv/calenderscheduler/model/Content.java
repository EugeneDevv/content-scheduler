package com.eugenedevv.calenderscheduler.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table
public record Content(
        @Id
        Integer id,
        @NotBlank
        String title,
        String desc,
        Status status,
        Type content_type,
        LocalDateTime date_created,
        LocalDateTime date_updated,
        String url

) {
}
