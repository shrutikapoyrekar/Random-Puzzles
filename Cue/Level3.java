

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 8 8 4 4 ^
4 9 6 4 8
8 6 4 1 2
4 8 2 6 3
* 6 8 8 4
 */

/**
 *
 * @author Shrutika poyrekar
 */

class Node
{
    int data;
    Node e,w,n,s;
    Node(int x)
    {
        data=x;
        e=null;w=null;n=null;s=null;
    }
}

public class Level3 
{
    public static void main(String args[])
    {
        //Graph g = new Graph() ;
        //Node t ;
        int a[][]={{8,8,4,4,0},{4,9,6,4, 8},{8, 6, 4, 1, 2},{4, 8, 2, 6, 3},{0,6, 8, 8, 4}}; // the map
        
        int cost = 30; // we need exactly 5 chips left in the end
        
        Node start = new Node(0);
        
    }
}
