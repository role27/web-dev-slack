package com.kh._interface.step2;

public class Audio implements RemoteControl{

	@Override
	public void setVolume(int volume) {
	}

	@Override
	public void search(String url) {
	}

	@Override
	public void turnOn() {
	}

	@Override
	public void turnOff() {
	}
	

/*
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
	     
	     if(volume > Volume.MAX_VOLUME) {
	    	 this.setVolume = Volume.MAX_VOLUME;
	     }else if(volume < RemoteControl.MiN_VOLUME) {
	    	 this.setVolume = RemoteControl.MAX_VOLUME;
	     }else {
	    	 this.setVolume = volume;
	     }
	     
	     System.out.println("현재 Audio 볼륨 : " + this.volume);
	     }
	
	

	@Override
	public void search(String url) {
	}
*/
	
}
