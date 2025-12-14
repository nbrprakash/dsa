package com.learn.collections.activities.casestudy1.problem.people;

import com.learn.collections.activities.casestudy1.problem.fianance.Asset;
import com.learn.collections.activities.casestudy1.problem.fianance.Liability;
import com.learn.collections.activities.casestudy1.problem.identifiers.IDocument;
import com.learn.collections.activities.casestudy1.problem.organizations.Organization;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class Person {

    private String Id;
    private String name;
    private Date dob;
    private Set<IDocument> documents;
    private List<Asset> assets;
    private List<Liability> liabilities;
    private Map<Organization, List<EmploymentRecord>> employmentHistory;

}
