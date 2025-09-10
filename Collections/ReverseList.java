import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseList {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) { 
        ReverseList rr=new ReverseList();
        rr.takeArrraList();
        rr.takeLinkedList();
    }
    public void takeArrraList(){       
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        ReverseArrayList(list,n);
        System.out.println(list);
    }
    public void ReverseArrayList(ArrayList<Integer>list,int n){
        for(int i=0; i<n/2; i++){
            int temp=list.get(i);
            list.set(i,list.get(n-i-1));
            list.set(n-i-1, temp);
        }
    }

    public void takeLinkedList(){
        int n=sc.nextInt();
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        ReverseLinkedList(list,n);
        System.out.println(list);
    }
    public void ReverseLinkedList(LinkedList<Integer>list,int n){
        for(int i=0; i<n/2; i++){
            int temp=list.get(i);
            list.set(i,list.get(n-i-1));
            list.set(n-i-1, temp);
        }
    }   
}