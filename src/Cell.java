
public class Cell {
    public int cole;
    public int row;


    public Cell(int cole, int row) {
        this.cole = cole;
        this.row = row;
    }

    @Override
    public String toString() {
        return "[" + row + "] [" + cole + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cole;
        result = prime * result + row;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cell other = (Cell) obj;
        if (cole != other.cole)
            return false;
        if (row != other.row)
            return false;
        return true;
    }

    

    

    
}
