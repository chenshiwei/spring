package csw.java.spring.jdbc;

public class Time {

	
	private Long time;

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Time [time=" + time + "]";
	}

}
