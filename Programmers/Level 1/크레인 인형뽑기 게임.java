import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        int m = 0;
        for(int move : moves) {
            m = move - 1;
            
            for(int i = 0; i < board.length; i++) {
                if(board[i][m] != 0) {
                    if(!stack.empty() && stack.peek() == board[i][m]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][m]);
                    }

                    board[i][m] = 0;
                    break;
                }                    
            }
            
        }
        
        return answer;
    }
}