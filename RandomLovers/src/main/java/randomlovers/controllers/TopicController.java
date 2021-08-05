package randomlovers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import randomlovers.persistence.model.Topic;
import randomlovers.services.TopicService;

import java.util.List;

@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequestMapping("/topics")
public class TopicController {

    private TopicService topicService;

    @Autowired
    public void setTopicService(TopicService topicService) {
        this.topicService = topicService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/all"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Topic>> listTopics(){
        return new ResponseEntity<>(topicService.getAllTopics(), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.GET, path="/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Topic> showTopic(@PathVariable Integer id){

        Topic topic = topicService.getTopicById(id);
        if(topic == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(topic, HttpStatus.OK);
    }


}
