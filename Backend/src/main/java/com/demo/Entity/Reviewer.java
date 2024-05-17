package com.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Map;

@Entity
@Table(name = "reviewers")
public class Reviewer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "reviewer")
    private Map<Long, Long> reviewsByUser;

    @OneToMany(mappedBy = "reviewer")
    private Map<Long, Long> reviewsByContest;

    public Reviewer() {
    }

    public Reviewer(Map<Long, Long> reviewsByUser, Map<Long, Long> reviewsByContest) {
        this.reviewsByUser = reviewsByUser;
        this.reviewsByContest = reviewsByContest;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<Long, Long> getReviewsByUser() {
        return reviewsByUser;
    }

    public void setReviewsByUser(Map<Long, Long> reviewsByUser) {
        this.reviewsByUser = reviewsByUser;
    }

    public Map<Long, Long> getReviewsByContest() {
        return reviewsByContest;
    }

    public void setReviewsByContest(Map<Long, Long> reviewsByContest) {
        this.reviewsByContest = reviewsByContest;
    }

    // 其它属性和方法
}