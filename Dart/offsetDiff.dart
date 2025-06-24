void main(){
    var dt = DateTime.now();
    print (dt);
    print(dt.timeZoneOffset.inHours);
    print(dt.timeZoneOffset.inMinutes);
    print(dt.timeZoneName);


final dateAus = DateTime.parse('2021-11-01 20:18:04Z').toLocal();
print(dateAus); // 2021-11-02 07:18:04.000
print(dateAus.timeZoneName); // AEDT ( Australian Eastern Daylight Time )
print(dateAus.timeZoneOffset.inHours); // 11
print(dateAus.timeZoneOffset.inMinutes); // 660

}