class Queue {
	int q[], n;
	int f=0;
	int r=-1;
	q[] = new int[10];
	void insert(int ele){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be inserted");
		int ele = sc.nextInt();
		if(r == 9)
			System.out.println("Queue overflow!");
		else {
			q[r] = ele;
			r++;
		}
	}
	int delete(){
		int ele;
		if(f=0)
			System.out.println("Queue underflow");
		else{
			ele = q[f];
			f++;
		}
		return ele;
	}
	void display(){
		System.out.println("The elements of the Queue are:);
		for(int i=0;i<=r;i++)
		{
			System.out.println(q[i]+", ");
		}
	}
}
class QueueDemo.java{
	public ststic void main(String args[]){
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1 : Insert an element into the Queue");
			System.out.println("2 : Delete an element from the Queue");
			System.out.println("3 : Display the elements of the Queue");
			System.out.println("4 : Exit");
			System.out.print("Enter your choise:   ");
		}
	}
}
