package api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("cards.json")
    Call<List<GetCard>> getCard();
}
