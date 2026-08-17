public class DemoSingleton {

    public static void main(String[] args) {
        
        Singleton s1 = Singleton.CreateSingleton();
        Singleton s2 = Singleton.CreateSingleton();
        Singleton s3 = Singleton.CreateSingleton();
        
        System.out.println("Hashcode of s1: " + s1.hashCode());
        System.out.println("Hashcode of s2: " + s2.hashCode());
        System.out.println("Hashcode of s3: " + s3.hashCode());
    }
}
