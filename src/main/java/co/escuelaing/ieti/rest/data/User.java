package co.escuelaing.ieti.rest.data;

import java.util.Date;

import co.escuelaing.ieti.rest.dto.UserDto;

public class User {
    private int id;
    private String name;
    private String email;
    private String lastName;
    private Date created;

    public User(int id,String name,String email,String lastName,Date created){
        this.id=id;
        this.name=name;
        this.email=email;
        this.lastName=lastName;
        this.created=created;
    }

    public User(UserDto user,int id){
        this.id=id;
        this.name=user.getName();
        this.email=user.getEmail();
        this.lastName=user.getLastName();
        this.created=user.getCreated();
    }

    public Date getCreated() {
        return created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
