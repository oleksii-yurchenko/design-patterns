package structural.facade;

import java.util.ArrayList;
import java.util.List;

public class TwitterService {
    private String appKey;
    private String secret;

    public TwitterService(String appKey, String secret) {
        this.appKey = appKey;
        this.secret = secret;
    }

    private String getAccessToken(){
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(appKey, secret);
        return oauth.getAccessToken(requestToken);
    }

    public List<Tweet> getRecentTweets() {
        var client = new TwitterClient();
        return client.getRecentTweets(getAccessToken());
    }
}
