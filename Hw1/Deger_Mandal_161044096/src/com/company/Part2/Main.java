package com.company.Part2;

public class Main {
    public static void main(String[] args) {
        WebSite wb = new WebSite();
        Observer obs1 = new PhotographObserver("Deger");
        Observer obs2 = new AudioObserver("Zeynep");
        Observer obs3 = new TextObserver("Seda");
        Observer obs4 = new TextObserver("Elif");
        Observer obs5 = new PhotographObserver("Seda");
        Observer obs6 = new AudioObserver("Seda");
        wb.add(obs1);
        wb.add(obs2);
        wb.add(obs3);
        wb.add(obs4);
        wb.add(obs5);
        wb.add(obs6);
        System.out.println("#############################################################");
        wb.updateContent(new AudioDisplayContent("Audio of GOT"));
        wb.updateContent(new TextDisplayContent("Text Of GOT"));
        wb.updateContent(new PhotographDisplayContent("Photo of GOT"));
        System.out.println("#############################################################");
        wb.remove(obs6);
        wb.remove(obs1);

        wb.updateContent(new AudioDisplayContent("Audio of Merlin"));
        wb.updateContent(new TextDisplayContent("Text Of Merlin"));
        wb.updateContent(new PhotographDisplayContent("Photo of Merlin"));
        System.out.println("#############################################################");
    }
}