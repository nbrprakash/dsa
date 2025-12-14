package com.learn.collections.activities.casestudy1.solution.people;

import com.learn.collections.activities.casestudy1.solution.fianance.Asset;
import com.learn.collections.activities.casestudy1.solution.fianance.Liability;
import com.learn.collections.activities.casestudy1.solution.identifiers.IDocument;
import com.learn.collections.activities.casestudy1.solution.organizations.Organization;

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
