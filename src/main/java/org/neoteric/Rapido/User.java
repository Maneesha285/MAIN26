package org.neoteric.Rapido;

public class User {

    public String name;
    public String id;
    public String mobilenumber;
    public String email;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", mobilenumber='" + mobilenumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
