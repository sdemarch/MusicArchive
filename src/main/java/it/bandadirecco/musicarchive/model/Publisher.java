package it.bandadirecco.musicarchive.model;

import javax.persistence.*;

/**
 * Publisher entity collects the data on editors and
 * publishers for music pieces
 *
 * @author Stefano Demarchi
 */
@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true, nullable = false)
    private String name;

    private String state;

    public Publisher() {
        this.name = "No name";
    }

    public Publisher(String name, String state) {
        this.name = name;
        this.state = state;
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

    public String getLocation() {
        return state;
    }

    public void setLocation(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Publisher {" +
                "id = " + id +
                ", name = '" + name + "'" +
                ", state = '" + state + "'" +
                "}";
    }
}
