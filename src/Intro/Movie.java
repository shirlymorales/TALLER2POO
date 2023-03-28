package Intro;

public class Movie{

//atributos
private String name;
public double duration;
String category;
private String director;

//metodos

public Movie(){}
public Movie (String name, String director, String category, double duration){
    this.name = name;
    this.duration = duration;
    this.category = category;
    this.director = director;
}
}