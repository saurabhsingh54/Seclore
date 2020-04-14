package com.seclore.factory;

import com.seclore.pojo.Courier;
import com.seclore.pojo.Email;
import com.seclore.pojo.MessengerType;
import com.seclore.pojo.SMSMessage;
import com.seclore.pojo.VoiceMessage;

public class MessageFactory {
	public MessengerType createMassage(int choice) {
		if(choice == 1) 
			return new SMSMessage();
		if(choice == 2)
			return new Email();
		if(choice == 3)
			return new Courier();
		if(choice == 4)
			return new VoiceMessage();
		return null;
		
	}

}
