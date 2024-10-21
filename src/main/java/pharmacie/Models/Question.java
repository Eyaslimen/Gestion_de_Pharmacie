package pharmacie.Models;

import java.sql.Date;

public class Question {
    private int clientId;
    private Integer GerantId; 
    private String question;
    private String reponse;
    private Date dateQuestion;
    private Date dateReponse;

    // Constructeur
    public Question(int clientId, Integer GerantId, String question, String reponse, Date dateQuestion, Date dateReponse) {
        this.clientId = clientId;
        this.GerantId = GerantId;
        this.question = question;
        this.reponse = reponse;
        this.dateQuestion = dateQuestion;
        this.dateReponse = dateReponse;
    }

    // Getters et Setters
    

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Integer getGerantId() {
        return GerantId;
    }

    public void setGerantId(Integer GerantId) {
        this.GerantId = GerantId;
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
