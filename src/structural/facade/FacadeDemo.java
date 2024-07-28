package structural.facade;

public class FacadeDemo {
  public static void show() {
    var service = new TwitterService("key", "token");
    service.getRecentTweets();
  }
}
