package com.uber.uberapi.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String username;
    private String password;
    @ManyToMany
    private List<Role> roles = new ArrayList();
}
