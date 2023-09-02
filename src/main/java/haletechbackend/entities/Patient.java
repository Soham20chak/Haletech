package haletechbackend.entities;

public class Patient {
    public String name;
    public String desc;
    public String phoneno;
    public String age;



    public String gender;
    public String appointment_date;
    public String doctor;

    public Patient() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(String appointment_date) {
        this.appointment_date = appointment_date;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", phoneno='" + phoneno + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", appointment_date='" + appointment_date + '\'' +
                ", doctor='" + doctor + '\'' +
                '}';
    }
}
