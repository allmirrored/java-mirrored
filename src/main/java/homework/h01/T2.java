package homework.h01;

// https://leetcode.com/problems/rectangle-area/
public class T2 {
  public int computeArea(
      int firstLeft,
      int firstBottom,
      int firstRight,
      int firstTop,
      int secondLeft,
      int secondBottom,
      int secondRight,
      int secondTop) {
    int firstArea = (firstRight - firstLeft) * (firstTop - firstBottom);
    int secondArea = (secondRight - secondLeft) * (secondTop - secondBottom);
    int overlapWidth =
        Math.max(0, Math.min(firstRight, secondRight) - Math.max(firstLeft, secondLeft));
    int overlapHeight =
        Math.max(0, Math.min(firstTop, secondTop) - Math.max(firstBottom, secondBottom));
    return firstArea + secondArea - overlapWidth * overlapHeight;
  }
}
