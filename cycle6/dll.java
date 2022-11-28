import java.util.*;
public class dll{
class Node{
int data;
Node next;
Node prev = null;
Node(int data){
this.data = data;
}
}
Node head = null, tail = null;
public void insert(int data){
Node node = new Node(data);
if (head == null){
head = node;
}
else{
tail.next = node;
node.prev = tail;
}
tail = node;
}

public void insertAtHead(int data){
    Node node = new Node(data);
    node.next = head;
    node.prev = node;
    head = node;
}

public void insertAt(int data, int element){
    Node node = new Node(data);
    Node temp = head;
    while (temp.next != null){
        if (temp.data == element){
            node.prev = temp;
            node.next = temp.next;
            temp.next.prev = node;
            temp.next = node;
            return;
        }
    }
    temp = temp.next;
}

public void removeAtEnd(){
    tail = tail.prev;
    tail.next = null;
}

public void removeHead(){
    head = head.next;
    head.prev = null;
}

public void removeValue(int data){
    Node temp = head;
    while (temp.next != null){
        if (temp.data == data){
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
        }
    temp = temp.next;
    }
}

public void disHead(){
    Node temp = head;
    while (temp != null){
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.print(" ");
}

public void disTail(){
    Node temp = tail;
    while(temp != null){
        System.out.print(temp.data + " ");
        temp = temp.prev;
    }
    System.out.print("  ");
}
public static void main(String[] args){
dll dl = new dll();
int data, element;

    Scanner sc = new Scanner(System.in);
    int c = 0;
    while (true){
    System.out.print("\n1.Add at end\n2.Add at head\n3.Add between\n4.Remove from end\n5.Remove at head\n6.Delete Value\n7.Display from head\n8.Display from tail\n9.Exit");
    
    System.out.print("\n Enter choice : \n");
    
    c = sc.nextInt();
    
    switch(c){
        case 1: 
        System.out.println("Enter element to insert:\n");
        data = sc.nextInt();
            dl.insert(data);
            break;
        case 2: 
        System.out.println("Enter element to insert:\n");
        data = sc.nextInt();
            dl.insertAtHead(data);
            break;
        case 3: System.out.println("Enter element to insert:\n");
        data = sc.nextInt();
            element = sc.nextInt();
            dl.insertAt(data, element);
            break;
        case 4: 
        System.out.println("Enter element to delete:\n");
        dl.removeAtEnd();
            break;
        case 5: 
        System.out.println("Enter element to delete:\n");
        dl.removeHead();
            break;
        case 6: 
        System.out.println("Enter element to delete:\n");
        data = sc.nextInt();
            dl.removeValue(data);
            break;
        case 7: dl.disHead();
            break;
        case 8: dl.disTail();
            break;
        case 9: java.lang.System.exit(0);
        
        default:System.out.print("Invalid");
        }
    }
}
}
