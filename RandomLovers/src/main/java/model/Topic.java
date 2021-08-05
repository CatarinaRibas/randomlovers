package model;

import java.util.Map;

public class Topic {

    private Integer id;

    private String name;

    private Integer optionA;
    private Integer optionB;
    private Integer totalVotes;

    private String description;
    private Map<Integer,Comment> comments;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<Integer,Comment> getComments() {
        return comments;
    }
    public void setComments(Map<Integer,Comment> comments) {
        this.comments = comments;
    }

}
