package services;

import model.Comment;

public class CommentService {

    private TopicService topicService;

    public void addLike(Integer tid, Integer cid) {
        Comment comment = topicService.getTopicById(tid).getComments().get(cid);
        comment.setNumberOfLikes(comment.getNumberOfLikes()+1);
        comment.setTotalPoints(comment.getTotalPoints()+1);
    }

    public void addDislike(Integer tid, Integer cid) {
        Comment comment = topicService.getTopicById(tid).getComments().get(cid);
        comment.setNumberOfDislikes(comment.getNumberOfDislikes()+1);
        comment.setTotalPoints(comment.getTotalPoints()-1);
    }

    public Comment getCommentById(Integer tid, Integer cid) {
        return topicService.getCommentById(tid,cid);
    }

    // getters && setters
    public void setTopicService(TopicService topicService) {
        this.topicService = topicService;
    }

}
