package com.hamza_tahir.sunshine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {

    /**
     * Given a string of the form returned by the api call:
     * http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7
     * retrieve the maximum temperature for the day indicated by dayIndex
     * (Note: 0-indexed, so 0 would refer to the first day).
     */
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
            JSONObject weatherJSON = new JSONObject(weatherJsonStr);
            JSONArray list = weatherJSON.getJSONArray("list");

            JSONObject dayIndexItem = (JSONObject) list.get(dayIndex);
            JSONObject tempJSON = (JSONObject) dayIndexItem.getJSONObject("temp");

            return tempJSON.getDouble("max");
    }


}
