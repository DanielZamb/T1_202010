package model.data_structures;
import com.google.gson.*;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

public class GsonParser {

    public static void main(String[] args) throws MalformedURLException, IOException {
        Gson gson = new Gson();
        String json = "./data/comparendos_dei_2018_BIG.geojson";
        BufferedReader br = new BufferedReader(new FileReader(json));
        Comparendos comparendos = gson.fromJson(br, Comparendos.class);
        if (comparendos != null){
        for(Features feature: comparendos.darListaFeatures()) {
            System.out.println("localidad del comparendo :"+ feature.DarProperties().getLOCALIDAD());
            }
        }
        br.close();
    }
}

