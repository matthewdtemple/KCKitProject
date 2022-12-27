package KCKitProject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class CatColony {

    @Id
    @GeneratedValue
    private int id;
    @NotNull
    @Size(min = 5, max = 100, message = "Must be between 5 and 100 characters")
    private String address;
    @NotNull
    @Size(min = 5, max = 200, message = "Must be between 5 and 200 characters")
    private String description;
    @NotNull
    private int numCatsInColony;
    @NotNull
    private boolean isPrivateProperty;
    @ManyToOne
    private List<CatShelter> catShelter;


    public CatColony(){};

    public CatColony(String address, String description, int numCatsInColony, boolean isPrivateProperty, List<CatShelter> catShelter) {
        this.address = address;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPrivateProperty() {
        return isPrivateProperty;
    }

    public void setPrivateProperty(boolean privateProperty) {
        isPrivateProperty = privateProperty;
    }
}
