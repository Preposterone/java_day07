package classes;

public class Marine {
	private String name;
	private Integer veterancy = 0;
	private Integer kills;
	private Double salary;

	public Marine(String name, Integer kills, Double salary) {
		this.name = name;
		this.kills = kills;
		this.salary = salary;
		while (kills != 0) {
			this.veterancy++;
			kills /= 5;
		}
	}

	public Marine() {
	}

	public String getThoughts(int i) {
		return "Gimme something to shoot";
	}

	private boolean isVeteran() {
		return (veterancy != 0);
	}

	public void promote() throws RuntimeException {
		if (!isVeteran()) {
			throw new RuntimeException("Cannot be promoted!");
		} else {
			this.salary += 100.0;
		}
	}

	@Override
	public String toString() {
		return "Marine{" +
				"name='" + name + '\'' +
				", veterancy=" + veterancy +
				", kills=" + kills +
				", salary=" + salary +
				'}';
	}
}
