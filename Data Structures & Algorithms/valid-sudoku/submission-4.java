class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set =new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                Character c = board[i][j];
                if (c=='.') continue;
                    if(set.add("r"+i+c)&&
                        set.add("c"+j+c)&&
                        set.add("rc"+i/3+j/3+c)){
                            continue;
                        }else{
                            return false;
                        }
            }
        }
        return true;
    }
}
