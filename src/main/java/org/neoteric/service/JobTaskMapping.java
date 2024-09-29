package org.neoteric.service;

import org.neoteric.Rapido.Task;
import org.neoteric.Rapido.Vehicle;

import java.util.Date;

public class JobTaskMapping {
    public Task task;
    public Vehicle vehicle;
    public Date startTime;
    public Date endTime;

    @Override
    public String toString() {
        return "JobTaskMapping{" +
                "task=" + task +
                ", vehicle=" + vehicle +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
