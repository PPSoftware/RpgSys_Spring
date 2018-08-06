package io.github.ppsoftware.rpgSys.model;

public enum Alignment {

	//ALIGNMENT
	LAWFULL_GOOD(new Integer(0).byteValue()),
	NEUTRAL_GOOD(new Integer(1).byteValue()),
	CHAOTIC_GOOD(new Integer(2).byteValue()),
	LAWFULL_NEUTRAL(new Integer(3).byteValue()),
	TRUE_NEUTRAL(new Integer(5).byteValue()),
	CHAOTIC_NEUTRAL(new Integer(6).byteValue()),
	LAWFULL_EVILL(new Integer(7).byteValue()),
	NEUTRAL_EVIL(new Integer(8).byteValue()),
	CHAOTIC_EVIL(new Integer(9).byteValue());
	
	private Byte id;
	
	private Alignment(Byte id) {
		this.id = id;
	}
	
	public static Alignment getType(Byte id) {
		
		if (id == null) {
			return null;
		}
		
        for (Alignment status : Alignment.values()) {
            if (id.equals(status.getId())) {
                return status;
            }
        }
        
        throw new IllegalArgumentException("No matching type for id " + id);
    }
 
    public Byte getId() {
        return id;
    }
}
