package com.company.Part2;


public class AudioDisplayContent implements DisplayContent {
    /**
     * Display content .
     */
    private String content;
    /**
     * This is a constructor to take audio content
     * @param content about audio content.
     */
    public AudioDisplayContent(String content) {
        this.content = content;
    }

    /**
     * Display information about the content.
     * @return information about the content
     */
    @Override
    public String display() {
        return "Audio: " + this.content;
    }

}
