package org.neoteric.service;

import org.neoteric.Rapido.Insurance;
import org.neoteric.Rapido.User;

public class InsuranceService {
  public Insurance getInsurance(User user){
      Insurance insurance = new Insurance();
      insurance.insuranceid="45678";
      insurance.insurancetype="abc";
      return insurance;
  }


}
