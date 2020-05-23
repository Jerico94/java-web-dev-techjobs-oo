package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job testJob1;
    Job testJob2;

    @Before
    public void setup() {
        testJob1 = new Job();
        testJob2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertEquals(testJob1.getId() + 1, testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Job checker = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assert (checker.getName() != null);
        assert (checker.getEmployer() != null);
        assert (checker.getLocation() != null);
        assert (checker.getPositionType() != null);
        assert (checker.getCoreCompetency() != null);
    }

    @Test
    public void testJobsForEquality() {
        assertNotEquals(testJob1, testJob2);
    }
}