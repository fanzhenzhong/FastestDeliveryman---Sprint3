/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint_3;

//Author: Ng Li Poh

public class DeliveryManInfo {
      private String regNo,deliveryManName,ic, phoneNo,email,address,deliveryStatus,workingStatus;

    public DeliveryManInfo() {
    }

    public DeliveryManInfo(String regNo, String deliveryManName, String ic, String phoneNo, String email, String address, String deliveryStatus, String workingStatus) {
        this.regNo = regNo;
        this.deliveryManName = deliveryManName;
        this.ic = ic;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
        this.deliveryStatus = deliveryStatus;
        this.workingStatus = workingStatus;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getDeliveryManName() {
        return deliveryManName;
    }

    public String getIc() {
        return ic;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public String getWorkingStatus() {
        return workingStatus;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public void setWorkingStatus(String workingStatus) {
        this.workingStatus = workingStatus;
    }

    @Override
    public String toString() {
        return "DeliveryManInfo{" + "regNo=" + regNo + ", deliveryManName=" + deliveryManName + ", ic=" + ic + ", phoneNo=" + phoneNo + ", email=" + email + ", address=" + address + ", deliveryStatus=" + deliveryStatus + ", workingStatus=" + workingStatus + '}';
    }
   
}
