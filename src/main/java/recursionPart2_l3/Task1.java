package recursionPart2_l3;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    int[][] board;
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        board = new int[n][n];
        backTrack(0);
        return ans;
    }
    private void backTrack(int col){
        if (col == board.length){
            addBoard();
            return;
        }
        for (int row = 0; row < board.length; row++){
            if (canPlace(row,col)){
                board[row][col] = 1;
                backTrack(col + 1);
                board[row][col] = 0;
            }
        }
    }
    private boolean canPlace(int i, int j){
        //2 направо и 1 вниз
        for (int row = i + 1, col = j - 2; row < board.length && col >= 0; row++, col--){
            if (board[row][col] == 1) return false;
        }
        //1 направо и 2 вниз
        for (int row = i + 2, col = j - 1; row < board.length && col >= 0; row++, col--){
            if (board[row][col] == 1) return false;
        }
        //2 направо и 1 вверх
        for (int row = i - 1, col = j - 2; row >= 0 && col >= 0; row--, col--){
            if (board[row][col] == 1) return false;
        }
        //1 налево и 2 вниз
        for (int row = i + 2, col = j + 1; row < board.length && col < board.length; row++, col++) {
            if (board[row][col] == 1) return false;
        }
        //2 налево и 1 вниз
        for (int row = i + 1, col = j + 2; row < board.length && col < board.length; row++, col++) {
            if (board[row][col] == 1) return false;
        }
        //2 налево и 1 вверх
        for (int row = i - 1, col = j + 2; row >= 0 && col < board.length; row--, col++) {
            if (board[row][col] == 1) return false;
        }
        //1 направо и 2 вверх
        for (int row = i + 2, col = j - 1; row < board.length && col >= 0; row++, col--){
            if (board[row][col] == 1) return false;
        }
        //1 налево и 2 вверх
        for (int row = i + 2, col = j + 1; row < board.length && col < board.length; row++, col++) {
            if (board[row][col] == 1) return false;
        }
        return true;
    }
    private void addBoard(){
        List<String> b = new ArrayList<>();
        for (int i = 0; i < board.length; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++){
                sb.append(board[i][j] == 0 ? '.' : 'Q');
            }
            b.add(sb.toString());
        }
        ans.add(b);
    }
}
