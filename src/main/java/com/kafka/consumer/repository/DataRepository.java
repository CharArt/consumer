package com.kafka.consumer.repository;

import com.kafka.consumer.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {

}
