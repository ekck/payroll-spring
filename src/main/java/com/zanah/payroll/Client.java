package com.zanah.payroll;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

    @Table(name = "client")
    public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false, length = 100)
        private String name;
    @Column(name = "email_address")
        private String email;

        // getter, setters, contructors
    }
