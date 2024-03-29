package interfaces;

public class NetflixStreamingPlayer implements StreamingPlayer {

   @Override
   public void playMovie(String movie) {
      System.out.println("Playing movie " + movie +  " on Netflix.");
   }
   @Override
   public void stopMovie() {
      System.out.println("Stopping movie on Netflix");
   }

   @Override
   public double getSubscriptionPrice() {
      return 119.9;
   }
}
