import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list

        // name: Black Widow, age: 34
        Hero BlackWidow = new Hero("Black Widow",34);
        heroes.add(BlackWidow);                        //indice 0

        // name: Captain America, age: 100
        Hero CptAmerica = new Hero("Captain America",34);
        heroes.add(CptAmerica);                         //indice 1

        // name: Vision, age: 3
        Hero Vision = new Hero("Vision",3);
        heroes.add(Vision);                             //indice 2

        // name: Iron Man, age: 48
        Hero IronMan = new Hero("Iron Man", 48);
        heroes.add(IronMan);                              //indice 3

        // name: Scarlet Witch, age: 29
        Hero ScarletWitch = new Hero("Scarlet Witch",29);
        heroes.add(ScarletWitch);                       //indice 4

        // name: Thor, age: 1500
        Hero Thor = new Hero("Thor",1500);
        heroes.add(Thor);                               //indice 5

        // name: Spider-Man, age: 18
        Hero SpiderMan = new Hero("Spider Man",18);
        heroes.add(SpiderMan);                           //indice 6

        // name: Hulk, age: 49
        Hero Hulk = new Hero("Hulk",49);
        heroes.add(Hulk);                               //indice 7

        // name: Doctor Strange, age: 42
        Hero DrStrange = new Hero("Doctor Strange",42);
        heroes.add(DrStrange);                          //indice 8

        // TODO 3 : It's Thor birthday, now he's 1501
        Thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list

        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list

        List<Hero> heroes2 = heroes.subList(0, 4);


        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for(int i=0; i<heroes2.size(); i++)
            System.out.println(heroes2.get(i).getName());
    }
}