package Task1;

public class DoctorTherapist extends Doctor {
    String doctor;

    String doc = "Therapist";

    String resultdoctor(int treatmentplan) {

        if (treatmentplan == 1) {
            DoctorSurgeon doctorsurgeon = new DoctorSurgeon();
            doctor = doctorsurgeon.doc;
        } else if (treatmentplan == 2) {
            DoctorDentist doctordentist = new DoctorDentist();
            doctor = doctordentist.doc;
        } else {
            DoctorTherapist doctortherapist = new DoctorTherapist();
            doctor = doctortherapist.doc;
        }
        return doctor;
    }
}
