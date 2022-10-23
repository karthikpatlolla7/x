import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;

    }}

    

class Linkedlist{
    static Node head = null;
    static Node tail = null;
    public static Node insert(int d)
    {
        Node n=new Node(d);
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else
        {
            tail.next=n;
            tail=n;
        }
        return head;
        
    } 
    public static void print()
    {
         Node t=head;
        while(t!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int d=sc.nextInt();
            head=insert(d);
        }
        
        
    }

    
}