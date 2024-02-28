public class Main {
    public static void main(String args[])
    {
        Graph1<Integer> g = new Graph1<Integer>();
        g.addEdge(1, 2, true);
        g.addEdge(2, 3,true);
        g.addEdge(3, 4,true);
        g.addEdge(3, 9,true);
        g.addEdge(4, 5,true);
        g.addEdge(4, 7,true);
        g.addEdge(9, 10,true);
        g.addEdge(9, 12,true);
        g.addEdge(10, 11,true);
        g.addEdge(12, 13,true);
        g.addEdge(13, 14,true);
        g.addEdge(5, 6,true);
        g.addEdge(7, 8,true);
        g.addEdge(6, 14,true);
        g.addEdge(8, 14,true);
        g.addEdge(11, 14,true);
        g.addEdge(14, 15,true);
        g.addEdge(14, 3,true);
        boolean k = false;
        g.getEdgesCount(k);

        System.out.println("Graph:\n" + g.toString());
    }
}


