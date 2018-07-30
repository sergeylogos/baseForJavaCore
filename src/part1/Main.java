package part1;

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


        System.out.println(user1.age > user2.age); // 18 > 23 = false
        System.out.println(user1.name.equals(user2.name)); // "vasya".equals("kokos") // false
        System.out.println(user1.age != user2.age); // 18 != 23  true

        System.out.println(user1.age == user2.age && user1.isActivated == user2.isActivated);
        System.out.println(user1.age == user2.age || user1.isActivated == user2.isActivated);


        String result;
        if (user1.age > user2.age) {
            result = "user1 older user2";
        } else {
            result = "user2 older user1";
        }
        System.out.println(result);

        String result2;
        if (user1.age == user2.age && user1.isActivated == user2.isActivated) {
            result2 = "object are equal";
        } else {
            result2 = "object are not equal";

        }

        User user3 = new User();
        user3.age = 32;


        if (user1.age > user2.age && user1.age > user3.age) {
            System.out.println("user 1 is older than all");
        } else if (user2.age > user1.age && user2.age > user3.age) {
            System.out.println("user 2 is older than all");
        } else if (user3.age > user1.age && user3.age > user2.age) {
            System.out.println("user 3 is older than all");
        } else {
            System.out.println("something go wrong");
        }

    }
}
