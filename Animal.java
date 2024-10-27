class Animal {
    String name;

    // 1. Default Constructor (Java will provide this if we don't define any constructor)

    // 2. No-Argument Constructor (User-Defined)
    Animal() {
        System.out.println("Animal created with no-argument constructor!");
    }

    // 3. Parameterized Constructor
    Animal(String animalName) {
        name = animalName;
        System.out.println("Animal created with name: " + name);
    }
}

