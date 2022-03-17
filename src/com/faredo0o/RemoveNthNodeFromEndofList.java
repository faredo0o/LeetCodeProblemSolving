package com.faredo0o;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val=val;}
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveNthNodeFromEndofList {
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int nodeCounter = 1;
        HashMap<Integer, ListNode> nodeList = new HashMap<>();
        nodeList.put(0, head);
        while (head.next != null) {
            nodeList.put(nodeCounter, head.next);
            head = head.next;
            nodeCounter++;
        }
        if (nodeCounter==1) return null;
        if(nodeCounter==n){
            return nodeList.get(1);
        }
        if(n==1){
            nodeList.get(nodeCounter-n-1).next=null;
            return nodeList.get(0);

        }
        nodeList.get(nodeCounter-n-1).next=nodeList.get(nodeCounter-n+1);
        return nodeList.get(0);
    }
}
