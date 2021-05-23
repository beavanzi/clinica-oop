package clinic.resources;

import clinic.external.Patient;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PatientRecord.class)
public abstract class PatientRecord_ {

	public static volatile SingularAttribute<PatientRecord, String> treatment;
	public static volatile SingularAttribute<PatientRecord, String> symtoms;
	public static volatile SingularAttribute<PatientRecord, Patient> patient;
	public static volatile SingularAttribute<PatientRecord, Integer> id;
	public static volatile SingularAttribute<PatientRecord, String> diadnosis;

}

