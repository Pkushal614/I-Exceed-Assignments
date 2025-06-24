class Machine {
  void start() => print("Machine started");
}

mixin ElectricPowered on Machine {
  void chargeBattery() {
    print("Charging battery...");
  }
}

class Robo{
    void start()=> print('Stared Robo');
}

mixin Home on Robo{
    void fun(){
        print('Functions in Home');
    }
}
class Bot extends Robo with Home{}

class ElectricCar extends Machine with ElectricPowered{}

void main() {
  ElectricCar car = ElectricCar();
  Bot robo = Bot();
  car.start();         
  car.chargeBattery(); 
  robo.fun();
}
Home();