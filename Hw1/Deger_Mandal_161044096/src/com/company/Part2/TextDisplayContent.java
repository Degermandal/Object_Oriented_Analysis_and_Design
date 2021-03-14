package com.company.Part2;


import com.company.Part2.DisplayContent;

public class TextDisplayContent implements DisplayContent {
    /**
     * Display content .
     */
    private String content;
    /**
     * This is a constructor to take text content
     * @param content about text content.
     */
    public TextDisplayContent(String content) {
        this.content = content;
    }

    /**
     * Display information about the content.
     * @return information about the content
     */
    @Override
    public String display() {
        return "Text: " + this.content;
    }

}
