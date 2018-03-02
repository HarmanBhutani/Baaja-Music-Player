package music.harmanbhutani.baaja.lastfmapi.models;

import com.google.gson.annotations.SerializedName;
import music.harmanbhutani.baaja.lastfmapi.LastFmClient;

/**
 * Created by christoph on 17.07.16.
 */
public class UserLoginInfo {
    private static final String SESSION = "session";

    @SerializedName(SESSION)
    public LastfmUserSession mSession;


}
