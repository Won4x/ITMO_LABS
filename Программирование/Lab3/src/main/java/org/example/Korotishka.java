package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Korotishka extends Character implements Researcher, Inventor, Vacationer {

    private ArrayList<String> inventions;
    private ArrayList<String> knowledge;
    private static ArrayList<Integer> actions = new ArrayList<>();
    private static ArrayList<Integer> places = new ArrayList<>();


    public Korotishka(String name) {
        this.name = name;
        this.inventions = new ArrayList<>();
        this.knowledge = new ArrayList<>();
    }

    public static void printWelcomeWords(){
        System.out.println("Коротышки уже давно живут в своем городке. За это время они упели много чего сделать.");
    }

    @Override
    public void invent() {
        inventions.add("телевизор, чтоб можно было смотреть дома кинокартины и театральные представления");
        inventions.add("телефон, чтоб можно было разговаривать друг с другом");
        inventions.add("принялся проводить на улицах города электрическое освещение");
        action = Action.INVENTING;
        System.out.print(name + " изобрел ");
    }

    @Override
    public void learn() {
        knowledge.add("писать");
        knowledge.add("читать");
        knowledge.add("изучать грамматику");
        action = Action.LEARNING;
        System.out.print(name + " начал изучать новые вещи: ");
    }

    @Override
    public void relax() {
        action = Action.RELAXING;
        System.out.print(name + "  не хочет работать. Это часто случается в стране коротышек. Иной коротышка наобещает с три\n" +
                "короба, наговорит, что сделает и это и то, даже горы свернет и вверх ногами\n" +
                "перевернет, на самом же деле поработает несколько дней в полную силу, а потом снова\n" +
                "понемножку начинает отлынивать.");
    }

    private void choosingPlace(){
        Place place1 = new Place("В деревянном домике сидит ");
        Place place2 = new Place("В гостях у друзей находится ");
        Place place3 = new Place("На пляже лежит ");

        Random random = new Random();
        int randomNumber = 0;
        do {
            randomNumber = random.nextInt(3) + 1;
        }while(places.contains(randomNumber));

        places.add(randomNumber);
        if (randomNumber == 1){
            System.out.println(place1.name()+name+".");
        }
        else if (randomNumber ==2){
            System.out.println(place2.name()+name+".");
        }
        else{
            System.out.println(place3.name()+name+".");
        }

    }
    @Override
    public void performAction() {
        Random random = new Random();
        int randomNumber = 0;
        do {
            randomNumber = random.nextInt(3) + 1;
        }while(actions.contains(randomNumber));

        actions.add(randomNumber);
        if (randomNumber == 1){
            choosingPlace();
            learn();
        }
        else if (randomNumber ==2){
            choosingPlace();
            relax();
        }
        else{
            try {
                if (action != action.INVENTING) {
                    throw new Inventingexception(name + " не хочет изобретать. Но спустя время передумал.");
                }
                System.out.println("\n"+name + " изобретает.");
            } catch (Inventingexception e) {
                System.out.println(e.getMessage());
            }
            choosingPlace();
            invent();

        }

    }

    @Override
    public String toString() {
        String text = "";
        if (Action.INVENTING == action) {
            for (String word : inventions) {
                text += word + ", ";
            }
            text = text.substring(0, text.length() - 2);
        } else if (Action.LEARNING == action) {
            {
                for (String word : knowledge) {
                    text += word + ", ";
                }
                text = text.substring(0, text.length() - 2);
            }
        }
        return text;
    }


}

