package com.practice.spring.practice.code.entity;
//import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "customer_id", length = 45)
    private int customerId;

    @Column(name = "customer_name",length = 100,nullable = false)
    private String customerName;

    @Column(name = "customer_address")
    private String customerAddress;


    @Column(name = "contact_numbers")
    private int contactNumber;

    @Column(name = "nic")
    private String nic;

    @Column(name = "active_state")
    private boolean activeState;



    // Getter and Setter methods
}

