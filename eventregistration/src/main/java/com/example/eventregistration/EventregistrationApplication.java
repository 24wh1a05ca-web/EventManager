package com.example.eventregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api")
@CrossOrigin
public class EventregistrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventregistrationApplication.class, args);
    }

    @PostMapping("/register")
    public String register(@RequestBody Registration registration) {

        return "Registration Successful!\n"
                + "Name: " + registration.getName()
                + "\nEmail: " + registration.getEmail()
                + "\nPhone: " + registration.getPhone()
                + "\nEvent: " + registration.getEventName();
    }
}

class Registration {

    private String name;
    private String email;
    private String phone;
    private String eventName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
