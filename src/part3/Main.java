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
//        System.out.println(numbers[3]); //!!!!!!!!! =>
        try {
            System.out.println(numbers[3]);
        } catch (Exception e) {
            System.out.println("some go wrong");
        }
        System.out.println("that`s all folks");

        User user1 = new User("vasya", 100);
        User user2 = new User("petya", 200);
        User user3 = new User("kolya", 300);

        User[] userList = {
                user1,
                user2,
                user3
        };
        System.out.println(userList[0].name);
        System.out.println(userList[1].name);
        System.out.println(userList[2].name);

        User[] users = new User[3];
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        System.out.println(users[0].name);
        System.out.println(users[1].name);
        System.out.println(users[2].name);


        int numNum[][] = {
                {1, 2, 3}, // 00 01 02
                {4, 5, 6}, // 10 11 12
                {7, 8, 9, 0} // 20 21 22

        };

        int[][] nunum2 = new int[3][3];
        nunum2[0][0] = 1;
        nunum2[0][1] = 2;
        nunum2[0][2] = 3;
        nunum2[1][0] = 4;
        nunum2[1][1] = 5;
        nunum2[1][2] = 6;
        nunum2[2][0] = 7;
        nunum2[2][1] = 8;
        nunum2[2][2] = 9;


    }
}
