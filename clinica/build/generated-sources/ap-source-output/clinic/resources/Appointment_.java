package clinic.resources;

import clinic.external.Patient;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Appointment.class)
public abstract class Appointment_ {

	public static volatile SingularAttribute<Appointment, Patient> patient;
	public static volatile SingularAttribute<Appointment, String> dateHour;
	public static volatile SingularAttribute<Appointment, String> dateDay;
	public static volatile SingularAttribute<Appointment, Integer> id;
	public static volatile SingularAttribute<Appointment, String> visit;

}

