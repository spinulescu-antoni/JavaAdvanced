package GenericTypes;

public class BoxGeneric<T> {
    private int lenght;
    private int width;
    private T content;

    public BoxGeneric(int lenght, int width, T content) {
        this.lenght = lenght;
        this.width = width;
        this.content = content;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "BoxGeneric{" +
                "lenght=" + lenght +
                ", width=" + width +
                ", content=" + content +
                '}';
    }
}
