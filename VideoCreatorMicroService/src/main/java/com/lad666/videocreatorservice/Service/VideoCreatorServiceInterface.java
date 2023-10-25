package com.lad666.videocreatorservice.Service;

import com.lad666.videocreatorservice.Exception.ResourceNotFoundException;
import com.lad666.videocreatorservice.Model.VideoCreator;

import java.util.List;

public interface VideoCreatorServiceInterface {
    List<VideoCreator> getAllVideoCreators();
    VideoCreator getVideoCreatorById(int id) throws ResourceNotFoundException;
}
