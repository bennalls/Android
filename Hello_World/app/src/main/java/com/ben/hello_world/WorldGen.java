package com.ben.hello_world;

/**
 * Created by ben on 17/06/14.
 */
public class WorldGen {
    String planetName = "Earth";
    int planetMass;
    double planetGravity;
    int planetColonies;
    long planetPopulation;
    int planetBases;
    int planetMilitary;
    boolean planetProtection;
    public WorldGen(String name, int mass, double gravity) {
        planetName = name;
        planetMass = mass;
        planetGravity = gravity;
        planetColonies = 0;
        planetPopulation = 0;
        planetBases = 0;
        planetMilitary = 0;
        planetProtection = false;
    }

    public void setPlanetColonies(int numColonies) {
        planetColonies += numColonies;
    }

    public int getPlanetColonies(){
        return planetColonies;
    }

    public int getPlanetMilitary() {
        return planetMilitary;
    }

    public void setPlanetMilitary(int numBases) {
        planetMilitary += numBases;
    }

    public void turnForceFieldOn() {
        planetProtection = true;
    }

    public void turnForceFieldOff() {
        planetProtection = false;
    }

    public boolean getForceFieldState() {
        return planetProtection;
    }

    void setColonyImmigration (int numColonies) {
        planetPopulation += numColonies;
    }

    long getColonyImmigration() {
        return planetPopulation;
    }

    void setBaseProtection (int numForces) {
        planetMilitary += numForces;
    }

    int getBaseProtection () {
        return planetMilitary;
    }
}
