public class Customer {
    public String name;
    private String phoneNumber;
    private int age;
    boolean memberShipStatus;

    Customer(String name, String PhoneNumber, int age, boolean memberShipStatus) {
        this.memberShipStatus = memberShipStatus;
        this.phoneNumber = PhoneNumber;
        this.name = name;
        this.age = age;
    }

    Customer(String name, String PhoneNumber, int age) {
        this.memberShipStatus = false;
        this.phoneNumber = PhoneNumber;
        this.name = name;
        this.age = age;
    }

    void applyForMembership() {
        this.memberShipStatus = true;
    }

    static int valueableCustomer(Customer[] arr) {
        int cnt = 0;
        for (Customer c : arr) {
            if (c.memberShipStatus == true) cnt++;
        }
        return cnt;
    }

    static int valueableCustomer(Customer c) {
        if (c.memberShipStatus == true) return 1;
        return 0;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
