package Task1;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();
        DoctorTherapist therapist = new DoctorTherapist();

        patient.treatmentplan = 4;
        therapist.resultdoctor(patient.treatmentplan);

        patient.doctor = therapist.doctor;

        System.out.println(patient.treatmentplan);
        System.out.println(patient.doctor);
        therapist.treat();
    }
}
