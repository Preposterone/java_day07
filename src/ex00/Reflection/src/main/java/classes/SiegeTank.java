package classes;

public class SiegeTank {
	private String name;
	private Integer kills = 0;
	private Double hullStatus = 100.0;

	public SiegeTank(String name) {
		this.name = name;
	}

	public SiegeTank() {
	}

	public void doRepairs() {
		if (hullStatus.compareTo(100.0) != 0) {
			hullStatus = 100.0;
		}
		System.out.println("Repairs done!");
	}

	public void kill(int i) {
		this.kills += i;
	}

	@Override
	public String toString() {
		return "SiegeTank{" +
				"name='" + name + '\'' +
				", kills=" + kills +
				", hullStatus=" + hullStatus +
				'}';
	}
}
