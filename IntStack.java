import java.util.*;
interface Stack{
	void push();
	void pop();
	void display();
	boolean isEmpty();
}
class Dynamic implements Stack{
	int top= -1;
	int stk[];
	int size;
	Dynamic(){
		size = 10;
		int top = -1;
		stk = new int[size];
	}
	public void push(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element to be pushed into the stack:    ");
		if(top == size-1){
			size *= 2;
			int tmp[] = new int[size];
			for(int i=0;i<=top;i++){
				tmp[i] = stk[i];
			}
			stk = tmp;
		}
		stk[++top] = sc.nextInt();
	}
	public void pop(){
		if(isEmpty()){
			System.out.println("The stack is empty!!");
		}
		else{
			System.out.println("The poped element is:   "+stk[top]);
			top--;
		}
	}
	public boolean isEmpty(){
		if(top == -1){
			return true;
		}
		else{
			return false;
		}
	}
	public void display(){
		if(isEmpty()){
			System.out.println("Stack empty!!!");
		}
		else{
			System.out.print("\nThe elements of the stack are:\n");
			for(int i=top;i!=-1;i--){
				System.out.print(stk[i]+"   ");
			}
		}
	}
}
class IntStack{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ch;
		Dynamic ob = new Dynamic();
		do{
			System.out.println("\n1 : Push an element into the stack");
			System.out.println("2 : Pop the top element");
			System.out.println("3 : Display ell the elements");
			System.out.println("4 : Exit");
			System.out.print("Enter your choise:     ");
			ch = sc.nextInt();
			switch(ch){
				case 1: ob.push();
						break;
				case 2: ob.pop();
						break;
				case 3: ob.display();
						break;
				case 4: 
						break;
				default:System.out.println("INVALID CHOISE!!!!");
			}
		}while(ch!=4);
	}
}
