package it.bandadirecco.musicarchive.model;

import javax.persistence.*;

/**
 * Piece entity represents a concrete sheet music file to
 * be registered in the catalog
 *
 * @author Stefano Demarchi
 */
@Entity
public class Piece {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private long folderNumber;

    @OneToOne
    private Author composer;

    @OneToOne
    private Author arranger;

    @OneToOne
    private Publisher publisher;

    public Piece() {
        this.title = "No title";
        this.folderNumber = 0;
        this.composer = new Author();
        this.arranger = new Author();
        this.publisher = new Publisher();
    }

    public Piece(String title, long folderNumber, Author composer, Author arranger, Publisher publisher) {
        this.title = title;
        this.folderNumber = folderNumber;
        this.composer = composer;
        this.arranger = arranger;
        this.publisher = publisher;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getFolderNumber() {
        return folderNumber;
    }

    public void setFolderNumber(long folderNumber) {
        this.folderNumber = folderNumber;
    }

    public Author getComposer() {
        return composer;
    }

    public void setComposer(Author composer) {
        this.composer = composer;
    }

    public Author getArranger() {
        return arranger;
    }

    public void setArranger(Author arranger) {
        this.arranger = arranger;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
