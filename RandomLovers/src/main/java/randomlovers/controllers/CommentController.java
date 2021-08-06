package randomlovers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import randomlovers.persistence.model.Comment;
import randomlovers.services.CommentService;
import randomlovers.services.TopicService;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequestMapping("/comments")
public class CommentController {

    private CommentService commentService;
    private TopicService topicService;

    @RequestMapping(method = RequestMethod.GET, path="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Comment>> listAllComents(@PathVariable Integer id){
        return new ResponseEntity<>(topicService.getAllComments(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = "like/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Comment> addLike(@PathVariable Integer id){
        commentService.addLike(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = "dislike/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Comment> addDislike(@PathVariable Integer id){
        commentService.addDislike(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // getters && setters
    @Autowired
    public void setCommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    @Autowired
    public void setTopicService(TopicService topicService) {
        this.topicService = topicService;
    }

}
