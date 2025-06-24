abstract class Shape {
  double width;
  double height;

  Shape(this.width, this.height);

  double calculateArea(); 
}

class Rectangle extends Shape {
  Rectangle(double width, double height) : super(width, height);

  @override
  double calculateArea() {
    return width * height;
  }
}

void main() {
  Shape rect = Rectangle(10, 5);
  print("Area: ${rect.calculateArea()}"); 
}
