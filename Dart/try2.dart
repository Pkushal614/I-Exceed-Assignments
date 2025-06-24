void main() {
  DateTime dt = DateTime.now();
  print(dt);
  DateTime dt2 = dt.toUtc();
  print(dt);
  print(dt2);
  DateTime dt3 = dt2.toLocal();
  print(dt3);
  print(dt.timeZoneName);
  print(dt2.timeZoneName);
  print(dt3.timeZoneName);
  print(dt2.timeZoneOffset);
  dt = DateTime.now().toUtc();
  print(dt);
}
