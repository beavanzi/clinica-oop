package clinic.resources;

import clinic.external.Patient;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Record.class)
public abstract class Record_ {

	public static volatile SingularAttribute<Record, Date> date;
	public static volatile SingularAttribute<Record, Patient> patient;
	public static volatile SingularAttribute<Record, Integer> id;

}

