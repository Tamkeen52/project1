package com.crm.crm.payload;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collector;


public class EmployeeDto {
    private Long id;
    @Size(min =3 , message = "At least 3 chars required")
    private String name;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Email
    private String emailId;

    @Size(min=10, max =10,message = "should be 10 digits required")
    private String mobile;


}
