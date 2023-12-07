package Abstraction;


import interfaces.StreamingPlayer;
public class Tv {
    private String brand;
    private int size;
    private StreamingPlayer streamingPlayer;


    public Tv(String brand, int size, StreamingPlayer streamingPlayer) {
        this.brand = brand;
        this.size = size;
        this.streamingPlayer = streamingPlayer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public StreamingPlayer getStreamingPlayer() {
        return streamingPlayer;
    }

    public void setStreamingPlayer(StreamingPlayer streamingPlayer) {
        this.streamingPlayer = streamingPlayer;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", streamingPlayer=" + streamingPlayer +
                '}';
    }

    public void play(String movie) {
        streamingPlayer.playMovie(movie);
    }
}
