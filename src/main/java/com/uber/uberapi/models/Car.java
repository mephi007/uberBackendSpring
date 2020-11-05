package com.uber.uberapi.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "car")
public class Car extends Auditable {

    @OneToOne
    private Driver driver;

    @ManyToOne
    private Color color;

    private String plateNumber;

    private String brandAndModel;

    @Enumerated(value = EnumType.STRING)
    private CarType carType;




}
