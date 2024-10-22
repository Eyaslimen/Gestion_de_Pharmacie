package pharmacie.Models;

import java.sql.Date;

public class Question {
    private int clientNom;
    private Integer GerantNom; 
    private String question;
    private String reponse;
    private Date dateQuestion;
    private Date dateReponse;

    // Constructeur
    public Question(int clientNom, Integer GerantNom, String question, String reponse, Date dateQuestion, Date dateReponse) {
        this.clientNom = clientNom;
        this.GerantNom = GerantNom;
        this.question = question;
        this.reponse = reponse;
        this.dateQuestion = dateQuestion;
        this.dateReponse = dateReponse;
    }

    // Getters et Setters
    

    public int getclientNom() {
        return clientNom;
    }

    public void setclientNom(int clientNom) {
        this.clientNom = clientNom;
    }

    public Integer getGerantNom() {
        return GerantNom;
    }

    public void setGerantNom(Integer GerantNom) {
        this.GerantNom = GerantNom;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public Date getDateQuestion() {
        return dateQuestion;
    }

    public void setDateQuestion(Date dateQuestion) {
        this.dateQuestion = dateQuestion;
    }

    public Date getDateReponse() {
        return dateReponse;
    }

    public void setDateReponse(Date dateReponse) {
        this.dateReponse = dateReponse;
    }
}
