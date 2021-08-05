package randomlovers.persistence.model;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="user")
public class User implements Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String password;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "user",
            fetch = FetchType.EAGER
    )
    private Map<Integer,Comment> comments;

    @Override
    public Integer getId() {
        return id;
    }
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Map<Integer, Comment> getComments() {
        return comments;
    }
    public void setComments(Map<Integer, Comment> comments) {
        this.comments = comments;
    }
}
