package haletechbackend.entities;
import jakarta.persistence.*;


@Entity
@Table(name="doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long id;
    public String name;
    public String qualification;
    public String dob;
    public String specialization;
    public int phoneno;
    public String email;

    public Doctor() {

    }

    public Doctor(String name, String qualification, String dob, String specialization, int phoneno, String email) {
        this.name = name;
        this.qualification = qualification;
        this.dob = dob;
        this.specialization = specialization;
        this.phoneno = phoneno;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getQualification() {
        return qualification;
    }

    public String getDob() {
        return dob;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public String getEmail() {
        return email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qualification='" + qualification + '\'' +
                ", dob='" + dob + '\'' +
                ", specialization='" + specialization + '\'' +
                ", phoneno=" + phoneno +
                ", email='" + email + '\'' +
                '}';
    }
}
