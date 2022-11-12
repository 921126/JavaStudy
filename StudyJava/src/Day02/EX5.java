package Day02;

public class EX5 {
	
	public static void main(String[] args) {
		
		TV tv = new TV();
		
		tv.channel = 100;
		tv.volume = 0;
		System.out.println("ch:" + tv.channel + ", vol:" + tv.volume);
		
		tv.channelDown();
		tv.VolumeDown();
		System.out.println("ch:" + tv.channel + ", vol:" + tv.volume);

		tv.volume = 100;
		tv.channelUp();
		tv.VolumeUp();
		System.out.println("ch:" + tv.channel + ", vol:" + tv.volume);
		
	}
}

class TV{
	
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL =100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOFF() {
		
		if(isPowerOn == false) {
			this.isPowerOn = true;
		}else {
			this.isPowerOn = false;
		}
	}
	
	void VolumeUp() {
		
		if(volume < MAX_VOLUME) {
			volume ++;
		}
	}
	
	void VolumeDown() {
		if(volume > MIN_VOLUME) {
			volume--;
		}
	}
	
	void channelUp() {
		
		if(channel == MAX_CHANNEL) {
			channel = 1;
		}else {
			channel++;
		}
	}
	
	void channelDown() {
		if(channel == MIN_CHANNEL) {
			channel = 100;
		}else {
			channel--;
		}
	}
}
