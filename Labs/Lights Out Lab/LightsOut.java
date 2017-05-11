public class LightsOut
{
private boolean[][] board;
// Initializes an empty 2 dimensional boolean array
private int boardSize;
// Initializes a integer for boardSize
public LightsOut(int size)
{
        boardSize=size;
        // Sets boardSize to the given size
        board=new boolean[size][size];
        // Creates the board using the given size
}
public int getSize()
{
        return boardSize;
        // Returns the board size
}
public boolean isLit(int row, int col)
{
        try
        {
                // Tries to return if the piece is lit
                return board[row][col];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
                // Catches if given pos is out of bounds
                return false;
        }
}
public void forceLit(int row, int col,boolean value)
{
        // Firces the pos to being a given boolean
        board[row][col]=value;
}
public void press(int row, int col)
{
        forceLit(row,col,!board[row][col]);
        // Sets the clicked piece to the opposite
        try
        {
                forceLit(row+1,col,!board[row+1][col]);
                // Tries to set the pos to the opposite
        }
        catch(ArrayIndexOutOfBoundsException e) {}
        // Catches if out of bounds
        try
        {
                forceLit(row-1,col,!board[row-1][col]);
                // Tries to set the pos to the opposite
        }
        catch(ArrayIndexOutOfBoundsException e) {}
        // Catches if out of bounds
        try
        {
                forceLit(row,col+1,!board[row][col+1]);
                // Tries to set the pos to the opposite
        }
        catch(ArrayIndexOutOfBoundsException e) {}
        // Catches if out of bounds
        try
        {
                forceLit(row,col-1,!board[row][col-1]);
                // Tries to set the pos to the opposite
        }
        catch(ArrayIndexOutOfBoundsException e) {}
        // Catches if out of bounds
}
}
