import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



class Name implements Runnable{
    String name;
    Name(String name){
        this.name=name;
    }
    public void run(){
        System.out.println(name +" thread printing the name "+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name +" thread printed the name "+Thread.currentThread().getName()); }
}
 public class ThreadPool{
    public static void main(String[] args){
        Name[]  names={
                new Name("Abbas"),
                new Name("Jay"),
                new Name("Parth"),
                new Name("Ashish"),
                new Name("Ali"),
                new Name("Kumar"),
        };
        ExecutorService fire = Executors.newFixedThreadPool(2);
        for(Name name:names){
            fire.submit(name);
        }
        fire.shutdown();
    }
}
