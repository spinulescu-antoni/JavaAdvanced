package Generic;

import java.util.ArrayList;
import java.util.List;

public class MediaLibrary<T extends Media> {

    private List<T> medias = new ArrayList<>();

    public void addMedia(T media) {
        medias.add(media);
    }

    public void removeMedia(T media) {
        medias.remove(media);
    }

    public void printMedias(){
        for (T media : medias) {
            System.out.println(media);
        }
        System.out.println();
    }
    public double getTotalPrice() {
        double totalPrice = 0;
        for (T media : medias) {
            totalPrice += media.calculatePrice();

        }
        return totalPrice;
    }

}
