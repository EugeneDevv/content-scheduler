package com.eugenedevv.calenderscheduler.model;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        String title,
        String desc,
        Status status,
        Type content_type,
        LocalDateTime date_created,
        LocalDateTime date_updated,
        String url

) {
}
