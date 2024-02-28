import java.util.*;
class Graph1<T> {
    private Map<T, List<T> > map = new HashMap<>();
    public void addVertex(T s)
    {
        map.put(s, new LinkedList<T>());
    }

    public void addEdge(T source,
                        T destination,
                        boolean bidirectional)
    {

        if (!map.containsKey(source))
            addVertex(source);

        if (!map.containsKey(destination))
            addVertex(destination);

        map.get(source).add(destination);
        if (bidirectional == false) {
            map.get(destination).add(source);
        }
    }
    public void getVertexCount()
    {
        System.out.println("The graph has "
                + map.keySet().size()
                + " vertex");
    }
    public void getEdgesCount(boolean bidirection)
    {
        int count = 0;
        for (T v : map.keySet()) {
            count += map.get(v).size();
        }
        if (bidirection == true) {
            count = count / 2;
        }
        System.out.println("The graph has "
                + count
                + " edges.");
    }


    public void inoutDegree(int v, Graph1 graph1){

        //get all nodes
        String adj = graph1.toString();


    }
    int out = 0;
    int in = 0;
    int one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen;
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Graph1 b = new Graph1();
        int count;
        HashMap<Integer,Integer> tempNode = new HashMap<>();
        for (T v : map.keySet()) {
            out = 0;
            builder.append(v.toString() + ": ");
            count = 0;
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
                int value = Integer.parseInt(w.toString());

                if (map.containsKey(value)) {
                    // Increment the count for the value
                    tempNode.put(value, tempNode.getOrDefault(value,0) + 1);
                } else {
                    // Add the value to the HashMap with count 1
                    tempNode.put(value, 1);
                }

                out++;
                System.out.println("the outdegree of " + v + " is " + out + "\n");

            }

            for(Integer key: tempNode.keySet()){
                Integer val = tempNode.get(key);

                System.out.println("in degree of " + key + " is " + val);
            }



            builder.append("\n");
        }
        return (builder.toString());
    }
}
