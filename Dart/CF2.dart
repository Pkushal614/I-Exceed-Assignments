import 'dart: io';
void main(){
    const name = 'kushal';
    print('enter n : ');
    final n? = stdin.readLineSync();
    print(name.runtimeType);
    print(n.runtimeType);
}