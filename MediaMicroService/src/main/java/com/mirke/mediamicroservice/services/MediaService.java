package com.mirke.mediamicroservice.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mirke.mediamicroservice.models.Song;
import com.mirke.mediamicroservice.repo.*;
import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.Reader;
import java.util.*;
import java.util.stream.Collectors;


@Service
public class MediaService implements MediaServiceInterface {

    @Autowired
    SongRepository songRepository;

    WebClient client = WebClient.create("http://localhost:9090/api/edufy/genre");

    @Override
    public List<Song> findAllMedia() {
        // First part
        Mono<Object[]> response = client.get()
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Object[].class).log();
        Object[] objects = response.block();

        System.out.println(Arrays.toString(objects));
        List<Song> songs = songRepository.findAll();
        return new ArrayList<>(songs);
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
        return o.toMap();
    }


}
