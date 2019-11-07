package com.example.ReviewProjects.Abstract;
/*
Abstract classes concentrate on the essentials and are meant to be overridden
    - they only apply to classes and methods
Abstract classes
    - meant to be extended
    - cannot be used to create a constructor
        - a new constructor must be created in the extending class using the super(); keyword
        -if the constructor takes args, they must be passed into the extending class as well
    - the extending class must override all abstract methods
Abstract methods
    - methods without body meant to be overridden
    - only instance methods can be abstract
    - cannot be static, private, final
Bonus:
    once objs are created and given attributes, they can be placed into arrays as data management

 */
//create an abstract class
public abstract class Syntax_and_Notes {
    //declare some variables
    String Country;
    String language;
    int population;
    //declare a constructor
    public Syntax_and_Notes(){
        System.out.println("constructor");
    }
    //declare a constructor with arguments
    public Syntax_and_Notes(String Country, String language, int population){
        //set the args to the instance variables
        this.Country = Country;
        this.language = language;
        this.population = population;
    }
    //declare abstract methods to create some actions
    public abstract void AbstractMethod();
    public abstract void nationalGrowth();
    public abstract void populationGrowth();
}
//create another non-abstract class to use the abstract class/methods
class nonAbstract extends Syntax_and_Notes{
//declare the default constructor
    public nonAbstract(){
        super();
    }
//declare constructor with args
    public nonAbstract(String Country, String language, int population){
        //use the super keyword and args
        super(Country, language, population);
    }
//declare methods to override
    @Override
    public void AbstractMethod() {
        System.out.println("insert implementation");
    }
    @Override
    public void nationalGrowth() {
        System.out.println("insert implementation");
    }
    @Override
    public void populationGrowth() {
        System.out.println("insert implementation");
    }

}
