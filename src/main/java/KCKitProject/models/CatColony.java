package KCKitProject.models;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

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

    private boolean isPrivateProperty;

    private boolean needsShelter;

    @OneToMany
    private List<CatShelter> catShelter = new ArrayList<>();


    public CatColony(){};

    public CatColony(String address, String description, int numCatsInColony, boolean isPrivateProperty, List<CatShelter> catShelter) {
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

    public boolean isPrivateProperty() {
        return isPrivateProperty;
    }

    public void setPrivateProperty(boolean privateProperty) {
        isPrivateProperty = privateProperty;
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
}
