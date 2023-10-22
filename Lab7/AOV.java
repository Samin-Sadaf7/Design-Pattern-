package Lab7;

import java.util.ArrayList;
import java.util.List;

public class AOV {
     public static void main(String[] args) {
        VillageBuilder builder = new VillageBuilder();

        builder.buildHouse("Brick House");
        builder.buildTree("Mango Tree");
        builder.buildWaterSource("Swimming Pool");

        VillageComposite combination1 = builder.getVillage();
        combination1.display();

        builder = new VillageBuilder();  

        builder.buildHouse("Mud House");
        builder.buildTree("Banana Tree");
        builder.buildWaterSource("Pond");

        VillageComposite combination2 = builder.getVillage();
        combination2.display();

        List<VillageComponent> components = new ArrayList<>();
        components.add(combination1);
        components.add(combination2);

        VillageIterator iterator = new VillageIterator(components);
        System.out.println("\nVillage Components:");
        while (iterator.hasNext()) {
            iterator.next().display();
        }
    }
}
