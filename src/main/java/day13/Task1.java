package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Вася");
        User u2 = new User("Петя");
        User u3 = new User("Валера");

        u1.sendMessage(u2,"Привет");
        u1.sendMessage(u2,"Как дела?");

        u2.sendMessage(u1, "Привет");
        u2.sendMessage(u1, "отлично");
        u2.sendMessage(u1, "как сам?");

        u3.sendMessage(u1,"привет");
        u3.sendMessage(u1,"погода норм");
        u3.sendMessage(u1,"как думаешь");

        u1.sendMessage(u3,"привет");
        u1.sendMessage(u3,"да погода");
        u1.sendMessage(u3,"просто супер");

        u3.sendMessage(u1,"пойдём гулять");

        MessageDatabase.showDialog(u1,u3);
    }
}
