package net.xdclass.online_xdclass.service;

import net.xdclass.online_xdclass.model.entity.Patient;
import net.xdclass.online_xdclass.model.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PatientService {

    List<Patient> listPatient();

    int deletePatientByPatientId(@Param("patient_id") Integer patientId);

    int addPatient(Map<String, String> patientInfo);

    int updatePatientOfUser(Map<String, String> patientInfo);

    int updatePatient(Map<String, String> patientInfo);

    List<User> listUser();
}
