package com.learn.collections.activities.casestudy1.validation;

import com.learn.collections.activities.casestudy1.solution.CaseStudyImpl;
import com.learn.collections.activities.casestudy1.solution.ICaseStudy;

public class CaseStudyValidation {

    public static void main(String[] args){
        new CaseStudyValidation().testOrderPeopleByAge();
    }

    public void testOrderPeopleByAge() {

        ICaseStudy caseStudy = new CaseStudyImpl();
        caseStudy.orderPeopleByAge(null);

    }

    public void testOrderPeopleByAssets() {

        ICaseStudy caseStudy = new CaseStudyImpl();
        caseStudy.orderPeopleByAssets(null);
    }

    public void testOrderPeopleByAchievements() {

        ICaseStudy caseStudy = new CaseStudyImpl();
        caseStudy.orderPeopleByAchievements(null);
    }

    public void testOrderPeopleByNetWorth() {

        ICaseStudy caseStudy = new CaseStudyImpl();
        caseStudy.orderPeopleByNetWorth(null);
    }

}