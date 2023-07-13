import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        int choice;

        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("VIRTUAL PET");
        System.out.println("--------------------------");
        System.out.println("Is a pet without a name REALLY a pet?");
        System.out.println("Go on, give it a name:");
        String petName = input.nextLine();

        VirtualPet pet = new VirtualPet(petName);

        petNeeds(petName);

        do{
            System.out.println("--------------------------");
            System.out.println("Pet Status");
            System.out.println("--------------------------");
            showPetNeeds(pet);
            System.out.println("");
            System.out.println("---------------------------");
            System.out.println("What would you like to do?");
            System.out.println("1. Give " + petName + " a treat");
            System.out.println("2. Refill " + petName + "'s water");
            System.out.println("3. Play with " + petName);
            System.out.println("4. Take " + petName + " out to potty");
            System.out.println("5. Take " + petName + " to the vet");
            System.out.println("6. Pass time");
            System.out.println("7. Quit");
            System.out.println("--------------------------");
            
        choice = input.nextInt();

        if(choice == 7) {
            System.out.println("--------------------------");
            System.out.println(petName + " couldn't ask for a better owner!!!");
            System.out.println("--------------------------");
            System.out.println("Check in again another time!");
            System.out.println("--------------------------");
            continue;
        }

        else if (choice == 1){
            if (pet.getHunger() > 5){
                System.out.println(petName + " isn't hungry!");
            }else
            System.out.println(petName + " loved the treat!");
            pet.updateHunger(+1);
            pet.updateThirst(-1);
            pet.updateWaste(+2);
            pet.updateBoredom(-1);
            // showPetNeeds(pet);
        }
        else if (choice == 2){
            if (pet.getThirst() > 5){
                System.out.println(petName + " isn't thirsty!");
            }else
            System.out.println(petName + "'s thirst is quenched!");
            pet.updateThirst(+1);
            pet.updateWaste(+1);
            // showPetNeeds(pet);
        }
        else if (choice == 3){
            if (pet.getBoredom() < 5){
                System.out.println(petName + " doesn't want to play!");
            }else
            System.out.println(petName + " loved today's game of fetch!");
            pet.updateThirst(-2);
            pet.updateHunger(-1);
            pet.updateBoredom(-2);
            // showPetNeeds(pet);
        }
        else if (choice == 4){
            if (pet.getWaste() < 5){
                System.out.println(petName + " doesn't want to potty");
            }else
            System.out.println(petName + " needed that bathroom break!");
            pet.updateThirst(-1);
            pet.updateHunger(-2);
            pet.updateWaste(-3);
            // showPetNeeds(pet);
        }
        else if (choice == 5){
            if (pet.getSickness() < 5){
                System.out.println(petName + " is in good health!");
            }else
            System.out.println(petName + " is feeling better after going to the vet!");
            pet.updateSickness(-3);
            // showPetNeeds(pet);
        }
        else if (choice == 6){
            pet.tick();
        }
        else{
            System.out.println("Please choose something to do with " + petName);
        }
    
        }while (choice != 7);
    }


    private static void showPetNeeds(VirtualPet pet){
        System.out.println("Hunger: " + pet.getHunger());
        System.out.println("Thirst: " + pet.getThirst());
        System.out.println("Waste: " + pet.getWaste());
        System.out.println("Boredom: " + pet.getBoredom());
        System.out.println("Sickness: " + pet.getSickness());
        }

    public static void petNeeds(String petName){
        System.out.println("--------------------------");
        System.out.println("Welcome to Virtual Pet! You are now the proud owner of " + petName);
    }
}
