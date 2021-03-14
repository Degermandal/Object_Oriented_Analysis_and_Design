package com.company.Part2;


public class AudioObserver implements Observer {
    /**
     * Name of Subscriber
     */
    String name;

    /**
     * This is a constructor to take a name of subscriber
     * @param name
     */
    public AudioObserver(String name) {
        this.name = name;
    }

    /**
     * Update subscriber about the new audio content.
     * @param obs
     */
    @Override
    public void update(Object obs) {
        if (obs instanceof WebSite) {
            WebSite wSite = (WebSite) obs;
            if (wSite.getContent() instanceof AudioDisplayContent)
                System.out.println("Notify : " + name + " new AUDIO, check your update. ---- "
                        + wSite.getContent().display() + "\n");
        }

    }
}

