package interfaces;

public class PrimeStreamingPlayer implements StreamingPlayer{
    @Override
    public void playMovie(String movie) {
        System.out.println("Playing movie " + movie + " on Prime.");
    }

    @Override
    public void stopMovie(){
        System.out.println("Stopping movie on Prime.");
    }

}
