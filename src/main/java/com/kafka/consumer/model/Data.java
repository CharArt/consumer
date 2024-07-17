package com.kafka.consumer.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "data")
@NoArgsConstructor
@Getter
@Setter
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Long sensorId;

    private LocalDateTime timestamp;

    private double measurement;

    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    private MeasurementType measurementType;

    public enum MeasurementType {
        TEMPERATURE,
        VOLTAGE,
        POWER
    }

}
