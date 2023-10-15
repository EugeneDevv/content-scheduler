package com.eugenedevv.calenderscheduler.repository;

import com.eugenedevv.calenderscheduler.model.Content;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findAllByTitleContains(String keyWord);

    @Query("""
            SELECT * FROM Content
            where status = :status
            """)
    List<Content> listByStatus(@Param("status") String status);
}
