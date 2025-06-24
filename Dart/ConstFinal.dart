class Address {
  final String? street;
  final String? city;

  // Regular constructor
  Address(this.street, [this.city]) {
    print(street);
    print(city);
  }
}

void main() {
  final address1 = Address("123 Main St", "New York");
  final address2 = Address(null, null);

  print(identical(address1, address2)); // Output: false
}
