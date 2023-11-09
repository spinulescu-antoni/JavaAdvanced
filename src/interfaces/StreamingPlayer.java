package interfaces;

public interface StreamingPlayer {
    //static final constantele (by defaul in interfata)
    int MAX_NUMBER_OF_USERS = 10;

    //public abstract metodele (by defaul in interfata)
    //metodele pot fi si statice

    void playMovie(String movie);

    void stopMovie();

    default double getSubscriptionPrice(){
        return 99.9;
    }
}
