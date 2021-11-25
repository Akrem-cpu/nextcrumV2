package library.utilities;


import library.pages.ActivityStream;
import library.pages.Authorization;

public class Pages {
    private Pages(){}

   private static ThreadLocal<ActivityStream> streamPool = new ThreadLocal<>();
   private static ThreadLocal<Authorization> authorizationPool = new ThreadLocal<>();



    public synchronized static ActivityStream getStream() {
        if(streamPool.get()==null){
            streamPool.set(new ActivityStream());

        }

        return streamPool.get();
    }

    public synchronized static Authorization getAuthorization() {
        if(authorizationPool.get() == null){
            authorizationPool.set(new Authorization());
        }
        return   authorizationPool.get();
    }

    public static void closeAuthorization(){
        authorizationPool.set(null );
    }
    public static void closeStream(){
        streamPool.set(null);
    }

    public static  void main(String[] args) {

    }
 



}
