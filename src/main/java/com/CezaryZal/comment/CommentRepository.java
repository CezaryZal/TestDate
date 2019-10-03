package com.CezaryZal.comment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


@Repository
public class CommentRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public CommentRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Comment getComment (int id){
        Session curSession = sessionFactory.getCurrentSession();
        Comment comment = curSession.get(Comment.class, id);

        return comment;
    }

    public Comment getCommentByDate(LocalDate tmpDate) throws ParseException {
        System.out.println("LocalDate: " + tmpDate);





        Session curSession = sessionFactory.getCurrentSession();


        org.hibernate.query.Query <Comment>query = curSession.createQuery("FROM Comment WHERE localDate=:inputDate");
        query.setParameter("inputDate", tmpDate);
        Comment comment = query.getSingleResult();


        return comment;
    }


//    public void uptabe(){
//        Comment comment = new Comment(4, LocalDate.of(2018, 04, 21), 5);
//        comment.setId(0);
//
//        Session curSession = sessionFactory.getCurrentSession();
//        Query query = curSession.createQuery("UPDATE Comment SET date='2018-06-26', nr_token=5, user_id=1 WHERE id=3");
//        query.executeUpdate();
////        curSession.saveOrUpdate(comment);
//    }

    //Nie działa....
    public void createTable(){

        Session curSession = sessionFactory.getCurrentSession();
        Query query = curSession.createQuery("CREATE TABLE `comment`(\n" +
                "                            `id` INTEGER NOT NULL AUTO_INCREMENT,\n" +
                "                            `nr_token` INTEGER DEFAULT NULL,\n" +
                "                            `date` DATE NOT NULL,\n" +
                "                            `user_id` INTEGER NOT NULL,\n" +
                "                            PRIMARY KEY (`id`)\n" +
                ")ENGINE = InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8");
        query.executeUpdate();
    }

}
