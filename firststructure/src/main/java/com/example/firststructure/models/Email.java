package com.example.firststructure.models;

import jakarta.persistence.*;

@Entity
@Table(name = "email")
public class Email {
    @Id
    @GeneratedValue
    @Column(name = "id_email", nullable = false, length = 100)
    private Long id;
    @Column(name = "remetente", nullable = false, length = 100)
    private String from;
    @Column(name = "assunto", nullable = false, length = 100)
    private String subject;
    @Column(name = "corpo", nullable = false, length = 100)
    private String body;
    @Column(name = "anexos", nullable = false, length = 100)
    private String attachment;

    //Constructor
    public Email(String from, String subject, String body, String attachment) {
        this.from = from;
        this.subject = subject;
        this.body = body;
        this.attachment = attachment;
    }

    //Métodos

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //Encapsulamento

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }
}
