package com.shakil.joblisting.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "JobPost")
public class Post {
    private String profile;
    private String description;
    private int experience;
    private String tech[];
    public Post() {
    }

    public Post(String profile, String description, int experience, String[] tech) {
        this.profile = profile;
        this.description = description;
        this.experience = experience;
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Post{" +
                "profile='" + profile + '\'' +
                ", description='" + description + '\'' +
                ", experience=" + experience +
                ", tech=" + Arrays.toString(tech) +
                '}';
    }

    public String[] getTech() {
        return tech;
    }

    public void setTech(String[] tech) {
        this.tech = tech;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
