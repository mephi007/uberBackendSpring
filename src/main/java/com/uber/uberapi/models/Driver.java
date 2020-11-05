package com.uber.uberapi.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "driver")
public class Driver {
    @OneToOne
    private User user;
    private Gender gender;
    private String name;

    @OneToOne(mappedBy = "driver")
    private Car car;

    private String license;

    @Temporal(value = TemporalType.DATE)
    private Date dob;

    @Enumerated( value = EnumType.STRING)
    private DriverApprovalStatus approvalStatus;

    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings = new ArrayList();

    private Boolean isAvailable;

    private String activeCity;

    @OneToOne
    private ExactLocation lastKnownExactLocation;

    @OneToOne
    private ExactLocation home;
}
