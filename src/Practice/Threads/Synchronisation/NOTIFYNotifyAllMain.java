package Practice.Threads.Synchronisation;

public class NOTIFYNotifyAllMain {
public static void main(String[] args) {
	Data data = new Data();
	   Thread sender = new Thread(new Sender(data));
	    Thread receiver = new Thread(new Receiver(data));
	    
	    sender.start();
	    receiver.start();
	    
	    
	    //stopping Thread
//	    Thread controlThread=new Thread(new ControlSubThread(1000));
//	    controlThread.start();
}
}
