class BMSCE implements Runnable{
    Thread t;
    BMSCE(){
        t = new Thread(this, "T1");
        t.start();
    }
	public void run(){
		while(true){
			System.out.println("BMS College of Engineering");
			try{
				Thread.sleep(10000);
			}
			catch(Exception e){}
		}
	}
}
class CSE implements Runnable{
    Thread t;
    CSE(){
        t = new Thread(this, "T1");
        t.start();
    }
	public void run(){
		while(true){
			System.out.println("Computer Science and Engineering");
			try{
				Thread.sleep(2000);
			}
			catch(Exception e){}
		}
	}
}
class ThreadDemo{
	public static void main(String[] args){
		BMSCE ob1 = new BMSCE();
		CSE ob2 = new CSE();
	}
}
