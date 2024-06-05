package com.kafka.consumer.service;

import com.kafka.consumer.model.Data;

public interface KafkaDataService {

    void handle(Data data);
}