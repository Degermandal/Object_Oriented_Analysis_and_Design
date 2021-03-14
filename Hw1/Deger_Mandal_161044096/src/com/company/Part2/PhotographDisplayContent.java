package com.company.Part2;


import com.company.Part2.DisplayContent;

public class PhotographDisplayContent implements DisplayContent {
    /**
     * Display content .
     */
    private String content;

    /**
     * This is a constructor to take photograph content
     * @param content about photograph content.
     */
    public PhotographDisplayContent(String content) {
        this.content = content;
    }

    /**
     * Display information about the content.
     * @return information about the content
     */
    @Override
    public String display() {
        return "Photograph: " + this.content;
    }
}
