package com.lad666.videocreatorservice.Service;

import com.lad666.videocreatorservice.Exception.ResourceNotFoundException;
import com.lad666.videocreatorservice.Model.VideoCreator;
import com.lad666.videocreatorservice.Repository.VideoCreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoCreatorService implements VideoCreatorServiceInterface {
    @Autowired
    private VideoCreatorRepository videoCreatorRepository;
    @Override
    public List<VideoCreator> getAllVideoCreators() {
        return videoCreatorRepository.findAll();
    }

    @Override
    public VideoCreator getVideoCreatorById(int id) throws ResourceNotFoundException {
        Optional<VideoCreator> videoCreator = videoCreatorRepository.findById(id);
        if (videoCreator.isPresent()){
            return videoCreator.get();
        } else {
            throw new ResourceNotFoundException("VideoCreator", "Id", id);
        }
    }
}
