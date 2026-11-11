# Самостійна 11: готовий код LeetCode

## 268. Missing Number

```java
class Solution {
  public int missingNumber(int[] numbers) {
    int missing = numbers.length;
    for (int i = 0; i < numbers.length; i++) {
      missing ^= i ^ numbers[i];
    }
    return missing;
  }
}
```

XOR має властивість x ^ x = 0 і x ^ 0 = x. Поєднуємо значення 0..n
з усіма числами масиву; парні входження взаємно скасовуються,
залишається пропущене число. Один прохід O(n), пам'ять O(1), масив не змінюється.

## 169. Majority Element

```java
class Solution {
  public int majorityElement(int[] numbers) {
    int candidate = 0;
    int votes = 0;
    for (int number : numbers) {
      if (votes == 0) {
        candidate = number;
      }
      if (number == candidate) {
        votes++;
      } else {
        votes--;
      }
    }
    return candidate;
  }
}
```

Алгоритм Boyer–Moore: однакові з кандидатом числа збільшують баланс,
інші зменшують. При нульовому балансі вибираємо нового кандидата.
Умова гарантує елемент із частотою строго більшою за n/2, тому остаточний
кандидат і є відповіддю. Без цієї гарантії потрібен ще прохід перевірки.
Час O(n), додаткова пам'ять O(1). votes не є точною частотою кандидата.

На LeetCode вставляємо Solution без package. У репозиторії T1/T2 мають
package homework.h11. Порожні масиви не допускаються умовами задач.
Скриншоти: screenshots/h11/T1-leetcode.png і T2-leetcode.png.
За G1 потрібні номер/назва, Accepted, користувач або дата/час.
