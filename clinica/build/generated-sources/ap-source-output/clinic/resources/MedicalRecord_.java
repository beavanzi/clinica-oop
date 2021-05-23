package clinic.resources;

import clinic.external.Patient;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MedicalRecord.class)
public abstract class MedicalRecord_ {

	public static volatile SingularAttribute<MedicalRecord, String> followUp;
	public static volatile SingularAttribute<MedicalRecord, String> attestation;
	public static volatile SingularAttribute<MedicalRecord, String> prescription;
	public static volatile SingularAttribute<MedicalRecord, Patient> patient;
	public static volatile SingularAttribute<MedicalRecord, Integer> id;

}

