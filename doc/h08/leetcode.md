# Код для LeetCode: практическая 8

В редактор каждой задачи вставить соответствующий блок полностью.
В репозитории классы T1/T2 имеют package homework.h08; LeetCode ожидает
class Solution без package. Задачи решены теми же алгоритмами.

## 485. Max Consecutive Ones

```java
class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
    int longestRun = 0;
    int currentRun = 0;
    for (int number : nums) {
      if (number == 1) {
        currentRun++;
        longestRun = Math.max(longestRun, currentRun);
      } else {
        currentRun = 0;
      }
    }
    return longestRun;
  }
}
```

## 2824. Count Pairs Whose Sum is Less than Target

```java
import java.util.List;

class Solution {
  public int countPairs(List<Integer> nums, int target) {
    int pairCount = 0;
    for (int i = 0; i < nums.size(); i++) {
      for (int j = i + 1; j < nums.size(); j++) {
        if (nums.get(i) + nums.get(j) < target) {
          pairCount++;
        }
      }
    }
    return pairCount;
  }
}
```

Accepted-снимки: screenshots/h08/T1-leetcode.png и T2-leetcode.png.
По G1 нужны номер/название, Accepted, имя пользователя либо дата/время.
Действительные скриншоты не создаются из результатов локальных тестов.
