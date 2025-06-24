void main() {
  DateTime obj = DateTime.timestamp();
  obj.toLocal();
  print(obj);
  DateTime dt = DateTime.now();
  print(dt);
}
