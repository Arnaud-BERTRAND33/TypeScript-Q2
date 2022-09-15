import java.sql.Blob;
import java.util.Date;

public class user {
    private Date birthdate;
    private float size;
    private Blob photos;
    private String address;

    public user(Date birthdate, float size, Blob photos, String address) {
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public Blob getPhotos() {
        return photos;
    }

    public void setPhotos(Blob photos) {
        this.photos = photos;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
