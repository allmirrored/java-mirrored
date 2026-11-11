# Код для LeetCode: самостійна 9

## 1512. Number of Good Pairs

```java
class Solution {
  public int numIdenticalPairs(int[] numbers) {
    int[] frequencies = new int[101];
    int pairCount = 0;
    for (int number : numbers) {
      pairCount += frequencies[number];
      frequencies[number]++;
    }
    return pairCount;
  }
}
```

Кожен новий елемент утворює пару з усіма попередніми однаковими.
frequencies зберігає кількість уже побачених значень 1–100.
Один прохід, O(n) часу й фіксований масив зі 101 лічильника.

## 1431. Kids With the Greatest Number of Candies

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int greatestCount = findGreatestCount(candies);
    List<Boolean> result = new ArrayList<>(candies.length);
    for (int candyCount : candies) {
      result.add(candyCount + extraCandies >= greatestCount);
    }
    return result;
  }

  private int findGreatestCount(int[] candies) {
    int greatestCount = candies[0];
    for (int candyCount : candies) {
      greatestCount = Math.max(greatestCount, candyCount);
    }
    return greatestCount;
  }
}
```

findGreatestCount знаходить початковий максимум. Основний метод окремо
оцінює кожну дитину: candies[i] + extraCandies >= максимум.
Рівність теж дає true; цукерки не розподіляються між усіма одночасно.
Два проходи O(n), результат O(n), вхідний масив не змінюється.

На LeetCode клас Solution без package. У репозиторії T1/T2 мають
package homework.h09. Порожні масиви за умовами цих задач не допускаються.
Скриншоти: screenshots/h09/T1-leetcode.png і T2-leetcode.png.
