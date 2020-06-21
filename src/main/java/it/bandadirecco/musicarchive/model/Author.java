package it.bandadirecco.musicarchive.model;

import javax.persistence.*;

/**
 * Author entity describes composers and arrangers
 *
 * @author Stefano Demarchi
 */
@Entity
public class Author {
    /**
     * Unique author Id (primary key)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * Author first name
     */
    @Column(nullable = false)
    private String name;

    /**
     * Author last name
     */
    @Column(nullable = false)
    private String lastName;

    /**
     * Optional author pseudonym
     */
    private String pseudonym;

    public Author() {
        this.name = "No name";
        this.lastName = "No name";
    }

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Author(String name, String lastName, String pseudonym) {
        this.name = name;
        this.lastName = lastName;
        this.pseudonym = pseudonym;
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

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    @Override
    public String toString() {
        return "Author {" +
                "id = " + id +
                ", name = '" + name + "'" +
                ", lastName = '" + lastName + "'" +
                ", pseudonym = '" + pseudonym + "'" +
                "}";
    }
}
