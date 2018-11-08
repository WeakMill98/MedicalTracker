package ca.ualberta.t04.medicaltracker.Controller;

import java.util.Date;

import ca.ualberta.t04.medicaltracker.Doctor;
import ca.ualberta.t04.medicaltracker.Patient;
import ca.ualberta.t04.medicaltracker.Problem;
import ca.ualberta.t04.medicaltracker.User;

public class DataController
{
    private static User user;
    private static Problem currentProblem;

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        DataController.user = user;
    }

    public static void updateProfile(Date birthday, Boolean isMale, String phoneNumber, String email, String address){
        getUser().setBirthday(birthday);
        getUser().setMale(isMale);
        getUser().setPhoneNumber(phoneNumber);
        getUser().setEmail(email);
        getUser().setAddress(address);
        getUser().notifyAllListeners();
    }

    public static Patient getPatient(){
        return (Patient) user;
    }

    public static Doctor getDoctor(){
        return (Doctor) user;
    }

    public static void setCurrentProblem(Problem problem){
        currentProblem = problem;
    }

    public static Problem getCurrentProblem(){
        return currentProblem;
    }
}