abstract class Animal {
  void makeSound(); // Abstract method
}

class Dog extends Animal {
  @override
  void makeSound() {
    print("Woof!");
  }
}

class Cat extends Animal {
  @override
  void makeSound() {
    print("Meow!");
  }
}

void main() {
  Animal dog = Dog();
  Animal cat = Cat();

  dog.makeSound(); // Woof!
  cat.makeSound(); // Meow!
}
