package GenericTypes;

public class Box {
        private int length;
        private int width;
        private Object content;

        public Box(int length, int width, Object content) {
            this.length = length;
            this.width = width;
            this.content = content;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public Object getContent() {
            return content;
        }

        public void setContent(Object content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return "Box{" +
                    "length=" + length +
                    ", width=" + width +
                    ", content=" + content +
                    '}';
        }
}
