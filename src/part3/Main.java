package part3;

public class Main {
    public static void main(String[] args) {

//        int[] numbers = {123, 234, 456};
        int[] numbers = new int[3];
        numbers[0] = 123;
        numbers[1] = 234;
        numbers[2] = 345;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]); //!!!!!!!!!


        User user1 = new User("vasya", 100);
        User user2 = new User("petya", 200);
        User user3 = new User("kolya", 300);

        User[] userList = {
                user1,
                user2,
                user3
        };
        System.out.println(userList[0]);
        System.out.println(userList[1]);
        System.out.println(userList[2]);

        User[] users = new User[3];
        users[0] = user1;
        System.out.println(users[0]);
        System.out.println(users[1]);
        System.out.println(users[2]);
        users[1] = user2;
        System.out.println(users[0]);
        System.out.println(users[1]);
        System.out.println(users[2]);
        users[2] = user3;
        System.out.println(users[0]);
        System.out.println(users[1]);
        System.out.println(users[2]);


    }
}
