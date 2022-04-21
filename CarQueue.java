import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class CarQueue{

	
	private Queue<Integer> queue; 
	private Random rand;
	

	public CarQueue() {
		
		queue = new ArrayDeque<Integer>();
		rand = new Random();
		
		queue.add(rand.nextInt(4));
		queue.add(rand.nextInt(4));
		queue.add(rand.nextInt(4));
		queue.add(rand.nextInt(4));
		queue.add(rand.nextInt(4));

		
	}
	
	public void addToQueue() {
		
		class Queue implements Runnable
		{
			
			
			@Override
			public void run() {
				
				while(true)
				{
					try {
						queue.add(rand.nextInt(4));
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
					
			}
			
			
			
		}
		
		Queue carMovement = new Queue();
		Thread thread = new Thread(carMovement);
		thread.start();
		
	
	
		
		
	}

	public int deleteQueue() {
		
		return queue.remove();
	}

	
		

}
