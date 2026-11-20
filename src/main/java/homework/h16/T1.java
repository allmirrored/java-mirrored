package homework.h16;

import java.util.ArrayDeque;
import java.util.Queue;

// https://leetcode.com/problems/flood-fill/
public class T1 {
  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int original = image[sr][sc];
    if (original == color) {
      return image;
    }
    int width = image[0].length;
    Queue<Integer> pending = new ArrayDeque<>();
    image[sr][sc] = color;
    pending.add(sr * width + sc);
    int[] directions = {-1, 0, 1, 0, -1};
    while (!pending.isEmpty()) {
      int position = pending.remove();
      int row = position / width;
      int column = position % width;
      for (int direction = 0; direction < 4; direction++) {
        int nextRow = row + directions[direction];
        int nextColumn = column + directions[direction + 1];
        if (nextRow >= 0
            && nextRow < image.length
            && nextColumn >= 0
            && nextColumn < width
            && image[nextRow][nextColumn] == original) {
          image[nextRow][nextColumn] = color;
          pending.add(nextRow * width + nextColumn);
        }
      }
    }
    return image;
  }
}
