package org.neoteric.service;

import org.neoteric.Rapido.*;
import org.neoteric.appenum.VehicleTypeEnum;

import java.util.Date;

public class MainTest {
    public static void main(String[] args) {
        User user=new User();
        user.name="maneesha";
        user.id="45678";
        user.email="abc@gmail.com";
        user.mobilenumber="345678";

        Location fromlocation=new Location();
        fromlocation.lat="bang";
        fromlocation.lon="bang";

        Insurance driverinsurance=new Insurance();
        driverinsurance.insuranceid="34567";
        driverinsurance.insurancetype="abc";

        Insurance vehicleinsurance=new Insurance();
        vehicleinsurance.insurancetype="bca";
        vehicleinsurance.insuranceid="5677";

        Driver driver=new Driver();
        driver.name="mani";
        driver.licence="zyx";
        driver.mobilenumber="98765";

        VehicleTypeEnum typeEnum=VehicleTypeEnum.Bike;
        Vehicle vehicle=new Vehicle();
        vehicle.vehicletype=typeEnum;
        vehicle.insurance=vehicleinsurance;
        vehicle.driver=driver;

        driver.vehicle=vehicle;
        driver.insurance=driverinsurance;

        Location tolocation=new Location();
        tolocation.lat="hyd";
        tolocation.lon="hyd";

        Task task=new Task();
        task.fromLocation=fromlocation;
        task.toLocation=tolocation;
        task.userid=user;

        JobTaskMapping jobTaskMapping=new JobTaskMapping();
        jobTaskMapping.startTime=new Date();
        jobTaskMapping.endTime=new Date();
        jobTaskMapping.vehicle=vehicle;
        jobTaskMapping.task=task;
        System.out.println(jobTaskMapping.vehicle.driver.insurance.insuranceid);
        System.out.println(jobTaskMapping.vehicle.insurance.insurancetype);
        System.out.println(jobTaskMapping.task.fromLocation);
        System.out.println(jobTaskMapping.task.toLocation);
        System.out.println(jobTaskMapping.vehicle.vehicletype);

    }
}
