class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();

        for(int i =0;i<board.length;i++){
             for(int j =0;j<board.length;j++){
                if (board[i][j] == '.') continue;
                char num= board[i][j];
                if(!set.add("r"+i+num)||
                    !set.add("c"+j+num)||
                    !set.add("b"+(i/3)+(j/3)+num)){
                        return false;
                    }
             }
        }
        return true;
    }
}
