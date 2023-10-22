package Lab7;
import java.util.Iterator;
import java.util.List;

class VillageIterator implements Iterator<VillageComponent> {
    private List<VillageComponent> components;
    private int currentIndex = 0;

    public VillageIterator(List<VillageComponent> components) {
        this.components = components;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < components.size();
    }

    @Override
    public VillageComponent next() {
        if (hasNext()) {
            VillageComponent component = components.get(currentIndex);
            currentIndex++;
            return component;
        }
        return null;
    }
}