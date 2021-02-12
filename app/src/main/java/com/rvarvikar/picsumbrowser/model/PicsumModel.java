package com.rvarvikar.picsumbrowser.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PicsumModel{

    @SerializedName("format")
    private String format;

    @SerializedName("width")
    private Long width;

    @SerializedName("height")
    private Long height;

    @SerializedName("filename")
    private String filename;

    @SerializedName("id")
    private Long id;

    @SerializedName("author")
    private String author;

    @SerializedName("author_url")
    private String author_url;

    @SerializedName("post_url")
    private String post_url;

    public PicsumModel() {
    }



    public PicsumModel(String format, Long width, Long height, String filename, Long id, String author, String author_url, String post_url) {
        super();
        this.format = format;
        this.width = width;
        this.height = height;
        this.filename = filename;
        this.id = id;
        this.author = author;
        this.author_url = author_url;
        this.post_url = post_url;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor_url() {
        return author_url;
    }

    public void setAuthor_url(String author_url) {
        this.author_url = author_url;
    }

    public String getPost_url() {
        return post_url;
    }

    public void setPost_url(String post_url) {
        this.post_url = post_url;
    }

}