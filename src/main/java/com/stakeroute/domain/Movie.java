package com.stakeroute.domain;

public class Movie {

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    private Actor actor;
    public void Act()
    {
        actor.act();
    }

//    @Override
//    public String toString() {
//        return "Movie{" +
//                "actor=" + actor +
//                '}';
    }

