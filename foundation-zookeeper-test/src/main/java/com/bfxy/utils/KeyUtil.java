package com.bfxy.utils;

import com.fasterxml.uuid.EthernetAddress;
import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedGenerator;

public class KeyUtil {

	public static String generatorUUID(){
		TimeBasedGenerator timeBasedGenerator = Generators.timeBasedGenerator(EthernetAddress.fromInterface());
		return timeBasedGenerator.generate().toString();
	}
	
	public static void main(String[] args) {
		
		// insert into table ()
		System.err.println(KeyUtil.generatorUUID());
		// insert into table ()
		System.err.println(KeyUtil.generatorUUID());
	}
}
