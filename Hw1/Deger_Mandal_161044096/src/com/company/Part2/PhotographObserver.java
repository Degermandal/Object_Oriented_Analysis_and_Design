package com.company.Part2;


public class PhotographObserver implements Observer {
    /**
     * Name of Subscriber
     */
    String name;

    /**
     * This is a constructor to take a name of subscriber
     * @param name
     */
    public PhotographObserver(String name) {
        this.name = name;
    }

    /**
     * Update subscriber about the new photograph content.
     * @param obs
     */
    @Override
    public void update(Object obs) {
        if (obs instanceof WebSite) {
            WebSite wSite = (WebSite) obs;
            if (wSite.getContent() instanceof PhotographDisplayContent)
                System.out.println("Notify : " + name + " new PHOTOGRAPH, check your update. ---- "
                        + wSite.getContent().display() + "\n");
        }

    }
}
