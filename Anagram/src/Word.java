import java.util.Scanner;
public class Word {
    public static void main(String[] args) {
        String letter; // ця змінна використовується при пошуку символів рядка WordB у рядку WordA
        String subResult;
        int i = 0;
        boolean isAnagram = true; // це - наш вердикт: true - якщо слова є анаграмами, false - якщо ні

        System.out.println("Привіт! Я допоможу тобі визначити чи є анаграмами будь-які два слова. Для початку, введи перше слово:");
        Scanner scanner = new Scanner(System.in);
        String wordA = scanner.nextLine();
        System.out.println("А тепер - друге, будь ласка:");
        String wordB = scanner.nextLine();
        System.out.println("Чудово! Отже, порівнюємо слова \"" + wordA + "\" та \"" + wordB + "\".");

        if (wordA.length() != wordB.length()) {
            System.out.println("Ці слова мають різну кількість літер, тобто вони не можуть бути анаграмами.");
        } else {
            // Далі проганяємо цикл для перевірки кожної літери WordB на наявність у слові WordA.
            // Припускаємо, що слова є анаграмами, доки не доведене протилежне.
            // Виходимо з циклу тоді, коли всі літери перелічені або коли хоча б одна літера слова не знайдена в іншому слові.
            for (i = 0; i < wordB.length() && isAnagram; i++) {
                letter = wordB.substring(i, (i + 1));
                boolean isLetterPresent = wordA.contains(letter);
                if (isLetterPresent) {
                    subResult = "Так!";
                    isAnagram = true;
                } else {
                    subResult = "Ні!";
                    isAnagram = false;
                }
                System.out.println("Чи присутня літера \"" + letter + "\" в обох словах? - " + subResult);

            }

            // Тепер залишилося лише вивести результат.
            if (isAnagram) {
                System.out.println("Отже, слова \"" + wordB + "\" та \"" + wordA + "\" є анаграмами одне одного.");
            } else if (!(isAnagram)) {
                System.out.println("Отже, слова \"" + wordB + "\" та \"" + wordA + "\" НЕ є анаграмами одне одного.");
            }
        }
    }
}
