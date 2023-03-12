package KCKitProject.models;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Entity
public class CatColony {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank
    @Size(min = 5, max = 100, message = "Must be between 5 and 100 characters")
    private String address;

    @NotBlank
    @Size(min = 5, max = 200, message = "Must be between 5 and 200 characters")
    private String locationDescription;

    @NotNull
    private int numCatsInColony;

    @NotBlank
    @Size(min = 5, max = 100, message = "Must be between 2 and 100 characters")
    private String isPrivateProperty;

    private boolean needsShelter;

    @OneToMany
    private List<CatShelter> catShelter = new ArrayList<>();

    private float latitude;

    private float longitude;

    // working on import of jsonobject and google api
//    public static void getLatLng(String address) throws IOException {
//        String url = "https://maps.googleapis.com/maps/api/geocode/json?address=" + address + "&key=";
//        URLConnection connection = new URL(url).openConnection();
//        connection.setRequestProperty("Accept-Charset", "UTF-8");
//        Scanner scanner = new Scanner(connection.getInputStream());
//        String response = scanner.useDelimiter("\\A").next();
//        scanner.close();
//        String jsonObject = new String(response);
//        double lat = jsonObject.getJSONArray("results").getJSONObject(0).getJSONObject("geometry")
//                .getJSONObject("location").getDouble("lat");
//        double lng = jsonObject.getJSONArray("results").getJSONObject(0).getJSONObject("geometry")
//                .getJSONObject("location").getDouble("lng");
//        return new double[]{lat, lng};
//    }

    public CatColony(){};

    public CatColony(String address, String description, int numCatsInColony, String isPrivateProperty, List<CatShelter> catShelter) {
        this.address = address;
        this.locationDescription = description;
        this.numCatsInColony = numCatsInColony;
        this.isPrivateProperty = isPrivateProperty;
        this.catShelter = catShelter;
    }

    public int getId() {
        return id;
    }

    public List<CatShelter> getCatShelter() {
        return catShelter;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getIsPrivateProperty() {
        return isPrivateProperty;
    }

    public void setIsPrivateProperty(String isPrivateProperty) {
        this.isPrivateProperty = isPrivateProperty;
    }

    public int getNumCatsInColony() {
        return numCatsInColony;
    }

    public void setNumCatsInColony(int numCatsInColony) {
        this.numCatsInColony = numCatsInColony;
    }

    public void setCatShelter(List<CatShelter> catShelter) {
        this.catShelter = catShelter;
    }

    public boolean isNeedsShelter() {
        return needsShelter;
    }

    public void setNeedsShelter(boolean needsShelter) {
        this.needsShelter = needsShelter;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
