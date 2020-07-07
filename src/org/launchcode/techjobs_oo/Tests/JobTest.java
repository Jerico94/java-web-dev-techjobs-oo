
package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;

import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job job1;
    Job job2;
    Job job3;

    @Test
    public void testSettingJobId(){
        int job1Id = job1.getId();
        int job2Id = job2.getId();
        assertTrue(job2Id-job1Id == 1);
    }

    @Before
    public void createJobObjects(){
        job1 = new Job();
        job2 = new Job();
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        Job aJob = new Job("Dev", new Employer("Employer"), new Location("The Moon"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job anotherJob = new Job("Dev", new Employer("Employer"), new Location("The Moon"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(aJob, anotherJob);
    }
}