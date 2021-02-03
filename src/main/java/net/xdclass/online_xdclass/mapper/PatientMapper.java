package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.Patient;
import net.xdclass.online_xdclass.model.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PatientMapper {

    List<Patient> listPatient();

    Patient findPatientByPatientId(@Param("patient_id") Integer patientId);

    int deletePatientByPatientId(@Param("patient_id") Integer patientId);

    int addPatient(Patient patient);

    int updatePatientOfUser(Patient patient);

    int updatePatient(Patient patient);

    List<User> listUser();
}
