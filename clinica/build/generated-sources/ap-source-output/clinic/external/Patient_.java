package clinic.external;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Patient.class)
public abstract class Patient_ {

	public static volatile SingularAttribute<Patient, String> healthInsurance;
	public static volatile SingularAttribute<Patient, String> address;
	public static volatile SingularAttribute<Patient, String> docNumber;
	public static volatile SingularAttribute<Patient, String> phone;
	public static volatile SingularAttribute<Patient, String> name;
	public static volatile SingularAttribute<Patient, Integer> id;
	public static volatile SingularAttribute<Patient, String> birthDate;
	public static volatile SingularAttribute<Patient, String> email;

}

