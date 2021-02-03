package net.xdclass.online_xdclass.service.impl;

import net.xdclass.online_xdclass.mapper.PatientMapper;
import net.xdclass.online_xdclass.model.entity.Patient;
import net.xdclass.online_xdclass.model.entity.User;
import net.xdclass.online_xdclass.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientMapper patientMapper;

    @Override
    public List<Patient> listPatient() {
        return patientMapper.listPatient();
    }


    public int deletePatientByPatientId(Integer patientId) {
        System.out.println("patientId = [" + patientId + "]");
        int patient = patientMapper.deletePatientByPatientId(patientId);
        return patient;
    }

    @Override
    public int addPatient(Map<String, String> patientInfo){
        Patient patient = parseToPatient(patientInfo);
        if( patient != null){
            return patientMapper.addPatient(patient);
        }else {
            return -1;
        }
    }
    @Override
    public int updatePatientOfUser(Map<String, String> patientInfo){
        Patient patient = parseToPatient(patientInfo);
        System.out.println("patientInfo = [" + patientInfo + "]");
        if( patient != null){
            return patientMapper.updatePatientOfUser(patient);
        }else {
            return -1;
        }
    }

    @Override
    public int updatePatient(Map<String, String> patientInfo){
//        System.out.println(patientInfo);
        Patient patient = parseToUpdatePatient(patientInfo);
        if( patient != null){
            return patientMapper.updatePatient(patient);
        }else {
            return -1;
        }
    }

    private Patient parseToPatient(Map<String, String> patientInfo) {
        if (patientInfo.containsKey("id") && patientInfo.containsKey("sex") &&
                patientInfo.containsKey("age") && patientInfo.containsKey("source") &&
                patientInfo.containsKey("state") && patientInfo.containsKey("way") &&
                patientInfo.containsKey("hospital")){
            Patient patient = new Patient();
            patient.setId(Integer.valueOf(patientInfo.get("id")));
            patient.setSex(patientInfo.get("sex"));
            patient.setAge(Integer.valueOf(patientInfo.get("age")));
            patient.setSource(patientInfo.get("source"));
            patient.setState(patientInfo.get("state"));
            patient.setWay(patientInfo.get("way"));
            patient.setHospital(patientInfo.get("hospital"));
            System.out.println(patient);
            return patient;
        }else {
            return null;
        }
    }

    private Patient parseToUpdatePatient(Map<String, String> patientInfo) {
        if (patientInfo.containsKey("patient_id") && patientInfo.containsKey("sex") &&
                patientInfo.containsKey("age") && patientInfo.containsKey("source") &&
                patientInfo.containsKey("state")&& patientInfo.containsKey("way") &&
                patientInfo.containsKey("hospital")){
            Patient patient = new Patient();
            patient.setPatientId(Integer.valueOf(patientInfo.get("patient_id")));
            patient.setSex(patientInfo.get("sex"));
            patient.setAge(Integer.valueOf(patientInfo.get("age")));
            patient.setSource(patientInfo.get("source"));
            patient.setState(patientInfo.get("state"));
            patient.setWay(patientInfo.get("way"));
            patient.setHospital(patientInfo.get("hospital"));
            System.out.println(patient);
            return patient;
        }else {
            return null;
        }
    }

    @Override
    public List<User> listUser() {
        return patientMapper.listUser();
    }


}










