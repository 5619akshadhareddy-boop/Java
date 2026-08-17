/**
 * this class is defined to allow the instantiation exactly once-singleton design pattern
 * Singleton
 */
public class Singleton {

      //static var to track the instance of the class
    private static Singleton s = null;

    //to restrict the obj creation directly.
    private Singleton(){

        }
        
        //static method t restrict the obj creation exactluy to one instance
        public static Singleton CreateSingleton(){
            if(s == null){
                s = new Singleton();
        }
        return s;
    }
    
    
}
