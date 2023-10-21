package com.mirke.mediamicroservice.services;

import com.mirke.mediamicroservice.models.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;


public interface MediaServiceInterface
{
    List<Object> findAllMedia();

    }
