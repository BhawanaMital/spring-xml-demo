package com.stakeroute.domain;

public class Actor {
    public void act()
    {
        System.out.println(name+ " is acting");
        System.out.println(gender);
        System.out.println(age);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private String gender;
    private int age;

//    @Override
//    public String toString() {
//        return "Actor{" +
//                "name='" + name + '\'' +
//                ", gender='" + gender + '\'' +
//                ", age=" + age +
//                '}';
    }

