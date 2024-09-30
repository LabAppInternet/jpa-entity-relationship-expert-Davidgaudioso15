package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String title;
    private String content;
    private LocalDateTime creationDate;
    private Long id;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private UserLab owner;
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })

    @JoinTable(name = "note_tag",
            joinColumns = @JoinColumn(name = "note_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )

    Set<Tag> tags = new HashSet<>();

    public Note(){
        creationDate = LocalDateTime.now();
    }

    public Note(String title, String content, LocalDateTime creationDate, UserLab owner, Set<Tag> tags) {
        this.title = title;
        this.content = content;
        this.creationDate = creationDate;
        this.owner = owner;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public Long getId() {
        return id;
    }

    public UserLab getOwner() {
        return owner;
    }


    public void setOwner(UserLab owner) {
        this.owner = owner;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }
}

