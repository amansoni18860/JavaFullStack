package com.example.springMVC.model;

import java.util.List;

public class StudentModel {

    private String firstName;
    private String lastName;
    private String country;
    private String gender;
    private List<String> favoriteLanguages;

    public StudentModel() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getFavoriteLanguages() {
        return favoriteLanguages;
    }

    public void setFavoriteLanguages(List<String> favoriteLanguages) {
        this.favoriteLanguages = favoriteLanguages;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", favoriteLanguages=" + favoriteLanguages +
                '}';
    }
}