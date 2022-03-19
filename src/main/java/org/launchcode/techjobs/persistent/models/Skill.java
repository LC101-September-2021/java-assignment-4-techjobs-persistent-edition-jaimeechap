package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message= "Please enter a skill description.")
    @Size(min=2, max=100, message="Your entry for a skill description must be between 2 and 100 characters.")
    public String description;

    public Skill(String description) {
        this.description = description;
    }
    public Skill () {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}