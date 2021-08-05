package randomlovers.persistence.model;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment implements Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer numberOfLikes;
    private Integer numberOfDislikes;
    private Integer totalPoints;

    @ManyToOne
    private User user;

    @ManyToOne
    private Topic topic;

    private String content;

    @Override
    public Integer getId() {
        return id;
    }
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumberOfLikes() {
        return numberOfLikes;
    }
    public void setNumberOfLikes(Integer numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public Integer getNumberOfDislikes() {
        return numberOfDislikes;
    }
    public void setNumberOfDislikes(Integer numberOfDislikes) {
        this.numberOfDislikes = numberOfDislikes;
    }

    public Integer getTotalPoints() {
        return totalPoints;
    }
    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Topic getTopic() {
        return topic;
    }
    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
