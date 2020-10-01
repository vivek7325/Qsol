package com.application.kurukshetrauniversitypapers;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Url;

public class YoutubeAPI {

    public static final String BASE_URL= "https://www.googleapis.com/youtube/v3/";
    public static final String request="playlistItems?part=snippet&maxResults=50&playlistId=PLUhzUGU9G_1tZiY0Ec7qMk2yt1CbCZjh6&&key=YOUR_KEY";

public interface HomeVideo{
    @GET
    Call<Apimodel> getYT(@Url String url);

}
private static HomeVideo homeVideo=null;

public static HomeVideo getHomeVideo(){
    if(homeVideo == null){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        homeVideo=retrofit.create(HomeVideo.class);
    }
return homeVideo;
}

}
