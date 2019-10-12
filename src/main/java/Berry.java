public class Berry {

	String nameOfBerry;
	int sizeOfBerry;
	int growthTimeOfBerry;

	public Berry(String nameOfBerry, int sizeOfBerry, int growthTimeOfBerry) {
		super();
		this.nameOfBerry = nameOfBerry;
		this.sizeOfBerry = sizeOfBerry;
		this.growthTimeOfBerry = growthTimeOfBerry;
	}

	public String getNameOfBerry() {
		return nameOfBerry;
	}

	public int getSizeOfBerry() {
		return sizeOfBerry;
	}

	public int getGrowthTimeOfBerry() {
		return growthTimeOfBerry;
	}

	
	@Override
	public String toString() {
		return "Berry " + nameOfBerry +" (size: " + sizeOfBerry + ", growth time: "
				+ growthTimeOfBerry + " hours).";
	}

}
