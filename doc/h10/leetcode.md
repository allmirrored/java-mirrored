# Самостійна 10: код для LeetCode

## 3304. Find the K-th Character in String Game I

```java
class Solution {
  public char kthCharacter(int position) {
    if (position == 1) {
      return 'a';
    }
    int previousLength = Integer.highestOneBit(position - 1);
    return (char) (kthCharacter(position - previousLength) + 1);
  }
}
```

Перша позиція дає a. previousLength — найбільший степінь двійки,
менший за position: довжина попереднього слова. Шукана позиція
належить другій половині нового слова, отже беремо відповідну літеру
попереднього слова і збільшуємо її на один. Рекурсія завершується,
бо position зменшується. За k <= 500 перехід через z не виникає.
Час і стек O(log k), повний рядок не будується.

## 344. Reverse String

```java
class Solution {
  public void reverseString(char[] letters) {
    int left = 0;
    int right = letters.length - 1;
    while (left < right) {
      char saved = letters[left];
      letters[left] = letters[right];
      letters[right] = saved;
      left++;
      right--;
    }
  }
}
```

Міняємо місцями крайні символи й рухаємо індекси до середини.
Час O(n), додаткова пам'ять O(1), змінюється саме вхідний масив.
Тут цикл потрібен для дотримання вимоги O(1): звичайна рекурсивна
версія використовує стек і може переповнити його при довжині 100000.

У репозиторії класи T1/T2 з package homework.h10; на LeetCode Solution
без package. Скриншоти: screenshots/h10/T1-leetcode.png і T2-leetcode.png.
За G1 в кадрі потрібні номер/назва, Accepted та користувач або дата/час.
