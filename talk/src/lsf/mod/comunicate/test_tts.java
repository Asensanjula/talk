package lsf.mod.comunicate;

import java.io.*;
import com.sun.speech.freetts.*;


public class test_tts {

	public static void main(String[] args) {
		String VOCIENAME = "kevin16";
		Voice voice;
		VoiceManager vm = VoiceManager.getInstance();
		voice = vm.getVoice(VOCIENAME);
		
		voice.allocate();
		voice.speak("hi Tharindu madushanka");
	}
}
