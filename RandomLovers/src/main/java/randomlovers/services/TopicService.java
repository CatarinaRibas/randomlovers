package randomlovers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import randomlovers.persistence.dao.TopicDao;
import randomlovers.persistence.model.Comment;
import randomlovers.persistence.model.Topic;

import java.util.List;
import java.util.Map;

@Service
public class TopicService {

    private TopicDao topicDao;

    @Transactional
    public void addTopic(Topic topic) {
        topicDao.saveOrUpdate(topic);
    }

    public Topic getTopicById(Integer id) {
        return topicDao.findById(id);
    }

    public List<Topic> getAllTopics(){
        return topicDao.findAll();
    }

    @Transactional
    public void addOptionA(Integer id) {

        Topic topic = topicDao.findById(id);

        topic.setOptionA(topicDao.findById(id).getOptionA()+1);
        topic.setTotalVotes(topicDao.findById(id).getTotalVotes()+1);

        topicDao.saveOrUpdate(topic);
    }

    @Transactional
    public void addOptionB(Integer id) {

        Topic topic = topicDao.findById(id);

        topic.setOptionB(topicDao.findById(id).getOptionB()+1);
        topic.setTotalVotes(topicDao.findById(id).getTotalVotes()+1);

        topicDao.saveOrUpdate(topic);
    }

    @Transactional
    public void addComment(Integer id, Comment comment) {
        Topic topic = topicDao.findById(id);
        topic.getComments().put(comment.getId(), comment);
        topicDao.saveOrUpdate(topic);
    }

    public Map<Integer,Comment> getAllComments(Integer id) {
        return topicDao.findById(id).getComments();
    }

    //getters &6 setters
    @Autowired
    public void setTopicDao(TopicDao topicDao) {
        this.topicDao = topicDao;
    }

}
