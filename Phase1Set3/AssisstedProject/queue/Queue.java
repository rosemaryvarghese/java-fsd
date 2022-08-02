package queue;

import java.util.Scanner;

public class Queue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the Queue");
		int size=sc.nextInt();
		int Queue[]=new int[size];
		int front=-1,rear=-1;
		System.out.println("Q operation");
		while(true) {
			System.out.println("enter ur choice 1.enqueue 2.dequeue 3.display 4.exit");
			int ch=sc.nextInt();
			switch(ch) {
			//over flow
			case 1:if(rear==size-1) {
				System.out.println("Q is full no more insertions");
			}
			else {
				System.out.println("enter the ele to insert");
				int key=sc.nextInt();
				rear++;
				Queue[rear]=key;
				front=0;
			}
			break;
			
			case 2:if((front==-1&&rear==-1)||(front>rear)) {
				System.out.println("Q is empty no del operation");
			}
			else {
				front=front+1;
			}
			break;
			case 3:if((front==-1&&rear==-1)||(front>rear)) {
				System.out.println("Q is empty ");
			}
			else {
				for(int i=front;i<=rear;i++) {
					System.out.println(Queue[i]);
				}
			}
			break;
			case 4:System.exit(0);
			break;
			default:System.out.println("check ur choice");
			break;	
			}
		}
	}

}







