package clinic.resources;

import clinic.external.Patient;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AditionalInfo.class)
public abstract class AditionalInfo_ {

	public static volatile SingularAttribute<AditionalInfo, Patient> patient;
	public static volatile SingularAttribute<AditionalInfo, String> badHabit;
	public static volatile SingularAttribute<AditionalInfo, String> allergy;
	public static volatile SingularAttribute<AditionalInfo, Integer> id;
	public static volatile SingularAttribute<AditionalInfo, String> surgery;

}

