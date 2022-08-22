package com.example.sharely.document;

import com.example.sharely.user.User;

import javax.persistence.*;

@Entity ( name = "Document" )
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int documentId;

    private String documentName;
    private long creationDate;
    private Integer subjectId;

    @ManyToOne
    @JoinColumn(name="userId", referencedColumnName="userId")
    private User user;

    public Document() {
    }

    public Document(int documentId, String documentName, long creationDate, Integer subjectId, User user) {
        this.documentId = documentId;
        this.documentName = documentName;
        this.creationDate = creationDate;
        this.subjectId = subjectId;
        this.user = user;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }
}
