package youtubeabo;

public class YouTubeTest {

    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel("HTL Tech Talk");

        User alice = new User("Alice");
        User bob = new User("Bob");

        channel.subscribe(alice);
        channel.subscribe(bob);

        channel.uploadVideo("Observer Pattern erklärt");

        channel.unsubscribe(bob);

        channel.uploadVideo("Singleton Pattern Tutorial");
    }
}
