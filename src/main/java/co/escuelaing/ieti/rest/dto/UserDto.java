package co.escuelaing.ieti.rest.dto;

import java.util.Date;

public class UserDto {
    private String name;
    private String email;
    private String lastName;
    private Date created;

    public UserDto(String name,String email, String lastName, Date created){
        this.name=name;
        this.email=email;
        this.lastName=lastName;
        this.created=created;
    }

    public Date getCreated() {
        return created;
    }
    
    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }
}
