import java.util.*;
class WrongAgeException extends Exception{
	int age;
	WrongAgeException(int age){
		this.age = age;
	}
	public String toString(){
		return (age+"  is a WRONG AGE!!!\n");
	}
}
class Father{
	int age1;
	Father() throws WrongAgeException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of Father");
		age1 = sc.nextInt();
			if(age1<0){
				throw new WrongAgeException(age1);
		}
	}
}
class Son extends Father{
	int age2;
	Son() throws WrongAgeException{
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of Son");
		age2 = sc.nextInt();
			if(age2>=age1){
				throw new WrongAgeException(age2);
			}
	}
}

class ExceptionHandling{
	public static void main(String agrs[]){
		try{
			Son s = new Son();
		}
		catch(WrongAgeException e){
			System.out.println(e);
		}
	}
}
