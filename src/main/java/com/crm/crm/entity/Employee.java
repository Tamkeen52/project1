package com.crm.crm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    private String name;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {

        return name;
    }

    public String getEmailId() {

        return emailId;
    }

    public void setEmailId(String emailId) {

        this.emailId = emailId;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Column(name = "email_id", nullable = false, unique = true)
    private String emailId;

    @Column(name = "mobile", nullable = false, unique = true,length = 10)
    private String mobile;

}