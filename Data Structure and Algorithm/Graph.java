import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

// bfs will go level by level, ask all the a's adjancent node if they have path to b
// using queue to implement the bfs

public class Graph {
    // mapping of node id to actual node
    private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

    public static class Node{
        private int id;
        LinkedList<Node> adjacent = new LinkedList<Node>();
        private Node(int id){
            this.id = id;
        }
    }

    private Node getNode(int id){
        return nodeLookup.get(id);
    }

    private void getEdge(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        s.adjacent.add(d);
    }


    public boolean bfs(Node source, Node destination){
        // a queue to add the next to visit node
        Queue<Node> nextToVisit = new LinkedList<Node>();
        // then ode has been visited
        HashSet<Node> visited = new HashSet<Node>();
        nextToVisit.add(source);
        while (!nextToVisit.isEmpty()){
            Node node = nextToVisit.remove();
            if (node == destination){
                return true;
            }
            if (visited.contains(node)){
                continue;
            }
            visited.add(node);

            for (Node child : node.adjacent){
                nextToVisit.add(child);
            }
        }
        return false;
    }

    // dfs will go all the way down the path
    public boolean dfs(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        HashSet<Integer> visited = new HashSet<Integer>();
        return hasdfs(s,d,visited);
    }


    public boolean hasdfs(Node source, Node destination, HashSet<Integer> visited){
        if (visited.contains(source.id)) return false;
        if (source == destination) return true;

        for (Node child : source.adjacent){
            if (hasdfs(child, destination,visited)){
                return true;
            }
        }
        return false;
    }




}
