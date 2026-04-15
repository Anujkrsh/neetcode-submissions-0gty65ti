class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                
                char n = board[i][j];
                if( n=='.') continue;
                if(!set.add("r"+i+n )|| 
                    !set.add("c"+j+n)||
                    !set.add("b"+i/3+j/3+n)){
                        return false;
                    }
            }
        }
        return true;
    }
}
