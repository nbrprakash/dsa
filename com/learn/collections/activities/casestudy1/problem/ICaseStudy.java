package com.learn.collections.activities.casestudy1.problem;

import com.learn.collections.activities.foundation.fianance.Asset;
import com.learn.collections.activities.foundation.people.Person;
import com.learn.collections.activities.foundation.utilities.Rank;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public interface ICaseStudy {

    /**
     * This method accepts a group of people as input, Ranks them by age and returns the details.
     * The number people provided in input should be less than 4
     * @param people The group of people whose need to be arranged in an orderly fashion based on age
     * @return LinkedHashMap<Person, EnumSet<Rank>>
     */
    public abstract LinkedHashMap<Person, EnumSet<Rank>> orderPeopleByAge(Vector<Person> people);

    /**
     * This method accepts a group of people. Each person has an Identifier and some Assets.
     * Each Person has some movable assets and some immovable assets. Some assets are intangible.
     * The count of Assets is used to compare and Rank the people.
     * The details are then returned.
     * @param people map of Person identifier and their Assets
     * @return Hashtable<Person, EnumSet<Rank>>
     */
    public abstract Hashtable<Person, Integer> orderPeopleByAssets(ConcurrentHashMap<String, LinkedList<Asset>> people);

    /**
     * This method accepts a group of people. Identifies achievements of each individual and returns the count of
     * achievements by each Individual.
     * @param people The group of people whose need to be arranged in an orderly fashion based their achievements
     * @return HashMap<Person, Integer>
     */
    public abstract HashMap<Person, Integer> orderPeopleByAchievements(LinkedHashSet<Person> people);

    /**
     * This method accepts a group of people. Computes net worth of each Individual, enumerates them and returns the
     * details. The enumeration details are provided below:
     * The person with the highest net worth is assigned 0, next person 1 and so on. If there are more than 1 person
     * with equal net worth, then they are all given same number. The number indicates number of Persons whose net worth
     * is greater than that particular person.
     * @param people The group of people whose need to be arranged in an orderly fashion based their net worth
     * @return TreeMap<Person, Integer>
     */
    public abstract TreeMap<Person, Integer> orderPeopleByNetWorth(HashSet<Person> people);
}

