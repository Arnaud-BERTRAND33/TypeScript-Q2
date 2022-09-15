public class photo {
    private String url;
    private String filename;
    private float width;
    private float number;

    public photo(String url, String filename, float width, float number) {
        this.url = url;
        this.filename = filename;
        this.width = width;
        this.number = number;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }
}
