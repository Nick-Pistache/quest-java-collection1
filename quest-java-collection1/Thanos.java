import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        

        ArrayList<Hero> character = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Spider-Man, age: 18
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        Hero blackWidow= new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron Man",48);
        Hero scarletWitch = new Hero("Scarlet Witch",29);
        Hero thor = new Hero("Thor", 1500);
        Hero spiderman = new Hero("Spider-Man", 18);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctorStrange = new Hero("Doctor Strange", 42);

        character.add(blackWidow);
        character.add(captainAmerica);
        character.add(vision);
        character.add(ironMan);
        character.add(scarletWitch);
        character.add(thor);
        character.add(spiderman);
        character.add(hulk);
        character.add(doctorStrange);



        // TODO 3 : It's Thor birthday, now he's 1501

        Hero thor2 = new Hero("Thor", 1501);
        character.set(5, thor2);
        Hero hero = character.get(5);
        System.out.println("It's " + hero.getName() + " birthday, now he's " + hero.getAge());



        // TODO 4 : Shuffle the heroes list

        Collections.shuffle(character);
    

        // TODO 5 : Keep only the half of the list

         List<Hero> character2 = character.subList(0, 4); 

        // TODO 6 : Loop throught the list and display the name of the remaining heroes

        for (Hero aliveHero : character2) {
            System.out.println(aliveHero.getName());
        }
    }
}