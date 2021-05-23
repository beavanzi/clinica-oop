package clinic.resources;

import clinic.external.Patient;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Attendance.class)
public abstract class Attendance_ {

	public static volatile SingularAttribute<Attendance, Patient> patient;
	public static volatile SingularAttribute<Attendance, Integer> dateDay;
	public static volatile SingularAttribute<Attendance, Integer> dateMonth;
	public static volatile SingularAttribute<Attendance, Integer> id;

}

