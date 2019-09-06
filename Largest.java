
class Largest {
	public static void main(String args[]){
		System.out.print("The entered integers are:\t");
		for(int i=0;i<args.length;i++)
			System.out.print(Integer.parseInt(args[i])+", ");
		
		int largest = 0;
		for(int i=0;i<args.length;i++){
			if(largest<Integer.parseInt(args[i])){
				largest = Integer.parseInt(args[i]);
			}
		}
		
		System.out.println("\nThe largest number is:    "+largest);
	}
}
