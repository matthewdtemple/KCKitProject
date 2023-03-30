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
    @Size(min = 1, max = 200, message = "Must be between 5 and 200 characters")
    private String shelterLocationDescription;

    @NotNull
    private boolean isInsulated;

    @NotNull
    private boolean hasStraw;

    @NotNull
    private boolean needsRepair;

    private String neededRepairDescription;

    public CatShelter(){};

    public String getShelterLocationDescription() {
        return shelterLocationDescription;
    }

    public void setShelterLocationDescription(String shelterLocationDescription) {
        this.shelterLocationDescription = shelterLocationDescription;
    }

    public boolean isInsulated() {
        return isInsulated;
    }

    public void setInsulated(boolean insulated) {
        isInsulated = insulated;
    }

    public boolean isHasStraw() {
        return hasStraw;
    }

    public void setHasStraw(boolean hasStraw) {
        this.hasStraw = hasStraw;
    }

    public boolean isNeedsRepair() {
        return needsRepair;
    }

    public void setNeedsRepair(boolean needsRepair) {
        this.needsRepair = needsRepair;
    }

    public String getNeededRepairDescription() {
        return neededRepairDescription;
    }

    public void setNeededRepairDescription(String neededRepairDescription) {
        this.neededRepairDescription = neededRepairDescription;
    }
}
