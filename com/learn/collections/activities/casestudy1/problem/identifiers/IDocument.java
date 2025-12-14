package com.learn.collections.activities.casestudy1.problem.identifiers;

public interface IDocument {
    public String getDocumentNumber();
    public String getDocumentType();

    public default DocumentIssuer getDocumentIssuer(){
        return null;
    }

}
