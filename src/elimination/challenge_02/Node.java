package elimination.challenge_02;

/**
 * <h3>Node class</h3>
 * Used to encapsulate a Node data
 * <p>
 * <h3>Author</h3>
 * Ezra Lazuardy<br/>
 * <a href="mailto:ezralucio@gmail.com">ezralucio@gmail.com</a><br/>
 * <a href="https://ezralazuardy.com">https://ezralazuardy.com</a>
 * </p>
 */
public class Node implements Comparable {

    private final Node parent;
    private final Coordinate coordinate;
    private final double h;
    private double g;

    /**
     * Node constructor
     *
     * @param parent     Node
     * @param coordinate Coordinate
     * @param g          double
     * @param h          double
     */
    public Node(Node parent, Coordinate coordinate, double g, double h) {
        this.parent = parent;
        this.coordinate = coordinate;
        this.g = g;
        this.h = h;
    }

    /**
     * The Node sorting comparator by f(n) value
     *
     * @param o Object
     * @return int
     */
    @Override
    public int compareTo(Object o) {
        return Double.compare(this.getF(), ((Node) o).getF());
    }

    /**
     * Get Node's parent
     *
     * @return Node
     */
    public Node getParent() {
        return this.parent;
    }

    /**
     * Get Node's coordinate
     *
     * @return Coordinate
     */
    public Coordinate getCoordinate() {
        return this.coordinate;
    }

    /**
     * Get Node's move function <code>g(n)</code> value
     *
     * @return double
     */
    public double getG() {
        return this.g;
    }

    /**
     * Increment Node's move function <code>g(n)</code> value by the given path price
     *
     * @param pathPrice double
     */
    public void incrementG(double pathPrice) {
        this.g += this.parent.getG() + pathPrice;
    }

    /**
     * Get Node's heuristic function <code>h(n)</code> value
     *
     * @return double
     */
    public double getH() {
        return this.h;
    }

    /**
     * Get Node's cost function <code>f(n)</code> value
     *
     * @return double
     */
    public double getF() {
        return this.getG() + this.getH();
    }
}
