package napier.ac.uk_ontology.elements.computerComponents;

import java.util.Objects;

import jade.content.onto.annotations.Slot;

public class HardDrive extends ComputerComponent {
	private String capacity;
	
	public HardDrive() {}
	
	public HardDrive(String capacity) {
    this.capacity = capacity;
  }
	
	@Slot(mandatory = true)
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
	  return "Hard Drive-" + this.capacity;
	}
	
	@Override
  public boolean equals(Object other) {
      if (!(other instanceof HardDrive)) {
          return false;
      }

      HardDrive that = (HardDrive) other;

      // Custom equality check here.
      return this.capacity.equals(that.capacity);
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(this.capacity);
  }
}
