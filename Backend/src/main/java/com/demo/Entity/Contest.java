package com.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "contests")
public class Contest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String level;
    private String category;
    private String publisher;
    private Date entryStart;
    private Date entryEnd;
    private Date contestStart;
    private Date contestEnd;
    private String detail;
    private String poster;

    public Contest() {
    }

    public Contest(String name, String level, String category, String publisher, Date entryStart, Date entryEnd,
                   Date contestStart, Date contestEnd, String detail, String poster) {
        this.name = name;
        this.level = level;
        this.category = category;
        this.publisher = publisher;
        this.entryStart = entryStart;
        this.entryEnd = entryEnd;
        this.contestStart = contestStart;
        this.contestEnd = contestEnd;
        this.detail = detail;
        this.poster = poster;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getEntryStart() {
        return entryStart;
    }

    public void setEntryStart(Date entryStart) {
        this.entryStart = entryStart;
    }

    public Date getEntryEnd() {
        return entryEnd;
    }

    public void setEntryEnd(Date entryEnd) {
        this.entryEnd = entryEnd;
    }

    public Date getContestStart() {
        return contestStart;
    }

    public void setContestStart(Date contestStart) {
        this.contestStart = contestStart;
    }

    public Date getContestEnd() {
        return contestEnd;
    }

    public void setContestEnd(Date contestEnd) {
        this.contestEnd = contestEnd;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    // 其它属性和方法
}