package interfaces;

public class Main {
    public static void main(String[] args) {
        StreamingPlayer netflix = new NetflixStreamingPlayer();
        StreamingPlayer prime = new PrimeStreamingPlayer();

        netflix.playMovie("Batman");
        prime.playMovie("Spider-man");

        netflix.stopMovie();
        prime.stopMovie();

        System.out.println("Prime subscription is " + prime.getSubscriptionPrice());
        System.out.println("Netflix subscription is " + netflix.getSubscriptionPrice());

        StreamingPlayer steamingPlayer = new StreamingPlayer() {
            @Override
            public void playMovie(String movie) {
                System.out.println("Playing movie " + movie + " on my awsome streaming player. ");
            }

            @Override
            public double getSubscriptionPrice() {
                return 5.99;
            }

            @Override
            public void stopMovie() {
                System.out.println("Stopping movie on my awsome streaming player. ");




            }
        };
        System.out.println();
        System.out.println("My awesome player subscription is " + steamingPlayer.getSubscriptionPrice());
        steamingPlayer.playMovie("Titanic");
        steamingPlayer.stopMovie();
        System.out.println("------------------");
        processStreamingPlayer(netflix, "batman");
        processStreamingPlayer(prime, "Spider-man");
        processStreamingPlayer(steamingPlayer,"Titanic");

    }
    static void processStreamingPlayer(StreamingPlayer streamingPlayer,String movie){
        streamingPlayer.playMovie(movie);
        streamingPlayer.stopMovie();
        System.out.println("Subscription price is: " + streamingPlayer.getSubscriptionPrice());

        System.out.println("-------------");
    }
}
