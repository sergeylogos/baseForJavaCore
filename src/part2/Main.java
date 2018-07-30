package part2;

import part1.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.age = 18;
        user1.height = 187;
        user1.id = 1;
        user1.weight = 87.5;
        user1.name = "vasya";
        user1.isActivated = true;
        user1.uniqueSymbol = '$';
        System.out.println(user1.age);
        System.out.println(user1.height);
        System.out.println(user1.id);
        System.out.println(user1.weight);
        System.out.println(user1.name);
        System.out.println(user1.isActivated);
        System.out.println(user1.uniqueSymbol);

        User user2 = new User();
        user2.age = 23;
        user2.height = 195;
        user2.id = 2;
        user2.weight = 97.654;
        user2.name = "kokos";
        user2.isActivated = true;
        user2.uniqueSymbol = '^';
        System.out.println(user2.age);
        System.out.println(user2.height);
        System.out.println(user2.id);
        System.out.println(user2.weight);
        System.out.println(user2.name);
        System.out.println(user2.isActivated);
        System.out.println(user2.uniqueSymbol);

        int totalAge = user1.age + user2.age; // -*/
        System.out.println(totalAge);
        String ageAndNameConcat = user1.age + user1.name;
        System.out.println(ageAndNameConcat);
        String ageAgeName = user1.age + user1.age + user1.name;
        System.out.println(ageAgeName);
        String nameAgeAge = user1.name + user1.age + user1.age;
        System.out.println(nameAgeAge);

        System.out.println(user2.age % user1.age);



    }
}
