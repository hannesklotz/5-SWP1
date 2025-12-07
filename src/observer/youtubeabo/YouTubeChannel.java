package youtubeabo;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {

    private String name;
    private List<Subscriber> subscribers = new ArrayList<>();

    public YouTubeChannel(String name) {
        this.name = name;
    }

    public void subscribe(Subscriber s) {
        subscribers.add(s);
        System.out.println("Neuer Abonnent: " + ((User)s).getName() + " hat " + name + " abonniert.");
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
        System.out.println(((User)s).getName() + " hat " + name + " abonniert.");
    }

    public void uploadVideo(String title) {
        System.out.println("\nKanal " + name + " lädt neues Video hoch: " + title);
        notifySubscribers(title);
    }

    private void notifySubscribers(String title) {
        for (Subscriber s : subscribers) {
            s.update(name, title);
        }
    }
}
