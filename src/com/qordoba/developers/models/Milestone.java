/*
 * SpecJson
 *
 * This file was automatically generated by Qordoba.com v2.0  on 11/30/2016
 */
package com.qordoba.developers.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Milestone 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5293284021525443060L;
    private int milestoneId;
    private String name;
    private int order;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("milestone_id")
    public int getMilestoneId ( ) { 
        return this.milestoneId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("milestone_id")
    public void setMilestoneId (int value) { 
        this.milestoneId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("order")
    public int getOrder ( ) { 
        return this.order;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("order")
    public void setOrder (int value) { 
        this.order = value;
    }
 
}
 