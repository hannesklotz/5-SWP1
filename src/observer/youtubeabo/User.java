package observer.youtubeabo;

public class User implements Subscriber {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println("Benachrichtigung für " + name + ": Neuer Upload von "
                + channelName + " -> \"" + videoTitle + "\"");
    }
}