package com.CezaryZal.comment;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nr_token")
    private int nrToken;

    @Column(name = "date")
//    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate localDate;

    @Column(name = "user_Id")
    private int userId;

    public Comment() {
    }

    public Comment(int nrToken, LocalDate localDate, int userId) {
        this.nrToken = nrToken;
        this.localDate = localDate;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNrToken() {
        return nrToken;
    }

    public void setNrToken(int nrToken) {
        this.nrToken = nrToken;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", nrToken=" + nrToken +
                ", localDate=" + localDate +
                ", userId=" + userId +
                '}';
    }
}
