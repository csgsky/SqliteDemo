package com.gy.allen.databasetest.bean;

import org.litepal.annotation.Column;
import org.litepal.crud.DataSupport;

/**
 * Created by allen on 17/2/17.
 */

public class Books extends DataSupport {
    @Column(defaultValue = "unknown")
    private String name;

    private double price;

    private String author;

    private int pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
