package net.xdclass.online_xdclass.controller;


import net.xdclass.online_xdclass.model.entity.Patient;
import net.xdclass.online_xdclass.model.entity.User;
import net.xdclass.online_xdclass.service.PatientService;
import net.xdclass.online_xdclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/pub/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    /**
     *  查询所有
     */
    @RequestMapping("list")
    public JsonData listPatient(){
        List<Patient> patientList = patientService.listPatient();
        return JsonData.buildSuccess(patientList);
    }


    /**
     * get-输出列表
     * @return
     */
    @RequestMapping("name_list")
    public JsonData listUser(){
        List<User> userList = patientService.listUser();
        return JsonData.buildSuccess(userList);
    }


    /**
     *删除
     * @param patientId
     * @return
     */
    @GetMapping("delete_patient_by_patient_id")
    public JsonData deletePatientByPatientId(Integer patientId){

        int patient = patientService.deletePatientByPatientId(patientId);

        return JsonData.buildSuccess(patient);

    }

    /**
     *添加病例
     * @param patientInfo
     * @return
     */
    @PostMapping("add_patient")
    public JsonData addPatient(@RequestBody Map<String,String> patientInfo){

        int rows = patientService.addPatient(patientInfo);
        int row2 = patientService.updatePatientOfUser(patientInfo);
        if(row2==1){
            rows = rows+row2-1;
        }
        return rows == 1 ? JsonData.buildSuccess(): JsonData.buildError("提交失败，请重试");
    }


    /**
     * 修改
     */
    @PostMapping("update_patient")
    public JsonData updatePatient(@RequestBody Map<String,String> patientInfo){

        int rows = patientService.updatePatient(patientInfo);

        return rows == 1 ? JsonData.buildSuccess(): JsonData.buildError("更新失败，请重试");

    }


}
