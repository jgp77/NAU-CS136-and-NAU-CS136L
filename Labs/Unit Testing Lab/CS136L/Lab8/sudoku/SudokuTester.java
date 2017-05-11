package sudoku;
import static org.junit.Assert.*;
import org.junit.Test;
public class SudokuTester
{
@Test (expected = IllegalArgumentException.class)
public void testCharactersLayouts()
{
        Sudoku sudoku=new Sudoku("  j26 7 1\n68  7  9 \n19   45  \n82 1   4 \n  46 29  \n 5   3 28\n  93   74\n 4  5  36\n7 3 18   \n");
}
@Test
public void testGetSquare()
{
        Sudoku sudoku=new Sudoku("  226 7 1\n68  7  9 \n19   45  \n82 1   4 \n  46 29  \n 5   3 28\n  93   74\n 4  5  36\n7 3 18   \n");
        assertEquals("Square should be 2",'2',sudoku.getSquare(0,3));
}
@Test
public void testSetSquare()
{
        Sudoku sudoku=new Sudoku("   26 7 1\n68  7  9 \n19   45  \n82 1   4 \n  46 29  \n 5   3 28\n  93   74\n 4  5  36\n7 3 18   \n");
        sudoku.setSquare(1,3,'2');
        assertEquals("Square should be 2",'2',sudoku.getSquare(1,3));
}
@Test (expected = IllegalArgumentException.class)
public void testSetSquareException()
{
  Sudoku sudoku=new Sudoku("   26 7 1\n68  7  9 \n19   45  \n82 1   4 \n  46 29  \n 5   3 28\n  93   74\n 4  5  36\n7 3 18   \n");
  sudoku.setSquare(1,3,'j');
}
@Test
public void testisRowValid()
{
        Sudoku sudoku=new Sudoku("2  26 7 1\n68  7  9 \n19   45  \n82 1   4 \n  46 29  \n 5   3 28\n  93   74\n 4  5  36\n7 3 18   \n");
        assertFalse("Row does not have repeated numbers",sudoku.isValid());
}
@Test
public void testisColValid()
{
        Sudoku sudoku=new Sudoku("6  26 7 1\n68  7  9 \n19   45  \n82 1   4 \n  46 29  \n 5   3 28\n  93   74\n 4  5  36\n7 3 18   \n");
        assertFalse("Column does not have repeated numbers",sudoku.isValid());
}
@Test
public void testisSquareValid()
{
        Sudoku sudoku=new Sudoku("8  26 7 1\n68  7  9 \n19   45  \n82 1   4 \n  46 29  \n 5   3 28\n  93   74\n 4  5  36\n7 3 18   \n");
        assertFalse("Square does not have repeated numbers",sudoku.isValid());
}
@Test
public void testisVaid()
{
        Sudoku sudoku=new Sudoku("   26 7 1\n68  7  9 \n19   45  \n82 1   4 \n  46 29  \n 5   3 28\n  93   74\n 4  5  36\n7 3 18   \n");
        assertTrue("Puzzle is not valid",sudoku.isValid());
}
@Test
public void testisSolved()
{
        Sudoku sudoku=new Sudoku("   26 7 1\n68  7  9 \n19   45  \n82 1   4 \n  46 29  \n 5   3 28\n  93   74\n 4  5  36\n7 3 18   \n");
        assertFalse("There is no space on the board",sudoku.isSolved());
}
@Test
public void testisBoardSolved()
{
        Sudoku sudoku=new Sudoku("435269781\n682571493\n197834562\n826195347\n374682915\n951743628\n519326874\n248957136\n763418259\n");
        assertTrue("Checks if board is solved",sudoku.isSolved());
}
}
