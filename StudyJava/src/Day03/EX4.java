package Day03;

public class EX4 {
	
	public static void main(String[] args) {
		
	}
}

class MyTv2 {
	
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	private int returnChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		returnChannel = this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void gotoPrevChannel () {
		setChannel(returnChannel);
	}
	
}