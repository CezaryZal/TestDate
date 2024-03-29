package com.CezaryZal.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.time.LocalDate;

@Transactional
@Service
public class CommentService {

    private CommentRepository repo;

    @Autowired
    public CommentService(CommentRepository repo) {
        this.repo = repo;
    }

    public Comment getComment(int id){
        Comment comment = repo.getComment(id);
        return comment;
    }

    public Comment getCommentByDate (String inputDate) throws ParseException {
        LocalDate tmpDate = LocalDate.parse(inputDate);

        return  repo.getCommentByDate(tmpDate);
    }

    public int getNumber(){

//        repo.uptabe();
//        repo.createTable();
        return 2;
    }
}
