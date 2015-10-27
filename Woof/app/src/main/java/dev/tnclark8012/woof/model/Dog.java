package dev.tnclark8012.woof.model;

public class Dog {
    public long modifiedTimeUtc;
    public String identifier;
    public String breedString;
    public String callName;
    public int majors;
    public int points;
    public int sex;
    public int showing;
    public int veteran;
    public int champion;
    public int showingSweepstakes;
    public int deleted;

    @Override
    public String toString() {
        return breedString + ": " + callName + " (" + identifier + ")";
    }

    public static Dog fromName(String name) {
        Dog dog = new Dog();
        dog.callName = name;
        return dog;
    }
}
