package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message= "Please enter a location.")
    @Size(min=2, max=50, message="Your location must be between 2 and 50 characters.")
    public String location;

    public Employer(String location) {
        this.location = location;
    }
    public Employer () {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
