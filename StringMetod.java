public class StringMetod {
    public static void main(String[] args) {
        //1. Доделать задачку с занятия:
        //Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        //Найти позицию подстроки “Java” в строке “I like Java!!!”.
        //Заменить все символы “а” на “о”.
        //Преобразуйте строку к верхнему регистру.
        //Преобразуйте строку к нижнему регистру.
        //Вырезать строку Java c помощью метода String.substring().
        String a = "I like Java!!!";
        System.out.println(a.startsWith("I like"));
        strreplace(a);//Заменить все символы “а” на “о”.




    }
// //Заменить все символы “а” на “о”.

    public static void strreplace(String text) {
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i)) == 'a') {
                System.out.print("o");
            } else {
                System.out.print(text.charAt(i));
            }
        }

    }
}

