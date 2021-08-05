package randomlovers.persistence.model;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "topic")
public class Topic implements Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String optionAName;
    private Integer optionA;
    private String optionBName;
    private Integer optionB;
    private Integer totalVotes;

    private String imagePath;
    private String description;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "topic",
            fetch = FetchType.EAGER
    )
    @Transient
    private Map<Integer, Comment> comments;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOptionAName() {
        return optionAName;
    }
    public void setOptionAName(String optionAName) {
        this.optionAName = optionAName;
    }

    public String getOptionBName() {
        return optionBName;
    }
    public void setOptionBName(String optionBName) {
        this.optionBName = optionBName;
    }

    public Integer getOptionA() {
        return optionA;
    }
    public void setOptionA(Integer optionA) {
        this.optionA = optionA;
    }

    public Integer getOptionB() {
        return optionB;
    }
    public void setOptionB(Integer optionB) {
        this.optionB = optionB;
    }

    public Integer getTotalVotes() {
        return totalVotes;
    }
    public void setTotalVotes(Integer totalVotes) {
        this.totalVotes = totalVotes;
    }

    public String getImagePath() {
        return imagePath;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<Integer, Comment> getComments() {
        return comments;
    }
    public void setComments(Map<Integer, Comment> comments) {
        this.comments = comments;
    }

}
