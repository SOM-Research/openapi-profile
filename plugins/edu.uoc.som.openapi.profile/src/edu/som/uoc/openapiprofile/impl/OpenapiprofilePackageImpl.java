/**
 */
package edu.som.uoc.openapiprofile.impl;

import edu.som.uoc.openapiprofile.APIDataType;
import edu.som.uoc.openapiprofile.APIInfo;
import edu.som.uoc.openapiprofile.APIKeyLocation;
import edu.som.uoc.openapiprofile.APIOperation;
import edu.som.uoc.openapiprofile.APIParameter;
import edu.som.uoc.openapiprofile.APIProperty;
import edu.som.uoc.openapiprofile.APIResponse;
import edu.som.uoc.openapiprofile.CollectionFormat;
import edu.som.uoc.openapiprofile.Example;
import edu.som.uoc.openapiprofile.ExternalDocs;
import edu.som.uoc.openapiprofile.HTTPMethod;
import edu.som.uoc.openapiprofile.Header;
import edu.som.uoc.openapiprofile.JSONDataType;
import edu.som.uoc.openapiprofile.JSONSchemaConstraints;
import edu.som.uoc.openapiprofile.OAuth2FlowType;
import edu.som.uoc.openapiprofile.OpenapiprofileFactory;
import edu.som.uoc.openapiprofile.OpenapiprofilePackage;
import edu.som.uoc.openapiprofile.ParameterLocation;
import edu.som.uoc.openapiprofile.Schema;
import edu.som.uoc.openapiprofile.SchemeType;
import edu.som.uoc.openapiprofile.SecurityDefinitions;
import edu.som.uoc.openapiprofile.SecurityRequirement;
import edu.som.uoc.openapiprofile.SecurityRequirements;
import edu.som.uoc.openapiprofile.SecurityScheme;
import edu.som.uoc.openapiprofile.SecuritySchemeType;
import edu.som.uoc.openapiprofile.SecurityScope;
import edu.som.uoc.openapiprofile.Tag;
import edu.som.uoc.openapiprofile.Tags;
import edu.som.uoc.openapiprofile.XMLFormat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenapiprofilePackageImpl extends EPackageImpl implements OpenapiprofilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonSchemaConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalDocsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securitySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schemeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jsonDataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum collectionFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securitySchemeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum apiKeyLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oAuth2FlowTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenapiprofilePackageImpl() {
		super(eNS_URI, OpenapiprofileFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OpenapiprofilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenapiprofilePackage init() {
		if (isInited) return (OpenapiprofilePackage)EPackage.Registry.INSTANCE.getEPackage(OpenapiprofilePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOpenapiprofilePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OpenapiprofilePackageImpl theOpenapiprofilePackage = registeredOpenapiprofilePackage instanceof OpenapiprofilePackageImpl ? (OpenapiprofilePackageImpl)registeredOpenapiprofilePackage : new OpenapiprofilePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOpenapiprofilePackage.createPackageContents();

		// Initialize created meta-data
		theOpenapiprofilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenapiprofilePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenapiprofilePackage.eNS_URI, theOpenapiprofilePackage);
		return theOpenapiprofilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPI() {
		return apiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPI_Host() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPI_BasePath() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPI_Schemes() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPI_Consumes() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPI_Produces() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPI_Base_Model() {
		return (EReference)apiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_Title() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_MaxProperties() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_MinProperties() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_Discriminator() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_AdditionalPropertiesAllowed() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Base_Class() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPIProperty() {
		return apiPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIProperty_Title() {
		return (EAttribute)apiPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIProperty_Description() {
		return (EAttribute)apiPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIProperty_Xml() {
		return (EReference)apiPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIProperty_Base_Property() {
		return (EReference)apiPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIProperty_Constraints() {
		return (EReference)apiPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLFormat() {
		return xmlFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLFormat_Name() {
		return (EAttribute)xmlFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLFormat_Namespace() {
		return (EAttribute)xmlFormatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLFormat_Prefix() {
		return (EAttribute)xmlFormatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLFormat_Attribute() {
		return (EAttribute)xmlFormatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLFormat_Wrapped() {
		return (EAttribute)xmlFormatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSONSchemaConstraints() {
		return jsonSchemaConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSONSchemaConstraints_ExclusiveMaximum() {
		return (EAttribute)jsonSchemaConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSONSchemaConstraints_MinLength() {
		return (EAttribute)jsonSchemaConstraintsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSONSchemaConstraints_MaxLength() {
		return (EAttribute)jsonSchemaConstraintsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSONSchemaConstraints_Pattern() {
		return (EAttribute)jsonSchemaConstraintsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSONSchemaConstraints_MinItems() {
		return (EAttribute)jsonSchemaConstraintsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSONSchemaConstraints_ExclusiveMinimum() {
		return (EAttribute)jsonSchemaConstraintsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSONSchemaConstraints_MaxItems() {
		return (EAttribute)jsonSchemaConstraintsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSONSchemaConstraints_Maximum() {
		return (EAttribute)jsonSchemaConstraintsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSONSchemaConstraints_Minimum() {
		return (EAttribute)jsonSchemaConstraintsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPIDataType() {
		return apiDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIDataType_Type() {
		return (EAttribute)apiDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIDataType_Format() {
		return (EAttribute)apiDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIDataType_Base_PrimitiveType() {
		return (EReference)apiDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIDataType_Base_Enumeration() {
		return (EReference)apiDataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPIOperation() {
		return apiOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIOperation_RelativePath() {
		return (EAttribute)apiOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIOperation_Method() {
		return (EAttribute)apiOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIOperation_Produces() {
		return (EAttribute)apiOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIOperation_Consumes() {
		return (EAttribute)apiOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIOperation_Schemes() {
		return (EAttribute)apiOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIOperation_Summary() {
		return (EAttribute)apiOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIOperation_Description() {
		return (EAttribute)apiOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIOperation_Base_Operation() {
		return (EReference)apiOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIOperation_Tags() {
		return (EAttribute)apiOperationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPIParameter() {
		return apiParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIParameter_Description() {
		return (EAttribute)apiParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIParameter_Location() {
		return (EAttribute)apiParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIParameter_AllowEmptyValues() {
		return (EAttribute)apiParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIParameter_CollectionFormat() {
		return (EAttribute)apiParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIParameter_Base_Parameter() {
		return (EReference)apiParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIParameter_Constraints() {
		return (EReference)apiParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPIResponse() {
		return apiResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIResponse_Description() {
		return (EAttribute)apiResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIResponse_Code() {
		return (EAttribute)apiResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIResponse_Headers() {
		return (EReference)apiResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIResponse_Examples() {
		return (EReference)apiResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIResponse_Base_Parameter() {
		return (EReference)apiResponseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeader() {
		return headerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_Name() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_Description() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_Type() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_Format() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_Array() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_CollectionFormat() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeader_Constraints() {
		return (EReference)headerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExample() {
		return exampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExample_MimeType() {
		return (EAttribute)exampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExample_Value() {
		return (EAttribute)exampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPIInfo() {
		return apiInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIInfo_Title() {
		return (EAttribute)apiInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIInfo_Description() {
		return (EAttribute)apiInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIInfo_TermsOfService() {
		return (EAttribute)apiInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIInfo_Version() {
		return (EAttribute)apiInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIInfo_LicenseName() {
		return (EAttribute)apiInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIInfo_LicenseURL() {
		return (EAttribute)apiInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIInfo_ContactName() {
		return (EAttribute)apiInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIInfo_ContactURL() {
		return (EAttribute)apiInfoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIInfo_ContactEmail() {
		return (EAttribute)apiInfoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIInfo_Base_Model() {
		return (EReference)apiInfoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalDocs() {
		return externalDocsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDocs_Description() {
		return (EAttribute)externalDocsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDocs_Url() {
		return (EAttribute)externalDocsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalDocs_Base_Model() {
		return (EReference)externalDocsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalDocs_Base_Class() {
		return (EReference)externalDocsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalDocs_Base_Operation() {
		return (EReference)externalDocsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityScheme() {
		return securitySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScheme_Name() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScheme_Type() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScheme_Description() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScheme_Location() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScheme_Flow() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScheme_AuthorizationURL() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScheme_TokenURL() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityScheme_Scopes() {
		return (EReference)securitySchemeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityScope() {
		return securityScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScope_Name() {
		return (EAttribute)securityScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScope_Description() {
		return (EAttribute)securityScopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRequirement() {
		return securityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRequirement_Name() {
		return (EAttribute)securityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRequirement_Scope() {
		return (EAttribute)securityRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityDefinitions() {
		return securityDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityDefinitions_SecuritySchemes() {
		return (EReference)securityDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityDefinitions_Base_Model() {
		return (EReference)securityDefinitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRequirements() {
		return securityRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRequirements_SecurityRequirements() {
		return (EReference)securityRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRequirements_Base_Model() {
		return (EReference)securityRequirementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRequirements_Base_Operation() {
		return (EReference)securityRequirementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTags() {
		return tagsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTags_Tags() {
		return (EReference)tagsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTags_Base_Model() {
		return (EReference)tagsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_ExternalDocsURL() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_ExternalDocsDescription() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Name() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Description() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchemeType() {
		return schemeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJSONDataType() {
		return jsonDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHTTPMethod() {
		return httpMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterLocation() {
		return parameterLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCollectionFormat() {
		return collectionFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecuritySchemeType() {
		return securitySchemeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAPIKeyLocation() {
		return apiKeyLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOAuth2FlowType() {
		return oAuth2FlowTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenapiprofileFactory getOpenapiprofileFactory() {
		return (OpenapiprofileFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		apiEClass = createEClass(API);
		createEAttribute(apiEClass, API__HOST);
		createEAttribute(apiEClass, API__BASE_PATH);
		createEAttribute(apiEClass, API__SCHEMES);
		createEAttribute(apiEClass, API__CONSUMES);
		createEAttribute(apiEClass, API__PRODUCES);
		createEReference(apiEClass, API__BASE_MODEL);

		schemaEClass = createEClass(SCHEMA);
		createEAttribute(schemaEClass, SCHEMA__TITLE);
		createEAttribute(schemaEClass, SCHEMA__MAX_PROPERTIES);
		createEAttribute(schemaEClass, SCHEMA__MIN_PROPERTIES);
		createEAttribute(schemaEClass, SCHEMA__DISCRIMINATOR);
		createEAttribute(schemaEClass, SCHEMA__ADDITIONAL_PROPERTIES_ALLOWED);
		createEReference(schemaEClass, SCHEMA__BASE_CLASS);

		apiPropertyEClass = createEClass(API_PROPERTY);
		createEAttribute(apiPropertyEClass, API_PROPERTY__TITLE);
		createEAttribute(apiPropertyEClass, API_PROPERTY__DESCRIPTION);
		createEReference(apiPropertyEClass, API_PROPERTY__XML);
		createEReference(apiPropertyEClass, API_PROPERTY__BASE_PROPERTY);
		createEReference(apiPropertyEClass, API_PROPERTY__CONSTRAINTS);

		xmlFormatEClass = createEClass(XML_FORMAT);
		createEAttribute(xmlFormatEClass, XML_FORMAT__NAME);
		createEAttribute(xmlFormatEClass, XML_FORMAT__NAMESPACE);
		createEAttribute(xmlFormatEClass, XML_FORMAT__PREFIX);
		createEAttribute(xmlFormatEClass, XML_FORMAT__ATTRIBUTE);
		createEAttribute(xmlFormatEClass, XML_FORMAT__WRAPPED);

		jsonSchemaConstraintsEClass = createEClass(JSON_SCHEMA_CONSTRAINTS);
		createEAttribute(jsonSchemaConstraintsEClass, JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MAXIMUM);
		createEAttribute(jsonSchemaConstraintsEClass, JSON_SCHEMA_CONSTRAINTS__MIN_LENGTH);
		createEAttribute(jsonSchemaConstraintsEClass, JSON_SCHEMA_CONSTRAINTS__MAX_LENGTH);
		createEAttribute(jsonSchemaConstraintsEClass, JSON_SCHEMA_CONSTRAINTS__PATTERN);
		createEAttribute(jsonSchemaConstraintsEClass, JSON_SCHEMA_CONSTRAINTS__MIN_ITEMS);
		createEAttribute(jsonSchemaConstraintsEClass, JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MINIMUM);
		createEAttribute(jsonSchemaConstraintsEClass, JSON_SCHEMA_CONSTRAINTS__MAX_ITEMS);
		createEAttribute(jsonSchemaConstraintsEClass, JSON_SCHEMA_CONSTRAINTS__MAXIMUM);
		createEAttribute(jsonSchemaConstraintsEClass, JSON_SCHEMA_CONSTRAINTS__MINIMUM);

		apiDataTypeEClass = createEClass(API_DATA_TYPE);
		createEAttribute(apiDataTypeEClass, API_DATA_TYPE__TYPE);
		createEAttribute(apiDataTypeEClass, API_DATA_TYPE__FORMAT);
		createEReference(apiDataTypeEClass, API_DATA_TYPE__BASE_PRIMITIVE_TYPE);
		createEReference(apiDataTypeEClass, API_DATA_TYPE__BASE_ENUMERATION);

		apiOperationEClass = createEClass(API_OPERATION);
		createEAttribute(apiOperationEClass, API_OPERATION__RELATIVE_PATH);
		createEAttribute(apiOperationEClass, API_OPERATION__METHOD);
		createEAttribute(apiOperationEClass, API_OPERATION__PRODUCES);
		createEAttribute(apiOperationEClass, API_OPERATION__CONSUMES);
		createEAttribute(apiOperationEClass, API_OPERATION__SCHEMES);
		createEAttribute(apiOperationEClass, API_OPERATION__SUMMARY);
		createEAttribute(apiOperationEClass, API_OPERATION__DESCRIPTION);
		createEReference(apiOperationEClass, API_OPERATION__BASE_OPERATION);
		createEAttribute(apiOperationEClass, API_OPERATION__TAGS);

		apiParameterEClass = createEClass(API_PARAMETER);
		createEAttribute(apiParameterEClass, API_PARAMETER__DESCRIPTION);
		createEAttribute(apiParameterEClass, API_PARAMETER__LOCATION);
		createEAttribute(apiParameterEClass, API_PARAMETER__ALLOW_EMPTY_VALUES);
		createEAttribute(apiParameterEClass, API_PARAMETER__COLLECTION_FORMAT);
		createEReference(apiParameterEClass, API_PARAMETER__BASE_PARAMETER);
		createEReference(apiParameterEClass, API_PARAMETER__CONSTRAINTS);

		apiResponseEClass = createEClass(API_RESPONSE);
		createEAttribute(apiResponseEClass, API_RESPONSE__DESCRIPTION);
		createEAttribute(apiResponseEClass, API_RESPONSE__CODE);
		createEReference(apiResponseEClass, API_RESPONSE__HEADERS);
		createEReference(apiResponseEClass, API_RESPONSE__EXAMPLES);
		createEReference(apiResponseEClass, API_RESPONSE__BASE_PARAMETER);

		headerEClass = createEClass(HEADER);
		createEAttribute(headerEClass, HEADER__NAME);
		createEAttribute(headerEClass, HEADER__DESCRIPTION);
		createEAttribute(headerEClass, HEADER__TYPE);
		createEAttribute(headerEClass, HEADER__FORMAT);
		createEAttribute(headerEClass, HEADER__ARRAY);
		createEAttribute(headerEClass, HEADER__COLLECTION_FORMAT);
		createEReference(headerEClass, HEADER__CONSTRAINTS);

		exampleEClass = createEClass(EXAMPLE);
		createEAttribute(exampleEClass, EXAMPLE__MIME_TYPE);
		createEAttribute(exampleEClass, EXAMPLE__VALUE);

		apiInfoEClass = createEClass(API_INFO);
		createEAttribute(apiInfoEClass, API_INFO__TITLE);
		createEAttribute(apiInfoEClass, API_INFO__DESCRIPTION);
		createEAttribute(apiInfoEClass, API_INFO__TERMS_OF_SERVICE);
		createEAttribute(apiInfoEClass, API_INFO__VERSION);
		createEAttribute(apiInfoEClass, API_INFO__LICENSE_NAME);
		createEAttribute(apiInfoEClass, API_INFO__LICENSE_URL);
		createEAttribute(apiInfoEClass, API_INFO__CONTACT_NAME);
		createEAttribute(apiInfoEClass, API_INFO__CONTACT_URL);
		createEAttribute(apiInfoEClass, API_INFO__CONTACT_EMAIL);
		createEReference(apiInfoEClass, API_INFO__BASE_MODEL);

		externalDocsEClass = createEClass(EXTERNAL_DOCS);
		createEAttribute(externalDocsEClass, EXTERNAL_DOCS__DESCRIPTION);
		createEAttribute(externalDocsEClass, EXTERNAL_DOCS__URL);
		createEReference(externalDocsEClass, EXTERNAL_DOCS__BASE_MODEL);
		createEReference(externalDocsEClass, EXTERNAL_DOCS__BASE_CLASS);
		createEReference(externalDocsEClass, EXTERNAL_DOCS__BASE_OPERATION);

		securitySchemeEClass = createEClass(SECURITY_SCHEME);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__NAME);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__TYPE);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__DESCRIPTION);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__LOCATION);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__FLOW);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__AUTHORIZATION_URL);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__TOKEN_URL);
		createEReference(securitySchemeEClass, SECURITY_SCHEME__SCOPES);

		securityScopeEClass = createEClass(SECURITY_SCOPE);
		createEAttribute(securityScopeEClass, SECURITY_SCOPE__NAME);
		createEAttribute(securityScopeEClass, SECURITY_SCOPE__DESCRIPTION);

		securityRequirementEClass = createEClass(SECURITY_REQUIREMENT);
		createEAttribute(securityRequirementEClass, SECURITY_REQUIREMENT__NAME);
		createEAttribute(securityRequirementEClass, SECURITY_REQUIREMENT__SCOPE);

		securityDefinitionsEClass = createEClass(SECURITY_DEFINITIONS);
		createEReference(securityDefinitionsEClass, SECURITY_DEFINITIONS__SECURITY_SCHEMES);
		createEReference(securityDefinitionsEClass, SECURITY_DEFINITIONS__BASE_MODEL);

		securityRequirementsEClass = createEClass(SECURITY_REQUIREMENTS);
		createEReference(securityRequirementsEClass, SECURITY_REQUIREMENTS__SECURITY_REQUIREMENTS);
		createEReference(securityRequirementsEClass, SECURITY_REQUIREMENTS__BASE_MODEL);
		createEReference(securityRequirementsEClass, SECURITY_REQUIREMENTS__BASE_OPERATION);

		tagsEClass = createEClass(TAGS);
		createEReference(tagsEClass, TAGS__TAGS);
		createEReference(tagsEClass, TAGS__BASE_MODEL);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__EXTERNAL_DOCS_URL);
		createEAttribute(tagEClass, TAG__EXTERNAL_DOCS_DESCRIPTION);
		createEAttribute(tagEClass, TAG__NAME);
		createEAttribute(tagEClass, TAG__DESCRIPTION);

		// Create enums
		schemeTypeEEnum = createEEnum(SCHEME_TYPE);
		jsonDataTypeEEnum = createEEnum(JSON_DATA_TYPE);
		httpMethodEEnum = createEEnum(HTTP_METHOD);
		parameterLocationEEnum = createEEnum(PARAMETER_LOCATION);
		collectionFormatEEnum = createEEnum(COLLECTION_FORMAT);
		securitySchemeTypeEEnum = createEEnum(SECURITY_SCHEME_TYPE);
		apiKeyLocationEEnum = createEEnum(API_KEY_LOCATION);
		oAuth2FlowTypeEEnum = createEEnum(OAUTH2_FLOW_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(apiEClass, edu.som.uoc.openapiprofile.API.class, "API", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPI_Host(), theTypesPackage.getString(), "host", null, 1, 1, edu.som.uoc.openapiprofile.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPI_BasePath(), theTypesPackage.getString(), "basePath", null, 1, 1, edu.som.uoc.openapiprofile.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPI_Schemes(), this.getSchemeType(), "schemes", null, 0, -1, edu.som.uoc.openapiprofile.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPI_Consumes(), theTypesPackage.getString(), "consumes", null, 0, -1, edu.som.uoc.openapiprofile.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPI_Produces(), theTypesPackage.getString(), "produces", null, 0, -1, edu.som.uoc.openapiprofile.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAPI_Base_Model(), theUMLPackage.getModel(), null, "base_Model", null, 0, 1, edu.som.uoc.openapiprofile.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchema_Title(), theTypesPackage.getString(), "title", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSchema_MaxProperties(), theTypesPackage.getInteger(), "maxProperties", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSchema_MinProperties(), theTypesPackage.getInteger(), "minProperties", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSchema_Discriminator(), theTypesPackage.getString(), "discriminator", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSchema_AdditionalPropertiesAllowed(), theTypesPackage.getBoolean(), "additionalPropertiesAllowed", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSchema_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(apiPropertyEClass, APIProperty.class, "APIProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPIProperty_Title(), theTypesPackage.getString(), "title", null, 0, 1, APIProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIProperty_Description(), theTypesPackage.getString(), "description", null, 0, 1, APIProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAPIProperty_Xml(), this.getXMLFormat(), null, "xml", null, 1, 1, APIProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAPIProperty_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, APIProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAPIProperty_Constraints(), this.getJSONSchemaConstraints(), null, "constraints", null, 0, 1, APIProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(xmlFormatEClass, XMLFormat.class, "XMLFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLFormat_Name(), theTypesPackage.getString(), "name", null, 0, 1, XMLFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getXMLFormat_Namespace(), theTypesPackage.getString(), "namespace", null, 0, 1, XMLFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getXMLFormat_Prefix(), theTypesPackage.getString(), "prefix", null, 0, 1, XMLFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getXMLFormat_Attribute(), theTypesPackage.getBoolean(), "attribute", null, 0, 1, XMLFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getXMLFormat_Wrapped(), theTypesPackage.getBoolean(), "wrapped", null, 0, 1, XMLFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(jsonSchemaConstraintsEClass, JSONSchemaConstraints.class, "JSONSchemaConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJSONSchemaConstraints_ExclusiveMaximum(), theTypesPackage.getBoolean(), "exclusiveMaximum", null, 0, 1, JSONSchemaConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJSONSchemaConstraints_MinLength(), theTypesPackage.getInteger(), "minLength", null, 0, 1, JSONSchemaConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJSONSchemaConstraints_MaxLength(), theTypesPackage.getInteger(), "maxLength", null, 0, 1, JSONSchemaConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJSONSchemaConstraints_Pattern(), theTypesPackage.getString(), "pattern", null, 0, 1, JSONSchemaConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJSONSchemaConstraints_MinItems(), theTypesPackage.getInteger(), "minItems", null, 0, 1, JSONSchemaConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJSONSchemaConstraints_ExclusiveMinimum(), theTypesPackage.getBoolean(), "exclusiveMinimum", null, 0, 1, JSONSchemaConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJSONSchemaConstraints_MaxItems(), theTypesPackage.getInteger(), "maxItems", null, 0, 1, JSONSchemaConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJSONSchemaConstraints_Maximum(), theTypesPackage.getReal(), "maximum", null, 0, 1, JSONSchemaConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJSONSchemaConstraints_Minimum(), theTypesPackage.getReal(), "minimum", null, 0, 1, JSONSchemaConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(apiDataTypeEClass, APIDataType.class, "APIDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPIDataType_Type(), this.getJSONDataType(), "type", null, 1, 1, APIDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIDataType_Format(), theTypesPackage.getString(), "format", null, 1, 1, APIDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAPIDataType_Base_PrimitiveType(), theUMLPackage.getPrimitiveType(), null, "base_PrimitiveType", null, 0, 1, APIDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAPIDataType_Base_Enumeration(), theUMLPackage.getEnumeration(), null, "base_Enumeration", null, 0, 1, APIDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(apiOperationEClass, APIOperation.class, "APIOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPIOperation_RelativePath(), theTypesPackage.getString(), "relativePath", null, 0, 1, APIOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIOperation_Method(), this.getHTTPMethod(), "method", null, 0, 1, APIOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIOperation_Produces(), theTypesPackage.getString(), "produces", null, 0, -1, APIOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIOperation_Consumes(), theTypesPackage.getString(), "consumes", null, 0, -1, APIOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIOperation_Schemes(), this.getSchemeType(), "schemes", null, 0, -1, APIOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIOperation_Summary(), theTypesPackage.getString(), "summary", null, 0, 1, APIOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIOperation_Description(), theTypesPackage.getString(), "description", null, 0, 1, APIOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAPIOperation_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 0, 1, APIOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIOperation_Tags(), theTypesPackage.getString(), "tags", null, 0, -1, APIOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(apiParameterEClass, APIParameter.class, "APIParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPIParameter_Description(), theTypesPackage.getString(), "description", null, 0, 1, APIParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIParameter_Location(), this.getParameterLocation(), "location", null, 0, 1, APIParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIParameter_AllowEmptyValues(), theTypesPackage.getBoolean(), "allowEmptyValues", null, 0, 1, APIParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIParameter_CollectionFormat(), this.getCollectionFormat(), "collectionFormat", null, 0, 1, APIParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAPIParameter_Base_Parameter(), theUMLPackage.getParameter(), null, "base_Parameter", null, 0, 1, APIParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAPIParameter_Constraints(), this.getJSONSchemaConstraints(), null, "constraints", null, 0, 1, APIParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(apiResponseEClass, APIResponse.class, "APIResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPIResponse_Description(), theTypesPackage.getString(), "description", null, 0, 1, APIResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIResponse_Code(), theTypesPackage.getString(), "code", null, 0, 1, APIResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAPIResponse_Headers(), this.getHeader(), null, "headers", null, 0, -1, APIResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAPIResponse_Examples(), this.getExample(), null, "examples", null, 1, 1, APIResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAPIResponse_Base_Parameter(), theUMLPackage.getParameter(), null, "base_Parameter", null, 0, 1, APIResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeader_Name(), theTypesPackage.getString(), "name", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHeader_Description(), theTypesPackage.getString(), "description", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHeader_Type(), this.getJSONDataType(), "type", null, 1, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHeader_Format(), theTypesPackage.getString(), "format", null, 1, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHeader_Array(), theTypesPackage.getBoolean(), "array", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHeader_CollectionFormat(), this.getCollectionFormat(), "collectionFormat", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHeader_Constraints(), this.getJSONSchemaConstraints(), null, "constraints", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(exampleEClass, Example.class, "Example", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExample_MimeType(), theTypesPackage.getString(), "mimeType", null, 0, 1, Example.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExample_Value(), theTypesPackage.getString(), "value", null, 0, 1, Example.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(apiInfoEClass, APIInfo.class, "APIInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPIInfo_Title(), theTypesPackage.getString(), "title", null, 0, 1, APIInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIInfo_Description(), theTypesPackage.getString(), "description", null, 0, 1, APIInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIInfo_TermsOfService(), theTypesPackage.getString(), "termsOfService", null, 0, 1, APIInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIInfo_Version(), theTypesPackage.getString(), "version", null, 0, 1, APIInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIInfo_LicenseName(), theTypesPackage.getString(), "licenseName", null, 0, 1, APIInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIInfo_LicenseURL(), theTypesPackage.getString(), "licenseURL", null, 0, 1, APIInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIInfo_ContactName(), theTypesPackage.getString(), "contactName", null, 0, 1, APIInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIInfo_ContactURL(), theTypesPackage.getString(), "contactURL", null, 0, 1, APIInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPIInfo_ContactEmail(), theTypesPackage.getString(), "contactEmail", null, 0, 1, APIInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAPIInfo_Base_Model(), theUMLPackage.getModel(), null, "base_Model", null, 0, 1, APIInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(externalDocsEClass, ExternalDocs.class, "ExternalDocs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalDocs_Description(), theTypesPackage.getString(), "description", null, 0, 1, ExternalDocs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExternalDocs_Url(), theTypesPackage.getString(), "url", null, 0, 1, ExternalDocs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExternalDocs_Base_Model(), theUMLPackage.getModel(), null, "base_Model", null, 0, 1, ExternalDocs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExternalDocs_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, ExternalDocs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExternalDocs_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 0, 1, ExternalDocs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(securitySchemeEClass, SecurityScheme.class, "SecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityScheme_Name(), theTypesPackage.getString(), "name", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSecurityScheme_Type(), this.getSecuritySchemeType(), "type", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSecurityScheme_Description(), theTypesPackage.getString(), "description", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSecurityScheme_Location(), this.getAPIKeyLocation(), "location", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSecurityScheme_Flow(), this.getOAuth2FlowType(), "flow", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSecurityScheme_AuthorizationURL(), theTypesPackage.getString(), "authorizationURL", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSecurityScheme_TokenURL(), theTypesPackage.getString(), "tokenURL", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityScheme_Scopes(), this.getSecurityScope(), null, "scopes", null, 0, -1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(securityScopeEClass, SecurityScope.class, "SecurityScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityScope_Name(), theTypesPackage.getString(), "name", null, 0, 1, SecurityScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSecurityScope_Description(), theTypesPackage.getString(), "description", null, 0, 1, SecurityScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(securityRequirementEClass, SecurityRequirement.class, "SecurityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityRequirement_Name(), theTypesPackage.getString(), "name", null, 0, 1, SecurityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSecurityRequirement_Scope(), theTypesPackage.getString(), "scope", null, 0, 1, SecurityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(securityDefinitionsEClass, SecurityDefinitions.class, "SecurityDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityDefinitions_SecuritySchemes(), this.getSecurityScheme(), null, "securitySchemes", null, 0, -1, SecurityDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityDefinitions_Base_Model(), theUMLPackage.getModel(), null, "base_Model", null, 0, 1, SecurityDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(securityRequirementsEClass, SecurityRequirements.class, "SecurityRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityRequirements_SecurityRequirements(), this.getSecurityRequirement(), null, "securityRequirements", null, 0, -1, SecurityRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityRequirements_Base_Model(), theUMLPackage.getModel(), null, "base_Model", null, 0, 1, SecurityRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityRequirements_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 0, 1, SecurityRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tagsEClass, Tags.class, "Tags", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTags_Tags(), this.getTag(), null, "tags", null, 1, -1, Tags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTags_Base_Model(), theUMLPackage.getModel(), null, "base_Model", null, 0, 1, Tags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_ExternalDocsURL(), theTypesPackage.getString(), "externalDocsURL", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTag_ExternalDocsDescription(), theTypesPackage.getString(), "externalDocsDescription", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTag_Name(), theTypesPackage.getString(), "name", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTag_Description(), theTypesPackage.getString(), "description", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(schemeTypeEEnum, SchemeType.class, "SchemeType");
		addEEnumLiteral(schemeTypeEEnum, SchemeType.UNDEFINED);
		addEEnumLiteral(schemeTypeEEnum, SchemeType.HTTP);
		addEEnumLiteral(schemeTypeEEnum, SchemeType.HTTPS);
		addEEnumLiteral(schemeTypeEEnum, SchemeType.WS);
		addEEnumLiteral(schemeTypeEEnum, SchemeType.WSS);

		initEEnum(jsonDataTypeEEnum, JSONDataType.class, "JSONDataType");
		addEEnumLiteral(jsonDataTypeEEnum, JSONDataType.UNDEFINED);
		addEEnumLiteral(jsonDataTypeEEnum, JSONDataType.BOOLEAN);
		addEEnumLiteral(jsonDataTypeEEnum, JSONDataType.INTEGER);
		addEEnumLiteral(jsonDataTypeEEnum, JSONDataType.NUMBER);
		addEEnumLiteral(jsonDataTypeEEnum, JSONDataType.STRING);
		addEEnumLiteral(jsonDataTypeEEnum, JSONDataType.FILE);

		initEEnum(httpMethodEEnum, HTTPMethod.class, "HTTPMethod");
		addEEnumLiteral(httpMethodEEnum, HTTPMethod.UNDEFINED);
		addEEnumLiteral(httpMethodEEnum, HTTPMethod.GET);
		addEEnumLiteral(httpMethodEEnum, HTTPMethod.POST);
		addEEnumLiteral(httpMethodEEnum, HTTPMethod.PUT);
		addEEnumLiteral(httpMethodEEnum, HTTPMethod.PATCH);
		addEEnumLiteral(httpMethodEEnum, HTTPMethod.OPTIONS);
		addEEnumLiteral(httpMethodEEnum, HTTPMethod.DELETE);

		initEEnum(parameterLocationEEnum, ParameterLocation.class, "ParameterLocation");
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.UNDEFINED);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.QUERY);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.HEADER);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.PATH);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.FORM_DATA);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.BODY);

		initEEnum(collectionFormatEEnum, CollectionFormat.class, "CollectionFormat");
		addEEnumLiteral(collectionFormatEEnum, CollectionFormat.UNDEFINED);
		addEEnumLiteral(collectionFormatEEnum, CollectionFormat.CSV);
		addEEnumLiteral(collectionFormatEEnum, CollectionFormat.SSV);
		addEEnumLiteral(collectionFormatEEnum, CollectionFormat.TSV);
		addEEnumLiteral(collectionFormatEEnum, CollectionFormat.PIPES);

		initEEnum(securitySchemeTypeEEnum, SecuritySchemeType.class, "SecuritySchemeType");
		addEEnumLiteral(securitySchemeTypeEEnum, SecuritySchemeType.UNDEFINED);
		addEEnumLiteral(securitySchemeTypeEEnum, SecuritySchemeType.BASIC);
		addEEnumLiteral(securitySchemeTypeEEnum, SecuritySchemeType.API_KEY);
		addEEnumLiteral(securitySchemeTypeEEnum, SecuritySchemeType.OAUTH2);

		initEEnum(apiKeyLocationEEnum, APIKeyLocation.class, "APIKeyLocation");
		addEEnumLiteral(apiKeyLocationEEnum, APIKeyLocation.UNDEFINED);
		addEEnumLiteral(apiKeyLocationEEnum, APIKeyLocation.QUERY);
		addEEnumLiteral(apiKeyLocationEEnum, APIKeyLocation.HEADER);

		initEEnum(oAuth2FlowTypeEEnum, OAuth2FlowType.class, "OAuth2FlowType");
		addEEnumLiteral(oAuth2FlowTypeEEnum, OAuth2FlowType.UNDEFINED);
		addEEnumLiteral(oAuth2FlowTypeEEnum, OAuth2FlowType.IMPLICIT);
		addEEnumLiteral(oAuth2FlowTypeEEnum, OAuth2FlowType.PASSWORD);
		addEEnumLiteral(oAuth2FlowTypeEEnum, OAuth2FlowType.APPLICATION);
		addEEnumLiteral(oAuth2FlowTypeEEnum, OAuth2FlowType.ACCESS_CODE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "originalName", "OpenAPIProfile"
		   });
	}

} //OpenapiprofilePackageImpl