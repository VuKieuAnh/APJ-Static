package employee.fulltime;

public class FullTimeEmployee extends Employee {
    public static void main(String[] args) {
        FullTimeEmployee kieuanh = new FullTimeEmployee();
        kieuanh.setName("Vukieuanh");
        kieuanh.displayName = "anh.vu";
        kieuanh.getFullSaraly();
//        FullTimeEmployee.Address dc1 = kieuanh.new Address();
        FullTimeEmployee.Address dc2 = new FullTimeEmployee.Address();
        dc2.setDistrict("Hà Đông");
    }

     static class Address{
        private String province;
        private String district;

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }
    }
}
