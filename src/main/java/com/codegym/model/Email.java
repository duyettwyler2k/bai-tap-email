package com.codegym.model;

public class Email {
    private String Language;
    private int pageSize;
    private boolean spamsFiler;
    private String singnature;

    public Email() {
    }

    public Email(String language, int pageSize, boolean spamsFiler, String singnature) {
        Language = language;
        this.pageSize = pageSize;
        this.spamsFiler = spamsFiler;
        this.singnature = singnature;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamsFiler() {
        return spamsFiler;
    }

    public void setSpamsFiler(boolean spamsFiler) {
        this.spamsFiler = spamsFiler;
    }

    public String getSingnature() {
        return singnature;
    }

    public void setSingnature(String singnature) {
        this.singnature = singnature;
    }
}
