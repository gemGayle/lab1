package org.example;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>();
        data.put("name", "Olexandr");
        data.put("lastName", "Andreev");
        data.put("group", "IO-33");

        Gson gson = new Gson();

        String json = gson.toJson(data);

        System.out.println(json);
    }
}