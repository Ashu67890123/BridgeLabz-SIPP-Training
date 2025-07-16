class Flavor {
    String name;
    int salesCount;

    Flavor(String name, int salesCount) {
        this.name = name;
        this.salesCount = salesCount;
    }
}

class IceCreamShop {
    Flavor[] flavors;

    IceCreamShop(Flavor[] flavors) {
        this.flavors = flavors;
    }

    void sortFlavorsByPopularity() {
        if (flavors == null) return;
        for (int i = 0; i < flavors.length - 1; i++) {
            for (int j = 0; j < flavors.length - i - 1; j++) {
                if (flavors[j] != null && flavors[j + 1] != null && flavors[j].salesCount < flavors[j + 1].salesCount) {
                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
        System.out.println("Flavors sorted by popularity!");
    }

    void displayFlavors() {
        if (flavors == null) return;
        for (Flavor flavor : flavors) {
            if (flavor != null) {
                System.out.println(flavor.name + ": " + flavor.salesCount);
            }
        }
    }

    public static void main(String[] args) {
        Flavor[] flavors = new Flavor[3];
        flavors[0] = new Flavor("Vanilla", 100);
        flavors[1] = new Flavor("Chocolate", 150);
        flavors[2] = new Flavor("Strawberry", 0);

        IceCreamShop shop = new IceCreamShop(flavors);
        shop.sortFlavorsByPopularity();
        shop.displayFlavors();
    }
}