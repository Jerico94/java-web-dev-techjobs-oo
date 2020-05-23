
package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.id = id;
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Employer getEmployer() { return employer; }
    public void setEmployer(Employer employer) { this.employer = employer; }

    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }

    public PositionType getPositionType() { return positionType; }
    public void setPositionType(PositionType positionType) { this.positionType = positionType; }

    public CoreCompetency getCoreCompetency() { return coreCompetency; }
    public void setCoreCompetency(CoreCompetency coreCompetency) { this.coreCompetency = coreCompetency; }

    public String toString() {
        String output;
        String emptyObject;
        emptyObject = "OOPS! This job does not seem to exist.";

        String printName = name==null ? "Data not available" : name.toString();
        String printEmployer = employer==null ? "Data not available" : employer.toString();
        String printLocation = location==null ? "Data not available" : location.toString();
        String printPositionType = positionType==null ? "Data not available" : positionType.toString();
        String printSkill = coreCompetency==null ? "Data not available" : coreCompetency.toString();
        if (name==null && employer==null && location==null && positionType==null && coreCompetency==null) {
            return emptyObject;
        } else {
            output = " \n" +
                    "ID: " + id + System.lineSeparator() +
                    "Name: " + printName + System.lineSeparator() +
                    "Employer: " + printEmployer + System.lineSeparator() +
                    "Location: " + printLocation + System.lineSeparator() +
                    "Position Type: " + printPositionType + System.lineSeparator() +
                    "Core Competency: " + printSkill + System.lineSeparator() +
                    " ";
            return output;
        }
    }
}





