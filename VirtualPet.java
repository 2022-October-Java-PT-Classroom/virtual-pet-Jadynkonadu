public class VirtualPet {

// Variables
    private String petName;
    private int hunger;
    private int thirst;
    private int waste;
    private int boredom;
    private int sickness;

// Constructors
public VirtualPet(String n){
    petName = n;
    hunger = 1 + (int) (Math.random() * 5);
    thirst = 1 + (int) (Math.random() * 5);
    waste = 1 + (int) (Math.random() * 5);
    boredom = 1 + (int) (Math.random() * 5);
    sickness = 1 + (int) (Math.random() * 5);
}

// Status Update Methods
public void updateHunger(int h){
    hunger += h;
}
public void updateThirst(int t){
    thirst += t;
}
public void updateWaste(int w){
    waste += w;
}
public void updateBoredom(int b){
    boredom += b;
}
public void updateSickness(int s){
    sickness += s;
}

// Getters and Setters
public String getPetName() {
    return petName;
}

public void setPetName(String petName) {
    this.petName = petName;
}

public int getHunger() {
    return hunger;
}

public void setHunger(int hunger) {
    this.hunger = hunger;
}

public int getThirst() {
    return thirst;
}

public void setThirst(int thirst) {
    this.thirst = thirst;
}

public int getWaste() {
    return waste;
}

public void setWaste(int waste) {
    this.waste = waste;
}

public int getBoredom() {
    return boredom;
}

public void setBoredom(int boredom) {
    this.boredom = boredom;
}

public int getSickness() {
    return sickness;
}

public void setSickness(int sickness) {
    this.sickness = sickness;
}


// Tick Method
public void tick(){
    hunger += 1 + (int) (Math.random() * 5);
    thirst += 1 + (int) (Math.random() * 5);
    waste += 1 + (int) (Math.random() * 5);
    boredom += 1 + (int) (Math.random() * 5);
    sickness += 1 + (int) (Math.random() * 5);
}

// Couldn't figure out how to prevent negative outputs.
}

