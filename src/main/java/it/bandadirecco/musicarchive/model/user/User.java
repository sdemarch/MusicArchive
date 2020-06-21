package it.bandadirecco.musicarchive.model.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.codec.digest.DigestUtils;

import javax.persistence.*;

/**
 * User entity for login and navigation
 *
 * @author Stefano Demarchi
 */
@Entity
public class User {
    /**
     * Unique user Id (primary key)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * User first name
     */
    private String name;

    /**
     * User last name
     */
    private String lastName;

    /**
     * Unique username
     */
    @Column(unique = true, nullable = false)
    private String userName;

    /**
     * Unique user email
     */
    @Column(unique = true, nullable = false)
    private String email;

    /**
     * User password
     */
    @JsonIgnore
    @Column(nullable = false)
    private String password;

    public User() {
        this.name = "TestName";
        this.lastName = "TestLastName";
        this.userName = "TestUser" + this.id;
        this.email = "TestEmail_" + this.userName;
        this.password = "test";
    }

    public User(String name, String lastName, String userName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = DigestUtils.sha256Hex(password);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = DigestUtils.sha256Hex(password);
    }

    @Override
    public String toString() {
        return "User {" +
                "id = " + id +
                ", name = '" + name + "'" +
                ", lastName = '" + lastName + "'" +
                ", userName = '" + userName + "'" +
                ", email = '" + email + "'" +
                "}";
    }
}
