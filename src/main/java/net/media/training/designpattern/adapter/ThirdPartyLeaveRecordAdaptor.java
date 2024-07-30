package net.media.training.designpattern.adapter;

import net.media.training.designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class ThirdPartyLeaveRecordAdaptor  implements LeaveRecord {

    ThirdPartyLeaveRecord thirdPartyLeaveRecord;
    @Override
    public String getMostAbsentEmployee(){
        return DecodeEmplopyeeName(thirdPartyLeaveRecord.getMostAbsentEmployee().getName());
    }

    private String EncodeEmplopyeeName(String employeeName){
        String[] parts = employeeName.split(" ");
        StringBuilder stringBuilder = new StringBuilder(parts[parts.length-1]);
        stringBuilder.append(",");
        for (int i=0;i<parts.length-1;i++){
            stringBuilder.append(" "+parts[i]);
        }
        return stringBuilder.toString();
    }
    private String DecodeEmplopyeeName(String employeeName){
        String []employeeNameParts = employeeName.split(", ");
        return employeeNameParts[1]+" "+employeeNameParts[0];

    }

    public int getEmployeeAbsences(String employeeName){
        return thirdPartyLeaveRecord.getEmployeeAbsences(new Employee(EncodeEmplopyeeName(employeeName)));
    }
    ThirdPartyLeaveRecordAdaptor(ThirdPartyLeaveRecord thirdPartyLeaveRecord){
        this.thirdPartyLeaveRecord = thirdPartyLeaveRecord;
    }
}
