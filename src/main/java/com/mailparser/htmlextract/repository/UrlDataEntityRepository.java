package com.mailparser.htmlextract.repository;

import com.mailparser.htmlextract.entity.UrlDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlDataEntityRepository  extends CrudRepository<UrlDataEntity, Long> {
}
