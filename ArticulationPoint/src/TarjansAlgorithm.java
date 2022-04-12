import java.util.*;
import java.util.LinkedList;

class TarjansAlgorithm
{
    private int noOfVertices;
    private LinkedList<Integer> adj[];
    int time = 0;
    static final int NIL = -1;

    TarjansAlgorithm(int v)
    {
        noOfVertices = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    //Function to add an edge into the graph 
    void addEdge(int v, int w)
    {
        adj[v].add(w);  // Add w to v's list. 
        adj[w].add(v);    //Add v to w's list 
    }

    // A recursive function that find articulation points using DFS
    void FindAP(int u, boolean visited[], int disc[],
                int low[], int parent[], boolean articulationPoint[])
    {
        // Count of children in DFS Tree
        int children = 0;
        // u -->The vertex to be visited next
        visited[u] = true;

        // Initialize discovery time and low value 
        disc[u] = low[u] = ++time;

        // Go through all vertices adjacent to this
        Iterator<Integer> i = adj[u].iterator();
        while (i.hasNext())
        {
            int v = i.next();  // v is current adjacent of u 

            // If v is not visited yet, then make it a child of u 
            // in DFS tree and recur for it 
            if (!visited[v])
            {
                children++;
                parent[v] = u;
                FindAP(v, visited, disc, low, parent, articulationPoint);

                // Check if the subtree rooted with v has a connection to 
                // one of the ancestors of u 
                low[u]  = Math.min(low[u], low[v]);

                // check if the vertex is the root of DFS tree and has two or more children.
                if (parent[u] == NIL && children > 1)
                    articulationPoint[u] = true;

                // If vertex is not root and low value of one of its child
                // is more than discovery value of parent.
                if (parent[u] != NIL && low[v] >= disc[u])
                    articulationPoint[u] = true;
            }

            // Update low value of u for parent function calls. 
            else if (v != parent[u])
                low[u]  = Math.min(low[u], disc[v]);
        }
    }

    // The function to do DFS traversal. It uses recursive function APUtil() 
    void AP()
    {

        //to keeps tract of visited vertices
        boolean visited[] = new boolean[noOfVertices];
        // to Stores discovery times of visited vertices
        int disc[] = new int[noOfVertices];
        // to Stores parent vertices in DFS tree
        int parent[] = new int[noOfVertices];
        // to store articulation points
        boolean ap[] = new boolean[noOfVertices];
        int low[] = new int[noOfVertices];

        // Initialize parent and visited, and ap(articulation point
        for (int i = 0; i < noOfVertices; i++)
        {
            parent[i] = NIL;
            visited[i] = false;
            ap[i] = false;
        }

        // Call the recursive helper function to find articulation 
        // points in DFS tree rooted with vertex 'i' 
        for (int i = 0; i < noOfVertices; i++)
            if (visited[i] == false)
                FindAP(i, visited, disc, low, parent, ap);

        // Now ap[] contains articulation points, print them 
        for (int i = 0; i < noOfVertices; i++)
            if (ap[i] == true)
                System.out.print(i+" ");
    }

    public static void main(String args[])
    {
        System.out.println("Articulation points: ");
        TarjansAlgorithm g1 = new TarjansAlgorithm(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        g1.AP();
        System.out.println();

    }
} 