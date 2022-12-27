package KCKitProject.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class CatShelter {

    @Id
    @GeneratedValue
    private int id;
    @NotNull
    @Size(min = 5, max = 200, message = "Must be between 5 and 200 characters")
    private String shelterLocationDescription;
    @NotNull
    private int shelterHeight;
    @NotNull
    private int shelterWidth;
    @NotNull
    private boolean isInsulated;
    @NotNull
    private boolean hasStraw;
    @NotNull
    private boolean needsRepair;

    private String neededRepairDescription;

    public CatShelter(){};


}
