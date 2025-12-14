package com.learn.collections.activities.casestudy1.solution.identifiers;

public enum DocumentIssuer {
    GOVTOFINDIA("GOI"),
    STATEGOVT("State Govt"),
    PSB("Public Sector Bank"),
    PRIVATE("Private Organization");

    private String issuerType;


    private DocumentIssuer(String issuerType){
        this.issuerType = issuerType;
    }


}
