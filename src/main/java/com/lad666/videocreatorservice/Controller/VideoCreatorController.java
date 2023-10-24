package com.lad666.videocreatorservice.Controller;

import com.lad666.videocreatorservice.Exception.ResourceNotFoundException;
import com.lad666.videocreatorservice.Model.VideoCreator;
import com.lad666.videocreatorservice.Service.VideoCreatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/videocreators/api/edufy")
public class VideoCreatorController {

    @Autowired
    private VideoCreatorService videoCreatorService;

    @GetMapping("/allvideocreators")
    public List<VideoCreator> getAllVideoCreators(){
        return videoCreatorService.getAllVideoCreators();
    }

    @GetMapping("/allvideocreators/{id}")
    public ResponseEntity<VideoCreator> getVideoCreatorById(@PathVariable("id") int id) throws ResourceNotFoundException {
        return new ResponseEntity<>(videoCreatorService.getVideoCreatorById(id), HttpStatus.OK);
    }
}
