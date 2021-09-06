import java.util.HashSet;

public class ValidSudoku {

        public boolean isValidSudoku(char[][] board) {
            //size of sudoku is 9 in all direction
            int n = 9;

            //prepare the three arrays to check row,column, and inside boxes
            HashSet<Character>[] rows = new HashSet[n];
            HashSet<Character>[] cols = new HashSet[n];
            HashSet<Character>[] boxes = new HashSet[n];


            //initialize the array items as HashSets
            for(int i=0;i<n;i++){
                rows[i] = new HashSet<>();
                cols[i] = new HashSet<>();
                boxes[i] = new HashSet<>();
            }

            //use two pointers to save each row & column item
            //return false if duplicate is found
            // (r => row, c => column) pointers
            for(int r=0;r<n;r++){
                for(int c=0;c<n;c++){
                    char item = board[r][c];

                    //if empty sudoku
                    if(item == '.') continue;

                    //check current row or add item
                    if(rows[r].contains(item)) return false;
                    rows[r].add(item);

                    //check current col or add item
                    if(cols[c].contains(item)) return false;
                    cols[c].add(item);

                    //get box index check it the item exists or add
                    int boxIndex = (r/3) * 3 + c/3;
                    if(boxes[boxIndex].contains(item)) return false;
                    boxes[boxIndex].add(item);



                }
            }

            return true;
        }
}
