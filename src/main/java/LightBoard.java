public class LightBoard
{
  /** The lights on the board, where true represents on and false represents off.
   */
  private boolean[][] lights;

  /** Constructs a LightBoard object having numRows rows and numCols columns.
   * Precondition: numRows > 0, numCols > 0
   * Postcondition: each light has a 40% probability of being set to on.
   */
  public LightBoard(int numRows, int numCols)
  {
    lights = new boolean[numRows][numCols];
    for(int r = 0; r < numRows; r++) {
      for(int c = 0; c < numCols; c++) {
        lights[r][c] = (int)(Math.random()*10) < 4;      
      }
    }

  }

  /** Evaluates a light in row index row and column index col and returns a status
   *  as described in part (b).
   *  Precondition: row and col are valid indexes in lights.
   */
  public boolean evaluateLight(int row, int col)
  {
    if(lights[row][col]) {
      int count = 0;
      for(int i = 0; i < lights.length; i++) {
        if(lights[i][col])
          count += 1;
      }
      return count%2 == 1;  
      
    } else {
      int count = 0;
      for(int i = 0; i < lights.length; i++) {
        if(lights[i][col])
          count += 1;
      }
      
      return count%3 == 0;
    }
   
 
  }
  public boolean[][] getLights()
  {
    return lights;
  }
  //used for testing
  public String toString()
  {
    String s = "";
    for (int r = 0; r < lights.length; r++)
    {
      for (int c = 0; c < lights[0].length; c++)
        if (lights[r][c])
          s += "*";
        else
          s += ".";
      s += "\n";
    }
    return s;
  }
  
}
