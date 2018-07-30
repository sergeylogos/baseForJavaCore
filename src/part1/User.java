package part1;

public class User {

    byte age; // -128...127
    short height; // от -32768 до 32767
    //    int id ; //от -2147483648 до 2147483647
    long id; // от -9223372036854775808 до 9223372036854775807
    //    float weight = 87.5F; //от -1.4e-45f до 3.4e+38f
    double weight; //от -4.9e-324 до 1.7e+308
    String name;
    boolean isActivated;
    //    char uniqueSymbol = 63;
    char uniqueSymbol; //беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)


}
