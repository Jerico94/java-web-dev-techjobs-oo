package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer extends JobField {
    private int id;
    private static int nextId = 1;
    private String value;

        // Custom toString, equals, and hashCode methods:
        public Employer(String value){
            super(value);
        }
    }