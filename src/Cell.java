
public class Cell {
    public int cole;
    public int row;


    public Cell(int cole, int row) {
        this.cole = cole;
        this.row = row;
    }

    @Override
    public String toString() {
        return "Cell (" + cole + ") (" + row + ")";
    }

    

    
}
