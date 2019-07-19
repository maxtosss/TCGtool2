package api;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("cardinfo.php")
    Call<GetCard> getCard();
}
