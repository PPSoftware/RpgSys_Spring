package io.github.ppsoftware.rpgSys.model;

public enum Status {

	//Enrollment
	NEW(new Integer(0).byteValue()),
	REQUESTED(new Integer(1).byteValue()),
	GENERATED(new Integer(2).byteValue()),
	CONFIRMED(new Integer(3).byteValue()),
	RELEASED(new Integer(5).byteValue()),
	BLOCKED(new Integer(6).byteValue()),
	AUTOMATIC_BLOCKED(new Integer(7).byteValue()),
	SUCCESS(new Integer(8).byteValue()),
	ERROR(new Integer(9).byteValue()),
	ACTIVE(new Integer(9).byteValue()),
	INACTIVE(new Integer(9).byteValue());
	
	private Byte id;
	
	private Status(Byte id) {
		this.id = id;
	}
	
	public static Status getType(Byte id) {
		
		if (id == null) {
			return null;
		}
		
        for (Status status : Status.values()) {
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
