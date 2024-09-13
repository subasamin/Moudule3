package com.example.test.model;

import java.util.Date;

public class CardBook {
    private int idCard;
    private int idBook;
    private int idStudent;
    private boolean status;
    private Date borrow_date;
    private Date paid_date;

    public CardBook(int idCard, int idBook, int idStudent, boolean status, Date borrow_date, Date paid_date) {
        this.idCard = idCard;
        this.idBook = idBook;
        this.idStudent = idStudent;
        this.status = status;
        this.borrow_date = borrow_date;
        this.paid_date = paid_date;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getBorrow_date() {
        return borrow_date;
    }

    public void setBorrow_date(Date borrow_date) {
        this.borrow_date = borrow_date;
    }

    public Date getPaid_date() {
        return paid_date;
    }

    public void setPaid_date(Date paid_date) {
        this.paid_date = paid_date;
    }
}
