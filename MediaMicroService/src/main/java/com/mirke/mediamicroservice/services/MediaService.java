package com.mirke.mediamicroservice.services;

import com.mirke.mediamicroservice.models.Media;
import com.mirke.mediamicroservice.models.Podcast;
import com.mirke.mediamicroservice.models.Song;
import com.mirke.mediamicroservice.models.Video;
import com.mirke.mediamicroservice.repo.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.*;


@Service
public class MediaService implements MediaServiceInterface {

    @Autowired
    SongRepository songRepository;

    @Autowired
    private PodcastRepository podcastRepository;

    @Autowired
    private VideoRepository videoRepository;

    WebClient client = WebClient.create("http://localhost:9090/api/edufy/genre");

    private ArrayList<Media> getAllMediaFromRepo(){
        List<Song> songs = songRepository.findAll();
        List<Podcast> podcast = podcastRepository.findAll();
        List<Video> video = videoRepository.findAll();

        ArrayList<Media> listMedia = new ArrayList<>();
        listMedia.addAll(songs);
        listMedia.addAll(podcast);
        listMedia.addAll(video);
        return listMedia;
    }

    @Override
    public List<Object> findAllMedia() {

        // First part
        Mono<Object[]> response = client.get()
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Object[].class).log();
        Object[] objects = response.block();

        assert objects != null;

        ArrayList<Media> listMedia = getAllMediaFromRepo();

        ArrayList<JSONObject> listObjects = new ArrayList<>();

        for (Media m:listMedia) {
            JSONObject jo = new JSONObject();
            jo.put("genre", objects[m.getFk_genre()]);
            jo.put("media_name", m.getName());
            jo.put("type", m.getMediaType());
            listObjects.add(jo);
        }

        JSONArray ja = new JSONArray(listObjects);

        return ja.toList();
    }
///*******************************************************
    public Map<String, Object> getSongById(int id){
        Song song = songRepository.findById(id).orElseThrow();
        JSONObject o = new JSONObject();

        Mono<Object[]> response = client.get()
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Object[].class).log();
        Object[] objects = response.block();

        assert objects != null;
        o.put("genre", objects[song.getFk_genre()]);
        o.put("media_name", song.getName());
        o.put("type", song.getMediaType());
        return o.toMap();
    }


}
