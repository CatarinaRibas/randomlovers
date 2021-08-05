package services;

import model.Comment;
import model.Topic;

import java.util.Map;

public class TopicService {

    private Map<Integer,Topic> topicList;

    public void addTopic(Topic topic) {
        topicList.put(topic.getId(), topic);
    }

    public Topic getTopicById(Integer id) {
        return topicList.get(id);
    }

    public void addOptionA(Topic topic) {
        topic.setOptionA(topic.getOptionA()+1);
        topic.setTotalVotes(topic.getTotalVotes()+1);
    }

    public void addOptionB(Topic topic) {
        topic.setOptionB(topic.getOptionB()+1);
        topic.setTotalVotes(topic.getTotalVotes()+1);
    }

    public void addComment(Topic topic, Comment comment) {
        topic.getComments().put(comment.getId(), comment);
    }

    public Comment getCommentById(Integer tid, Integer cid) {
        return getTopicById(tid).getComments().get(cid);
    }

    //getters &6 setters
    public void setTopicList(Map<Integer,Topic> topicList) {
        this.topicList = topicList;
    }

}
