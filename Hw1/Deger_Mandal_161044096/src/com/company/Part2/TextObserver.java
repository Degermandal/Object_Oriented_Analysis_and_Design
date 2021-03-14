package com.company.Part2;


public class TextObserver implements Observer {
    /**
     * Name of Subscriber
     */
    String name;

    /**
     * This is a constructor to take a name of subscriber
     * @param name
     */
    public TextObserver(String name) {
        this.name = name;
    }

    /**
     * Update subscriber about the new text content.
     * @param obs
     */
    @Override
    public void update(Object obs) {
        if (obs instanceof WebSite) {
            WebSite wSite = (WebSite) obs;
            if (wSite.getContent() instanceof TextDisplayContent)
                System.out.println("Notify : " + name + " new TEXT, check your update. ---- "
                        + wSite.getContent().display() + "\n");
        }
    }
}
