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
        System.out.println(a.startsWith("I like"));//Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println(a.indexOf("Java"));//Найти позицию подстроки “Java” в строке “I like Java!!!”.
        System.out.println(a.replace('a','o'));//Заменить все символы “а” на “о”
        System.out.println(a.toUpperCase());//verhnij registr
        System.out.println(a.toLowerCase());//Преобразуйте строку к нижнему регистру.

    }
}


