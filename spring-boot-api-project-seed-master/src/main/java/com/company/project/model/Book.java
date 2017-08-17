package com.company.project.model;

import javax.persistence.*;

public class Book {
    /**
     * id
     */
    @Id
    @Column(name = "book_id")
    private Long bookId;

    /**
     * 书名
     */
    @Column(name = "bookName")
    private String bookname;

    /**
     * 数目
     */
    @Column(name = "bookNumber")
    private Integer booknumber;

    /**
     * 获取id
     *
     * @return book_id - id
     */
    public Long getBookId() {
        return bookId;
    }

    /**
     * 设置id
     *
     * @param bookId id
     */
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    /**
     * 获取书名
     *
     * @return bookName - 书名
     */
    public String getBookname() {
        return bookname;
    }

    /**
     * 设置书名
     *
     * @param bookname 书名
     */
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    /**
     * 获取数目
     *
     * @return bookNumber - 数目
     */
    public Integer getBooknumber() {
        return booknumber;
    }

    /**
     * 设置数目
     *
     * @param booknumber 数目
     */
    public void setBooknumber(Integer booknumber) {
        this.booknumber = booknumber;
    }
}