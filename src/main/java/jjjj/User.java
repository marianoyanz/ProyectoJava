package jjjj;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"user\"")
public class User {
    @Id
    @Column(name = "id", nullable = false, length = Integer.MAX_VALUE)
    private String id;

    @Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
    private String name; //oo

    @Column(name = "dni", nullable = false, length = Integer.MAX_VALUE)
    private String dni;

    @Column(name = "location", length = Integer.MAX_VALUE)
    private String location;

    @Column(name = "adress", length = Integer.MAX_VALUE)
    private String adress;

    @Column(name = "password", nullable = false, length = Integer.MAX_VALUE)
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}