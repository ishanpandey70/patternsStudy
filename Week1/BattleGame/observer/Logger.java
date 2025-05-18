package observer;
public class Logger implements Observer {
  
    @Override
    public void update(Subject subject) {
        // Assuming the subject is of type ObservableBehaviour
        System.out.println( subject.getSubject());
    }
    
    
}
