package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Korotishka korotishka1 = new Korotishka("Незнайка");
        Korotishka korotishka2 = new Korotishka("Винтик");
        Korotishka korotishka3 = new Korotishka("Шпунтик");

        List<Korotishka> korotishki = new ArrayList<>();
        korotishki.add(korotishka1);
        korotishki.add(korotishka2);
        korotishki.add(korotishka3);

        Korotishka.printWelcomeWords();

        for (int i = 0; i < korotishki.size(); i++) {
            korotishki.get(i).performAction();
            System.out.println(korotishki.get(i));
        }
    }


}