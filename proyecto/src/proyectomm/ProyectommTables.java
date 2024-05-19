/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /proyecto/metamodel/proyectomm.ecore
 * using:
 *   /proyecto/metamodel/proyectomm.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package proyectomm;

import java.lang.String;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import proyectomm.ProyectommPackage;
// import proyectomm.ProyectommTables;

/**
 * ProyectommTables provides the dispatch tables for the proyectomm for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ProyectommTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ProyectommPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_proyectomm = IdManager.getNsURIPackageId("http://www.example.org/proyectomm", null, ProyectommPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Actor = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("Actor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Atributo = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("Atributo", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BD = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("BD", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BaseDeDatos = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("BaseDeDatos", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Borrado = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("Borrado", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = ProyectommTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Envio = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("Envio", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Fin = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("Fin", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ForeignKey = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("ForeignKey", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Inicio = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("Inicio", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Intermedia = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("Intermedia", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Lectura = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("Lectura", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Mensaje = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("Mensaje", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OclElement = ProyectommTables.PACKid_$metamodel$.getClassId("OclElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Opcion = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("Opcion", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PrimaryKey = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("PrimaryKey", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProcesoDeNegocio = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("ProcesoDeNegocio", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Recepcion = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("Recepcion", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Servicio = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("Servicio", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Tabla = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("Tabla", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Tarea = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("Tarea", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Usuario = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getClassId("Usuario", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = ProyectommTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EAtributo = ProyectommTables.PACKid_http_c_s_s_www_example_org_s_proyectomm.getEnumerationId("EAtributo");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId SET_PRIMid_String = TypeId.SET.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ String STR__32 = " ";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_BD = TypeId.BAG.getSpecializedId(ProyectommTables.CLSSid_BD);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ForeignKey = TypeId.BAG.getSpecializedId(ProyectommTables.CLSSid_ForeignKey);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Lectura = TypeId.BAG.getSpecializedId(ProyectommTables.CLSSid_Lectura);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Mensaje = TypeId.BAG.getSpecializedId(ProyectommTables.CLSSid_Mensaje);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Servicio = TypeId.BAG.getSpecializedId(ProyectommTables.CLSSid_Servicio);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Usuario = TypeId.BAG.getSpecializedId(ProyectommTables.CLSSid_Usuario);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_BOOLEAN = ProyectommTables.ENUMid_EAtributo.getEnumerationLiteralId("BOOLEAN");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_LIST = ProyectommTables.ENUMid_EAtributo.getEnumerationLiteralId("LIST");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Actor = TypeId.ORDERED_SET.getSpecializedId(ProyectommTables.CLSSid_Actor);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Atributo = TypeId.ORDERED_SET.getSpecializedId(ProyectommTables.CLSSid_Atributo);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_BaseDeDatos = TypeId.ORDERED_SET.getSpecializedId(ProyectommTables.CLSSid_BaseDeDatos);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Opcion = TypeId.ORDERED_SET.getSpecializedId(ProyectommTables.CLSSid_Opcion);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Tabla = TypeId.ORDERED_SET.getSpecializedId(ProyectommTables.CLSSid_Tabla);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Tarea = TypeId.ORDERED_SET.getSpecializedId(ProyectommTables.CLSSid_Tarea);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Fin = TypeId.SET.getSpecializedId(ProyectommTables.CLSSid_Fin);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Inicio = TypeId.SET.getSpecializedId(ProyectommTables.CLSSid_Inicio);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Intermedia = TypeId.SET.getSpecializedId(ProyectommTables.CLSSid_Intermedia);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Tabla = TypeId.SET.getSpecializedId(ProyectommTables.CLSSid_Tabla);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Tarea = TypeId.SET.getSpecializedId(ProyectommTables.CLSSid_Tarea);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ProyectommTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ProyectommTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Actor = new EcoreExecutorType(ProyectommPackage.Literals.ACTOR, PACKAGE, 0);
		public static final EcoreExecutorType _Atributo = new EcoreExecutorType(ProyectommPackage.Literals.ATRIBUTO, PACKAGE, 0);
		public static final EcoreExecutorType _BD = new EcoreExecutorType(ProyectommPackage.Literals.BD, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _BaseDeDatos = new EcoreExecutorType(ProyectommPackage.Literals.BASE_DE_DATOS, PACKAGE, 0);
		public static final EcoreExecutorType _Borrado = new EcoreExecutorType(ProyectommPackage.Literals.BORRADO, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EAtributo = new EcoreExecutorEnumeration(ProyectommPackage.Literals.EATRIBUTO, PACKAGE, 0);
		public static final EcoreExecutorType _Envio = new EcoreExecutorType(ProyectommPackage.Literals.ENVIO, PACKAGE, 0);
		public static final EcoreExecutorType _Fin = new EcoreExecutorType(ProyectommPackage.Literals.FIN, PACKAGE, 0);
		public static final EcoreExecutorType _ForeignKey = new EcoreExecutorType(ProyectommPackage.Literals.FOREIGN_KEY, PACKAGE, 0);
		public static final EcoreExecutorType _Inicio = new EcoreExecutorType(ProyectommPackage.Literals.INICIO, PACKAGE, 0);
		public static final EcoreExecutorType _Intermedia = new EcoreExecutorType(ProyectommPackage.Literals.INTERMEDIA, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Lectura = new EcoreExecutorType(ProyectommPackage.Literals.LECTURA, PACKAGE, 0);
		public static final EcoreExecutorType _Mensaje = new EcoreExecutorType(ProyectommPackage.Literals.MENSAJE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Opcion = new EcoreExecutorType(ProyectommPackage.Literals.OPCION, PACKAGE, 0);
		public static final EcoreExecutorType _PrimaryKey = new EcoreExecutorType(ProyectommPackage.Literals.PRIMARY_KEY, PACKAGE, 0);
		public static final EcoreExecutorType _ProcesoDeNegocio = new EcoreExecutorType(ProyectommPackage.Literals.PROCESO_DE_NEGOCIO, PACKAGE, 0);
		public static final EcoreExecutorType _Recepcion = new EcoreExecutorType(ProyectommPackage.Literals.RECEPCION, PACKAGE, 0);
		public static final EcoreExecutorType _Servicio = new EcoreExecutorType(ProyectommPackage.Literals.SERVICIO, PACKAGE, 0);
		public static final EcoreExecutorType _Tabla = new EcoreExecutorType(ProyectommPackage.Literals.TABLA, PACKAGE, 0);
		public static final EcoreExecutorType _Tarea = new EcoreExecutorType(ProyectommPackage.Literals.TAREA, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Usuario = new EcoreExecutorType(ProyectommPackage.Literals.USUARIO, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Actor,
			_Atributo,
			_BD,
			_BaseDeDatos,
			_Borrado,
			_EAtributo,
			_Envio,
			_Fin,
			_ForeignKey,
			_Inicio,
			_Intermedia,
			_Lectura,
			_Mensaje,
			_Opcion,
			_PrimaryKey,
			_ProcesoDeNegocio,
			_Recepcion,
			_Servicio,
			_Tabla,
			_Tarea,
			_Usuario
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ProyectommTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Actor__Actor = new ExecutorFragment(Types._Actor, ProyectommTables.Types._Actor);
		private static final ExecutorFragment _Actor__OclAny = new ExecutorFragment(Types._Actor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Actor__OclElement = new ExecutorFragment(Types._Actor, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Atributo__Atributo = new ExecutorFragment(Types._Atributo, ProyectommTables.Types._Atributo);
		private static final ExecutorFragment _Atributo__OclAny = new ExecutorFragment(Types._Atributo, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Atributo__OclElement = new ExecutorFragment(Types._Atributo, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BD__BD = new ExecutorFragment(Types._BD, ProyectommTables.Types._BD);
		private static final ExecutorFragment _BD__Intermedia = new ExecutorFragment(Types._BD, ProyectommTables.Types._Intermedia);
		private static final ExecutorFragment _BD__OclAny = new ExecutorFragment(Types._BD, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BD__OclElement = new ExecutorFragment(Types._BD, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BD__Tarea = new ExecutorFragment(Types._BD, ProyectommTables.Types._Tarea);

		private static final ExecutorFragment _BaseDeDatos__BaseDeDatos = new ExecutorFragment(Types._BaseDeDatos, ProyectommTables.Types._BaseDeDatos);
		private static final ExecutorFragment _BaseDeDatos__OclAny = new ExecutorFragment(Types._BaseDeDatos, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BaseDeDatos__OclElement = new ExecutorFragment(Types._BaseDeDatos, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Borrado__BD = new ExecutorFragment(Types._Borrado, ProyectommTables.Types._BD);
		private static final ExecutorFragment _Borrado__Borrado = new ExecutorFragment(Types._Borrado, ProyectommTables.Types._Borrado);
		private static final ExecutorFragment _Borrado__Intermedia = new ExecutorFragment(Types._Borrado, ProyectommTables.Types._Intermedia);
		private static final ExecutorFragment _Borrado__OclAny = new ExecutorFragment(Types._Borrado, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Borrado__OclElement = new ExecutorFragment(Types._Borrado, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Borrado__Tarea = new ExecutorFragment(Types._Borrado, ProyectommTables.Types._Tarea);

		private static final ExecutorFragment _EAtributo__EAtributo = new ExecutorFragment(Types._EAtributo, ProyectommTables.Types._EAtributo);
		private static final ExecutorFragment _EAtributo__OclAny = new ExecutorFragment(Types._EAtributo, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EAtributo__OclElement = new ExecutorFragment(Types._EAtributo, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EAtributo__OclEnumeration = new ExecutorFragment(Types._EAtributo, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EAtributo__OclType = new ExecutorFragment(Types._EAtributo, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Envio__Envio = new ExecutorFragment(Types._Envio, ProyectommTables.Types._Envio);
		private static final ExecutorFragment _Envio__Intermedia = new ExecutorFragment(Types._Envio, ProyectommTables.Types._Intermedia);
		private static final ExecutorFragment _Envio__Mensaje = new ExecutorFragment(Types._Envio, ProyectommTables.Types._Mensaje);
		private static final ExecutorFragment _Envio__OclAny = new ExecutorFragment(Types._Envio, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Envio__OclElement = new ExecutorFragment(Types._Envio, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Envio__Tarea = new ExecutorFragment(Types._Envio, ProyectommTables.Types._Tarea);

		private static final ExecutorFragment _Fin__Fin = new ExecutorFragment(Types._Fin, ProyectommTables.Types._Fin);
		private static final ExecutorFragment _Fin__OclAny = new ExecutorFragment(Types._Fin, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Fin__OclElement = new ExecutorFragment(Types._Fin, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Fin__Tarea = new ExecutorFragment(Types._Fin, ProyectommTables.Types._Tarea);

		private static final ExecutorFragment _ForeignKey__Atributo = new ExecutorFragment(Types._ForeignKey, ProyectommTables.Types._Atributo);
		private static final ExecutorFragment _ForeignKey__ForeignKey = new ExecutorFragment(Types._ForeignKey, ProyectommTables.Types._ForeignKey);
		private static final ExecutorFragment _ForeignKey__OclAny = new ExecutorFragment(Types._ForeignKey, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ForeignKey__OclElement = new ExecutorFragment(Types._ForeignKey, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Inicio__Inicio = new ExecutorFragment(Types._Inicio, ProyectommTables.Types._Inicio);
		private static final ExecutorFragment _Inicio__OclAny = new ExecutorFragment(Types._Inicio, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Inicio__OclElement = new ExecutorFragment(Types._Inicio, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Inicio__Tarea = new ExecutorFragment(Types._Inicio, ProyectommTables.Types._Tarea);

		private static final ExecutorFragment _Intermedia__Intermedia = new ExecutorFragment(Types._Intermedia, ProyectommTables.Types._Intermedia);
		private static final ExecutorFragment _Intermedia__OclAny = new ExecutorFragment(Types._Intermedia, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Intermedia__OclElement = new ExecutorFragment(Types._Intermedia, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Intermedia__Tarea = new ExecutorFragment(Types._Intermedia, ProyectommTables.Types._Tarea);

		private static final ExecutorFragment _Lectura__BD = new ExecutorFragment(Types._Lectura, ProyectommTables.Types._BD);
		private static final ExecutorFragment _Lectura__Intermedia = new ExecutorFragment(Types._Lectura, ProyectommTables.Types._Intermedia);
		private static final ExecutorFragment _Lectura__Lectura = new ExecutorFragment(Types._Lectura, ProyectommTables.Types._Lectura);
		private static final ExecutorFragment _Lectura__OclAny = new ExecutorFragment(Types._Lectura, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Lectura__OclElement = new ExecutorFragment(Types._Lectura, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Lectura__Tarea = new ExecutorFragment(Types._Lectura, ProyectommTables.Types._Tarea);

		private static final ExecutorFragment _Mensaje__Intermedia = new ExecutorFragment(Types._Mensaje, ProyectommTables.Types._Intermedia);
		private static final ExecutorFragment _Mensaje__Mensaje = new ExecutorFragment(Types._Mensaje, ProyectommTables.Types._Mensaje);
		private static final ExecutorFragment _Mensaje__OclAny = new ExecutorFragment(Types._Mensaje, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Mensaje__OclElement = new ExecutorFragment(Types._Mensaje, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Mensaje__Tarea = new ExecutorFragment(Types._Mensaje, ProyectommTables.Types._Tarea);

		private static final ExecutorFragment _Opcion__OclAny = new ExecutorFragment(Types._Opcion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Opcion__OclElement = new ExecutorFragment(Types._Opcion, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Opcion__Opcion = new ExecutorFragment(Types._Opcion, ProyectommTables.Types._Opcion);

		private static final ExecutorFragment _PrimaryKey__Atributo = new ExecutorFragment(Types._PrimaryKey, ProyectommTables.Types._Atributo);
		private static final ExecutorFragment _PrimaryKey__OclAny = new ExecutorFragment(Types._PrimaryKey, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PrimaryKey__OclElement = new ExecutorFragment(Types._PrimaryKey, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PrimaryKey__PrimaryKey = new ExecutorFragment(Types._PrimaryKey, ProyectommTables.Types._PrimaryKey);

		private static final ExecutorFragment _ProcesoDeNegocio__OclAny = new ExecutorFragment(Types._ProcesoDeNegocio, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProcesoDeNegocio__OclElement = new ExecutorFragment(Types._ProcesoDeNegocio, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProcesoDeNegocio__ProcesoDeNegocio = new ExecutorFragment(Types._ProcesoDeNegocio, ProyectommTables.Types._ProcesoDeNegocio);

		private static final ExecutorFragment _Recepcion__Intermedia = new ExecutorFragment(Types._Recepcion, ProyectommTables.Types._Intermedia);
		private static final ExecutorFragment _Recepcion__Mensaje = new ExecutorFragment(Types._Recepcion, ProyectommTables.Types._Mensaje);
		private static final ExecutorFragment _Recepcion__OclAny = new ExecutorFragment(Types._Recepcion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Recepcion__OclElement = new ExecutorFragment(Types._Recepcion, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Recepcion__Recepcion = new ExecutorFragment(Types._Recepcion, ProyectommTables.Types._Recepcion);
		private static final ExecutorFragment _Recepcion__Tarea = new ExecutorFragment(Types._Recepcion, ProyectommTables.Types._Tarea);

		private static final ExecutorFragment _Servicio__Intermedia = new ExecutorFragment(Types._Servicio, ProyectommTables.Types._Intermedia);
		private static final ExecutorFragment _Servicio__OclAny = new ExecutorFragment(Types._Servicio, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Servicio__OclElement = new ExecutorFragment(Types._Servicio, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Servicio__Servicio = new ExecutorFragment(Types._Servicio, ProyectommTables.Types._Servicio);
		private static final ExecutorFragment _Servicio__Tarea = new ExecutorFragment(Types._Servicio, ProyectommTables.Types._Tarea);

		private static final ExecutorFragment _Tabla__OclAny = new ExecutorFragment(Types._Tabla, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Tabla__OclElement = new ExecutorFragment(Types._Tabla, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Tabla__Tabla = new ExecutorFragment(Types._Tabla, ProyectommTables.Types._Tabla);

		private static final ExecutorFragment _Tarea__OclAny = new ExecutorFragment(Types._Tarea, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Tarea__OclElement = new ExecutorFragment(Types._Tarea, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Tarea__Tarea = new ExecutorFragment(Types._Tarea, ProyectommTables.Types._Tarea);

		private static final ExecutorFragment _Usuario__Intermedia = new ExecutorFragment(Types._Usuario, ProyectommTables.Types._Intermedia);
		private static final ExecutorFragment _Usuario__OclAny = new ExecutorFragment(Types._Usuario, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Usuario__OclElement = new ExecutorFragment(Types._Usuario, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Usuario__Tarea = new ExecutorFragment(Types._Usuario, ProyectommTables.Types._Tarea);
		private static final ExecutorFragment _Usuario__Usuario = new ExecutorFragment(Types._Usuario, ProyectommTables.Types._Usuario);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ProyectommTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ProyectommTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ProyectommTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Actor__nombre = new EcoreExecutorProperty(ProyectommPackage.Literals.ACTOR__NOMBRE, Types._Actor, 0);
		public static final ExecutorProperty _Actor__num_tareas = new EcoreExecutorProperty(ProyectommPackage.Literals.ACTOR__NUM_TAREAS, Types._Actor, 1);
		public static final ExecutorProperty _Actor__tareas = new EcoreExecutorProperty(ProyectommPackage.Literals.ACTOR__TAREAS, Types._Actor, 2);
		public static final ExecutorProperty _Actor__ProcesoDeNegocio__actores = new ExecutorPropertyWithImplementation("ProcesoDeNegocio", Types._Actor, 3, new EcoreLibraryOppositeProperty(ProyectommPackage.Literals.PROCESO_DE_NEGOCIO__ACTORES));

		public static final ExecutorProperty _Atributo__nombre = new EcoreExecutorProperty(ProyectommPackage.Literals.ATRIBUTO__NOMBRE, Types._Atributo, 0);
		public static final ExecutorProperty _Atributo__opciones = new EcoreExecutorProperty(ProyectommPackage.Literals.ATRIBUTO__OPCIONES, Types._Atributo, 1);
		public static final ExecutorProperty _Atributo__tipo = new EcoreExecutorProperty(ProyectommPackage.Literals.ATRIBUTO__TIPO, Types._Atributo, 2);
		public static final ExecutorProperty _Atributo__BD__atributo_seleccionado = new ExecutorPropertyWithImplementation("BD", Types._Atributo, 3, new EcoreLibraryOppositeProperty(ProyectommPackage.Literals.BD__ATRIBUTO_SELECCIONADO));
		public static final ExecutorProperty _Atributo__Tabla__atributos = new ExecutorPropertyWithImplementation("Tabla", Types._Atributo, 4, new EcoreLibraryOppositeProperty(ProyectommPackage.Literals.TABLA__ATRIBUTOS));

		public static final ExecutorProperty _BD__atributo_seleccionado = new EcoreExecutorProperty(ProyectommPackage.Literals.BD__ATRIBUTO_SELECCIONADO, Types._BD, 0);

		public static final ExecutorProperty _BaseDeDatos__nombre = new EcoreExecutorProperty(ProyectommPackage.Literals.BASE_DE_DATOS__NOMBRE, Types._BaseDeDatos, 0);
		public static final ExecutorProperty _BaseDeDatos__tablas = new EcoreExecutorProperty(ProyectommPackage.Literals.BASE_DE_DATOS__TABLAS, Types._BaseDeDatos, 1);
		public static final ExecutorProperty _BaseDeDatos__ProcesoDeNegocio__bases_de_datos = new ExecutorPropertyWithImplementation("ProcesoDeNegocio", Types._BaseDeDatos, 2, new EcoreLibraryOppositeProperty(ProyectommPackage.Literals.PROCESO_DE_NEGOCIO__BASES_DE_DATOS));

		public static final ExecutorProperty _ForeignKey__referencia_a = new EcoreExecutorProperty(ProyectommPackage.Literals.FOREIGN_KEY__REFERENCIA_A, Types._ForeignKey, 0);

		public static final ExecutorProperty _Intermedia__descripcion = new EcoreExecutorProperty(ProyectommPackage.Literals.INTERMEDIA__DESCRIPCION, Types._Intermedia, 0);
		public static final ExecutorProperty _Intermedia__id = new EcoreExecutorProperty(ProyectommPackage.Literals.INTERMEDIA__ID, Types._Intermedia, 1);

		public static final ExecutorProperty _Lectura__datos_a_leer = new EcoreExecutorProperty(ProyectommPackage.Literals.LECTURA__DATOS_ALEER, Types._Lectura, 0);

		public static final ExecutorProperty _Mensaje__tabla_accedida_por_mensaje = new EcoreExecutorProperty(ProyectommPackage.Literals.MENSAJE__TABLA_ACCEDIDA_POR_MENSAJE, Types._Mensaje, 0);

		public static final ExecutorProperty _Opcion__nombre = new EcoreExecutorProperty(ProyectommPackage.Literals.OPCION__NOMBRE, Types._Opcion, 0);
		public static final ExecutorProperty _Opcion__Atributo__opciones = new ExecutorPropertyWithImplementation("Atributo", Types._Opcion, 1, new EcoreLibraryOppositeProperty(ProyectommPackage.Literals.ATRIBUTO__OPCIONES));

		public static final ExecutorProperty _PrimaryKey__ForeignKey__referencia_a = new ExecutorPropertyWithImplementation("ForeignKey", Types._PrimaryKey, 0, new EcoreLibraryOppositeProperty(ProyectommPackage.Literals.FOREIGN_KEY__REFERENCIA_A));

		public static final ExecutorProperty _ProcesoDeNegocio__actores = new EcoreExecutorProperty(ProyectommPackage.Literals.PROCESO_DE_NEGOCIO__ACTORES, Types._ProcesoDeNegocio, 0);
		public static final ExecutorProperty _ProcesoDeNegocio__bases_de_datos = new EcoreExecutorProperty(ProyectommPackage.Literals.PROCESO_DE_NEGOCIO__BASES_DE_DATOS, Types._ProcesoDeNegocio, 1);
		public static final ExecutorProperty _ProcesoDeNegocio__nombre = new EcoreExecutorProperty(ProyectommPackage.Literals.PROCESO_DE_NEGOCIO__NOMBRE, Types._ProcesoDeNegocio, 2);

		public static final ExecutorProperty _Servicio__tabla_entrada_servicio = new EcoreExecutorProperty(ProyectommPackage.Literals.SERVICIO__TABLA_ENTRADA_SERVICIO, Types._Servicio, 0);
		public static final ExecutorProperty _Servicio__tabla_salida_servicio = new EcoreExecutorProperty(ProyectommPackage.Literals.SERVICIO__TABLA_SALIDA_SERVICIO, Types._Servicio, 1);

		public static final ExecutorProperty _Tabla__atributos = new EcoreExecutorProperty(ProyectommPackage.Literals.TABLA__ATRIBUTOS, Types._Tabla, 0);
		public static final ExecutorProperty _Tabla__nombre = new EcoreExecutorProperty(ProyectommPackage.Literals.TABLA__NOMBRE, Types._Tabla, 1);
		public static final ExecutorProperty _Tabla__BaseDeDatos__tablas = new ExecutorPropertyWithImplementation("BaseDeDatos", Types._Tabla, 2, new EcoreLibraryOppositeProperty(ProyectommPackage.Literals.BASE_DE_DATOS__TABLAS));
		public static final ExecutorProperty _Tabla__Lectura__datos_a_leer = new ExecutorPropertyWithImplementation("Lectura", Types._Tabla, 3, new EcoreLibraryOppositeProperty(ProyectommPackage.Literals.LECTURA__DATOS_ALEER));
		public static final ExecutorProperty _Tabla__Mensaje__tabla_accedida_por_mensaje = new ExecutorPropertyWithImplementation("Mensaje", Types._Tabla, 4, new EcoreLibraryOppositeProperty(ProyectommPackage.Literals.MENSAJE__TABLA_ACCEDIDA_POR_MENSAJE));
		public static final ExecutorProperty _Tabla__Servicio__tabla_entrada_servicio = new ExecutorPropertyWithImplementation("Servicio", Types._Tabla, 5, new EcoreLibraryOppositeProperty(ProyectommPackage.Literals.SERVICIO__TABLA_ENTRADA_SERVICIO));
		public static final ExecutorProperty _Tabla__Servicio__tabla_salida_servicio = new ExecutorPropertyWithImplementation("Servicio", Types._Tabla, 6, new EcoreLibraryOppositeProperty(ProyectommPackage.Literals.SERVICIO__TABLA_SALIDA_SERVICIO));
		public static final ExecutorProperty _Tabla__Usuario__tabla_accedida_por_usuario = new ExecutorPropertyWithImplementation("Usuario", Types._Tabla, 7, new EcoreLibraryOppositeProperty(ProyectommPackage.Literals.USUARIO__TABLA_ACCEDIDA_POR_USUARIO));

		public static final ExecutorProperty _Tarea__nombre = new EcoreExecutorProperty(ProyectommPackage.Literals.TAREA__NOMBRE, Types._Tarea, 0);
		public static final ExecutorProperty _Tarea__predecesor = new EcoreExecutorProperty(ProyectommPackage.Literals.TAREA__PREDECESOR, Types._Tarea, 1);
		public static final ExecutorProperty _Tarea__sucesor = new EcoreExecutorProperty(ProyectommPackage.Literals.TAREA__SUCESOR, Types._Tarea, 2);
		public static final ExecutorProperty _Tarea__Actor__tareas = new ExecutorPropertyWithImplementation("Actor", Types._Tarea, 3, new EcoreLibraryOppositeProperty(ProyectommPackage.Literals.ACTOR__TAREAS));

		public static final ExecutorProperty _Usuario__tabla_accedida_por_usuario = new EcoreExecutorProperty(ProyectommPackage.Literals.USUARIO__TABLA_ACCEDIDA_POR_USUARIO, Types._Usuario, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ProyectommTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Actor =
			{
				Fragments._Actor__OclAny /* 0 */,
				Fragments._Actor__OclElement /* 1 */,
				Fragments._Actor__Actor /* 2 */
			};
		private static final int /*@NonNull*/ [] __Actor = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Atributo =
			{
				Fragments._Atributo__OclAny /* 0 */,
				Fragments._Atributo__OclElement /* 1 */,
				Fragments._Atributo__Atributo /* 2 */
			};
		private static final int /*@NonNull*/ [] __Atributo = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BD =
			{
				Fragments._BD__OclAny /* 0 */,
				Fragments._BD__OclElement /* 1 */,
				Fragments._BD__Tarea /* 2 */,
				Fragments._BD__Intermedia /* 3 */,
				Fragments._BD__BD /* 4 */
			};
		private static final int /*@NonNull*/ [] __BD = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BaseDeDatos =
			{
				Fragments._BaseDeDatos__OclAny /* 0 */,
				Fragments._BaseDeDatos__OclElement /* 1 */,
				Fragments._BaseDeDatos__BaseDeDatos /* 2 */
			};
		private static final int /*@NonNull*/ [] __BaseDeDatos = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Borrado =
			{
				Fragments._Borrado__OclAny /* 0 */,
				Fragments._Borrado__OclElement /* 1 */,
				Fragments._Borrado__Tarea /* 2 */,
				Fragments._Borrado__Intermedia /* 3 */,
				Fragments._Borrado__BD /* 4 */,
				Fragments._Borrado__Borrado /* 5 */
			};
		private static final int /*@NonNull*/ [] __Borrado = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EAtributo =
			{
				Fragments._EAtributo__OclAny /* 0 */,
				Fragments._EAtributo__OclElement /* 1 */,
				Fragments._EAtributo__OclType /* 2 */,
				Fragments._EAtributo__OclEnumeration /* 3 */,
				Fragments._EAtributo__EAtributo /* 4 */
			};
		private static final int /*@NonNull*/ [] __EAtributo = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Envio =
			{
				Fragments._Envio__OclAny /* 0 */,
				Fragments._Envio__OclElement /* 1 */,
				Fragments._Envio__Tarea /* 2 */,
				Fragments._Envio__Intermedia /* 3 */,
				Fragments._Envio__Mensaje /* 4 */,
				Fragments._Envio__Envio /* 5 */
			};
		private static final int /*@NonNull*/ [] __Envio = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Fin =
			{
				Fragments._Fin__OclAny /* 0 */,
				Fragments._Fin__OclElement /* 1 */,
				Fragments._Fin__Tarea /* 2 */,
				Fragments._Fin__Fin /* 3 */
			};
		private static final int /*@NonNull*/ [] __Fin = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ForeignKey =
			{
				Fragments._ForeignKey__OclAny /* 0 */,
				Fragments._ForeignKey__OclElement /* 1 */,
				Fragments._ForeignKey__Atributo /* 2 */,
				Fragments._ForeignKey__ForeignKey /* 3 */
			};
		private static final int /*@NonNull*/ [] __ForeignKey = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Inicio =
			{
				Fragments._Inicio__OclAny /* 0 */,
				Fragments._Inicio__OclElement /* 1 */,
				Fragments._Inicio__Tarea /* 2 */,
				Fragments._Inicio__Inicio /* 3 */
			};
		private static final int /*@NonNull*/ [] __Inicio = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Intermedia =
			{
				Fragments._Intermedia__OclAny /* 0 */,
				Fragments._Intermedia__OclElement /* 1 */,
				Fragments._Intermedia__Tarea /* 2 */,
				Fragments._Intermedia__Intermedia /* 3 */
			};
		private static final int /*@NonNull*/ [] __Intermedia = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Lectura =
			{
				Fragments._Lectura__OclAny /* 0 */,
				Fragments._Lectura__OclElement /* 1 */,
				Fragments._Lectura__Tarea /* 2 */,
				Fragments._Lectura__Intermedia /* 3 */,
				Fragments._Lectura__BD /* 4 */,
				Fragments._Lectura__Lectura /* 5 */
			};
		private static final int /*@NonNull*/ [] __Lectura = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Mensaje =
			{
				Fragments._Mensaje__OclAny /* 0 */,
				Fragments._Mensaje__OclElement /* 1 */,
				Fragments._Mensaje__Tarea /* 2 */,
				Fragments._Mensaje__Intermedia /* 3 */,
				Fragments._Mensaje__Mensaje /* 4 */
			};
		private static final int /*@NonNull*/ [] __Mensaje = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Opcion =
			{
				Fragments._Opcion__OclAny /* 0 */,
				Fragments._Opcion__OclElement /* 1 */,
				Fragments._Opcion__Opcion /* 2 */
			};
		private static final int /*@NonNull*/ [] __Opcion = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PrimaryKey =
			{
				Fragments._PrimaryKey__OclAny /* 0 */,
				Fragments._PrimaryKey__OclElement /* 1 */,
				Fragments._PrimaryKey__Atributo /* 2 */,
				Fragments._PrimaryKey__PrimaryKey /* 3 */
			};
		private static final int /*@NonNull*/ [] __PrimaryKey = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProcesoDeNegocio =
			{
				Fragments._ProcesoDeNegocio__OclAny /* 0 */,
				Fragments._ProcesoDeNegocio__OclElement /* 1 */,
				Fragments._ProcesoDeNegocio__ProcesoDeNegocio /* 2 */
			};
		private static final int /*@NonNull*/ [] __ProcesoDeNegocio = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Recepcion =
			{
				Fragments._Recepcion__OclAny /* 0 */,
				Fragments._Recepcion__OclElement /* 1 */,
				Fragments._Recepcion__Tarea /* 2 */,
				Fragments._Recepcion__Intermedia /* 3 */,
				Fragments._Recepcion__Mensaje /* 4 */,
				Fragments._Recepcion__Recepcion /* 5 */
			};
		private static final int /*@NonNull*/ [] __Recepcion = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Servicio =
			{
				Fragments._Servicio__OclAny /* 0 */,
				Fragments._Servicio__OclElement /* 1 */,
				Fragments._Servicio__Tarea /* 2 */,
				Fragments._Servicio__Intermedia /* 3 */,
				Fragments._Servicio__Servicio /* 4 */
			};
		private static final int /*@NonNull*/ [] __Servicio = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Tabla =
			{
				Fragments._Tabla__OclAny /* 0 */,
				Fragments._Tabla__OclElement /* 1 */,
				Fragments._Tabla__Tabla /* 2 */
			};
		private static final int /*@NonNull*/ [] __Tabla = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Tarea =
			{
				Fragments._Tarea__OclAny /* 0 */,
				Fragments._Tarea__OclElement /* 1 */,
				Fragments._Tarea__Tarea /* 2 */
			};
		private static final int /*@NonNull*/ [] __Tarea = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Usuario =
			{
				Fragments._Usuario__OclAny /* 0 */,
				Fragments._Usuario__OclElement /* 1 */,
				Fragments._Usuario__Tarea /* 2 */,
				Fragments._Usuario__Intermedia /* 3 */,
				Fragments._Usuario__Usuario /* 4 */
			};
		private static final int /*@NonNull*/ [] __Usuario = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Actor.initFragments(_Actor, __Actor);
			Types._Atributo.initFragments(_Atributo, __Atributo);
			Types._BD.initFragments(_BD, __BD);
			Types._BaseDeDatos.initFragments(_BaseDeDatos, __BaseDeDatos);
			Types._Borrado.initFragments(_Borrado, __Borrado);
			Types._EAtributo.initFragments(_EAtributo, __EAtributo);
			Types._Envio.initFragments(_Envio, __Envio);
			Types._Fin.initFragments(_Fin, __Fin);
			Types._ForeignKey.initFragments(_ForeignKey, __ForeignKey);
			Types._Inicio.initFragments(_Inicio, __Inicio);
			Types._Intermedia.initFragments(_Intermedia, __Intermedia);
			Types._Lectura.initFragments(_Lectura, __Lectura);
			Types._Mensaje.initFragments(_Mensaje, __Mensaje);
			Types._Opcion.initFragments(_Opcion, __Opcion);
			Types._PrimaryKey.initFragments(_PrimaryKey, __PrimaryKey);
			Types._ProcesoDeNegocio.initFragments(_ProcesoDeNegocio, __ProcesoDeNegocio);
			Types._Recepcion.initFragments(_Recepcion, __Recepcion);
			Types._Servicio.initFragments(_Servicio, __Servicio);
			Types._Tabla.initFragments(_Tabla, __Tabla);
			Types._Tarea.initFragments(_Tarea, __Tarea);
			Types._Usuario.initFragments(_Usuario, __Usuario);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ProyectommTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Actor__Actor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Actor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Actor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Atributo__Atributo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Atributo__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Atributo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BD__BD = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BD__Intermedia = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BD__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BD__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BD__Tarea = {};

		private static final ExecutorOperation /*@NonNull*/ [] _BaseDeDatos__BaseDeDatos = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BaseDeDatos__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BaseDeDatos__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Borrado__Borrado = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Borrado__BD = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Borrado__Intermedia = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Borrado__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Borrado__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Borrado__Tarea = {};

		private static final ExecutorOperation /*@NonNull*/ [] _EAtributo__EAtributo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EAtributo__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EAtributo__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EAtributo__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EAtributo__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Envio__Envio = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Envio__Intermedia = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Envio__Mensaje = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Envio__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Envio__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Envio__Tarea = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Fin__Fin = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Fin__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Fin__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Fin__Tarea = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ForeignKey__ForeignKey = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ForeignKey__Atributo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ForeignKey__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ForeignKey__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Inicio__Inicio = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Inicio__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Inicio__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Inicio__Tarea = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Intermedia__Intermedia = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Intermedia__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Intermedia__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Intermedia__Tarea = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Lectura__Lectura = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Lectura__BD = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Lectura__Intermedia = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Lectura__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Lectura__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Lectura__Tarea = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Mensaje__Mensaje = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Mensaje__Intermedia = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Mensaje__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Mensaje__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Mensaje__Tarea = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Opcion__Opcion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Opcion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Opcion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PrimaryKey__PrimaryKey = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrimaryKey__Atributo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrimaryKey__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrimaryKey__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProcesoDeNegocio__ProcesoDeNegocio = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcesoDeNegocio__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcesoDeNegocio__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Recepcion__Recepcion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Recepcion__Intermedia = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Recepcion__Mensaje = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Recepcion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Recepcion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Recepcion__Tarea = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Servicio__Servicio = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Servicio__Intermedia = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Servicio__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Servicio__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Servicio__Tarea = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Tabla__Tabla = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Tabla__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Tabla__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Tarea__Tarea = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Tarea__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Tarea__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Usuario__Usuario = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Usuario__Intermedia = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Usuario__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Usuario__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Usuario__Tarea = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Actor__Actor.initOperations(_Actor__Actor);
			Fragments._Actor__OclAny.initOperations(_Actor__OclAny);
			Fragments._Actor__OclElement.initOperations(_Actor__OclElement);

			Fragments._Atributo__Atributo.initOperations(_Atributo__Atributo);
			Fragments._Atributo__OclAny.initOperations(_Atributo__OclAny);
			Fragments._Atributo__OclElement.initOperations(_Atributo__OclElement);

			Fragments._BD__BD.initOperations(_BD__BD);
			Fragments._BD__Intermedia.initOperations(_BD__Intermedia);
			Fragments._BD__OclAny.initOperations(_BD__OclAny);
			Fragments._BD__OclElement.initOperations(_BD__OclElement);
			Fragments._BD__Tarea.initOperations(_BD__Tarea);

			Fragments._BaseDeDatos__BaseDeDatos.initOperations(_BaseDeDatos__BaseDeDatos);
			Fragments._BaseDeDatos__OclAny.initOperations(_BaseDeDatos__OclAny);
			Fragments._BaseDeDatos__OclElement.initOperations(_BaseDeDatos__OclElement);

			Fragments._Borrado__BD.initOperations(_Borrado__BD);
			Fragments._Borrado__Borrado.initOperations(_Borrado__Borrado);
			Fragments._Borrado__Intermedia.initOperations(_Borrado__Intermedia);
			Fragments._Borrado__OclAny.initOperations(_Borrado__OclAny);
			Fragments._Borrado__OclElement.initOperations(_Borrado__OclElement);
			Fragments._Borrado__Tarea.initOperations(_Borrado__Tarea);

			Fragments._EAtributo__EAtributo.initOperations(_EAtributo__EAtributo);
			Fragments._EAtributo__OclAny.initOperations(_EAtributo__OclAny);
			Fragments._EAtributo__OclElement.initOperations(_EAtributo__OclElement);
			Fragments._EAtributo__OclEnumeration.initOperations(_EAtributo__OclEnumeration);
			Fragments._EAtributo__OclType.initOperations(_EAtributo__OclType);

			Fragments._Envio__Envio.initOperations(_Envio__Envio);
			Fragments._Envio__Intermedia.initOperations(_Envio__Intermedia);
			Fragments._Envio__Mensaje.initOperations(_Envio__Mensaje);
			Fragments._Envio__OclAny.initOperations(_Envio__OclAny);
			Fragments._Envio__OclElement.initOperations(_Envio__OclElement);
			Fragments._Envio__Tarea.initOperations(_Envio__Tarea);

			Fragments._Fin__Fin.initOperations(_Fin__Fin);
			Fragments._Fin__OclAny.initOperations(_Fin__OclAny);
			Fragments._Fin__OclElement.initOperations(_Fin__OclElement);
			Fragments._Fin__Tarea.initOperations(_Fin__Tarea);

			Fragments._ForeignKey__Atributo.initOperations(_ForeignKey__Atributo);
			Fragments._ForeignKey__ForeignKey.initOperations(_ForeignKey__ForeignKey);
			Fragments._ForeignKey__OclAny.initOperations(_ForeignKey__OclAny);
			Fragments._ForeignKey__OclElement.initOperations(_ForeignKey__OclElement);

			Fragments._Inicio__Inicio.initOperations(_Inicio__Inicio);
			Fragments._Inicio__OclAny.initOperations(_Inicio__OclAny);
			Fragments._Inicio__OclElement.initOperations(_Inicio__OclElement);
			Fragments._Inicio__Tarea.initOperations(_Inicio__Tarea);

			Fragments._Intermedia__Intermedia.initOperations(_Intermedia__Intermedia);
			Fragments._Intermedia__OclAny.initOperations(_Intermedia__OclAny);
			Fragments._Intermedia__OclElement.initOperations(_Intermedia__OclElement);
			Fragments._Intermedia__Tarea.initOperations(_Intermedia__Tarea);

			Fragments._Lectura__BD.initOperations(_Lectura__BD);
			Fragments._Lectura__Intermedia.initOperations(_Lectura__Intermedia);
			Fragments._Lectura__Lectura.initOperations(_Lectura__Lectura);
			Fragments._Lectura__OclAny.initOperations(_Lectura__OclAny);
			Fragments._Lectura__OclElement.initOperations(_Lectura__OclElement);
			Fragments._Lectura__Tarea.initOperations(_Lectura__Tarea);

			Fragments._Mensaje__Intermedia.initOperations(_Mensaje__Intermedia);
			Fragments._Mensaje__Mensaje.initOperations(_Mensaje__Mensaje);
			Fragments._Mensaje__OclAny.initOperations(_Mensaje__OclAny);
			Fragments._Mensaje__OclElement.initOperations(_Mensaje__OclElement);
			Fragments._Mensaje__Tarea.initOperations(_Mensaje__Tarea);

			Fragments._Opcion__OclAny.initOperations(_Opcion__OclAny);
			Fragments._Opcion__OclElement.initOperations(_Opcion__OclElement);
			Fragments._Opcion__Opcion.initOperations(_Opcion__Opcion);

			Fragments._PrimaryKey__Atributo.initOperations(_PrimaryKey__Atributo);
			Fragments._PrimaryKey__OclAny.initOperations(_PrimaryKey__OclAny);
			Fragments._PrimaryKey__OclElement.initOperations(_PrimaryKey__OclElement);
			Fragments._PrimaryKey__PrimaryKey.initOperations(_PrimaryKey__PrimaryKey);

			Fragments._ProcesoDeNegocio__OclAny.initOperations(_ProcesoDeNegocio__OclAny);
			Fragments._ProcesoDeNegocio__OclElement.initOperations(_ProcesoDeNegocio__OclElement);
			Fragments._ProcesoDeNegocio__ProcesoDeNegocio.initOperations(_ProcesoDeNegocio__ProcesoDeNegocio);

			Fragments._Recepcion__Intermedia.initOperations(_Recepcion__Intermedia);
			Fragments._Recepcion__Mensaje.initOperations(_Recepcion__Mensaje);
			Fragments._Recepcion__OclAny.initOperations(_Recepcion__OclAny);
			Fragments._Recepcion__OclElement.initOperations(_Recepcion__OclElement);
			Fragments._Recepcion__Recepcion.initOperations(_Recepcion__Recepcion);
			Fragments._Recepcion__Tarea.initOperations(_Recepcion__Tarea);

			Fragments._Servicio__Intermedia.initOperations(_Servicio__Intermedia);
			Fragments._Servicio__OclAny.initOperations(_Servicio__OclAny);
			Fragments._Servicio__OclElement.initOperations(_Servicio__OclElement);
			Fragments._Servicio__Servicio.initOperations(_Servicio__Servicio);
			Fragments._Servicio__Tarea.initOperations(_Servicio__Tarea);

			Fragments._Tabla__OclAny.initOperations(_Tabla__OclAny);
			Fragments._Tabla__OclElement.initOperations(_Tabla__OclElement);
			Fragments._Tabla__Tabla.initOperations(_Tabla__Tabla);

			Fragments._Tarea__OclAny.initOperations(_Tarea__OclAny);
			Fragments._Tarea__OclElement.initOperations(_Tarea__OclElement);
			Fragments._Tarea__Tarea.initOperations(_Tarea__Tarea);

			Fragments._Usuario__Intermedia.initOperations(_Usuario__Intermedia);
			Fragments._Usuario__OclAny.initOperations(_Usuario__OclAny);
			Fragments._Usuario__OclElement.initOperations(_Usuario__OclElement);
			Fragments._Usuario__Tarea.initOperations(_Usuario__Tarea);
			Fragments._Usuario__Usuario.initOperations(_Usuario__Usuario);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ProyectommTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Actor = {
			ProyectommTables.Properties._Actor__nombre,
			ProyectommTables.Properties._Actor__num_tareas,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._Actor__tareas
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Atributo = {
			ProyectommTables.Properties._Atributo__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._Atributo__opciones,
			ProyectommTables.Properties._Atributo__tipo
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BD = {
			ProyectommTables.Properties._BD__atributo_seleccionado,
			ProyectommTables.Properties._Intermedia__descripcion,
			ProyectommTables.Properties._Intermedia__id,
			ProyectommTables.Properties._Tarea__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._Tarea__predecesor,
			ProyectommTables.Properties._Tarea__sucesor
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BaseDeDatos = {
			ProyectommTables.Properties._BaseDeDatos__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._BaseDeDatos__tablas
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Borrado = {
			ProyectommTables.Properties._BD__atributo_seleccionado,
			ProyectommTables.Properties._Intermedia__descripcion,
			ProyectommTables.Properties._Intermedia__id,
			ProyectommTables.Properties._Tarea__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._Tarea__predecesor,
			ProyectommTables.Properties._Tarea__sucesor
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EAtributo = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Envio = {
			ProyectommTables.Properties._Intermedia__descripcion,
			ProyectommTables.Properties._Intermedia__id,
			ProyectommTables.Properties._Tarea__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._Tarea__predecesor,
			ProyectommTables.Properties._Tarea__sucesor,
			ProyectommTables.Properties._Mensaje__tabla_accedida_por_mensaje
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Fin = {
			ProyectommTables.Properties._Tarea__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._Tarea__predecesor,
			ProyectommTables.Properties._Tarea__sucesor
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ForeignKey = {
			ProyectommTables.Properties._Atributo__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._Atributo__opciones,
			ProyectommTables.Properties._ForeignKey__referencia_a,
			ProyectommTables.Properties._Atributo__tipo
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Inicio = {
			ProyectommTables.Properties._Tarea__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._Tarea__predecesor,
			ProyectommTables.Properties._Tarea__sucesor
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Intermedia = {
			ProyectommTables.Properties._Intermedia__descripcion,
			ProyectommTables.Properties._Intermedia__id,
			ProyectommTables.Properties._Tarea__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._Tarea__predecesor,
			ProyectommTables.Properties._Tarea__sucesor
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Lectura = {
			ProyectommTables.Properties._BD__atributo_seleccionado,
			ProyectommTables.Properties._Lectura__datos_a_leer,
			ProyectommTables.Properties._Intermedia__descripcion,
			ProyectommTables.Properties._Intermedia__id,
			ProyectommTables.Properties._Tarea__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._Tarea__predecesor,
			ProyectommTables.Properties._Tarea__sucesor
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Mensaje = {
			ProyectommTables.Properties._Intermedia__descripcion,
			ProyectommTables.Properties._Intermedia__id,
			ProyectommTables.Properties._Tarea__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._Tarea__predecesor,
			ProyectommTables.Properties._Tarea__sucesor,
			ProyectommTables.Properties._Mensaje__tabla_accedida_por_mensaje
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Opcion = {
			ProyectommTables.Properties._Opcion__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PrimaryKey = {
			ProyectommTables.Properties._Atributo__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._Atributo__opciones,
			ProyectommTables.Properties._Atributo__tipo
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProcesoDeNegocio = {
			ProyectommTables.Properties._ProcesoDeNegocio__actores,
			ProyectommTables.Properties._ProcesoDeNegocio__bases_de_datos,
			ProyectommTables.Properties._ProcesoDeNegocio__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Recepcion = {
			ProyectommTables.Properties._Intermedia__descripcion,
			ProyectommTables.Properties._Intermedia__id,
			ProyectommTables.Properties._Tarea__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._Tarea__predecesor,
			ProyectommTables.Properties._Tarea__sucesor,
			ProyectommTables.Properties._Mensaje__tabla_accedida_por_mensaje
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Servicio = {
			ProyectommTables.Properties._Intermedia__descripcion,
			ProyectommTables.Properties._Intermedia__id,
			ProyectommTables.Properties._Tarea__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._Tarea__predecesor,
			ProyectommTables.Properties._Tarea__sucesor,
			ProyectommTables.Properties._Servicio__tabla_entrada_servicio,
			ProyectommTables.Properties._Servicio__tabla_salida_servicio
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Tabla = {
			ProyectommTables.Properties._Tabla__atributos,
			ProyectommTables.Properties._Tabla__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Tarea = {
			ProyectommTables.Properties._Tarea__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._Tarea__predecesor,
			ProyectommTables.Properties._Tarea__sucesor
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Usuario = {
			ProyectommTables.Properties._Intermedia__descripcion,
			ProyectommTables.Properties._Intermedia__id,
			ProyectommTables.Properties._Tarea__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ProyectommTables.Properties._Tarea__predecesor,
			ProyectommTables.Properties._Tarea__sucesor,
			ProyectommTables.Properties._Usuario__tabla_accedida_por_usuario
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Actor__Actor.initProperties(_Actor);
			Fragments._Atributo__Atributo.initProperties(_Atributo);
			Fragments._BD__BD.initProperties(_BD);
			Fragments._BaseDeDatos__BaseDeDatos.initProperties(_BaseDeDatos);
			Fragments._Borrado__Borrado.initProperties(_Borrado);
			Fragments._EAtributo__EAtributo.initProperties(_EAtributo);
			Fragments._Envio__Envio.initProperties(_Envio);
			Fragments._Fin__Fin.initProperties(_Fin);
			Fragments._ForeignKey__ForeignKey.initProperties(_ForeignKey);
			Fragments._Inicio__Inicio.initProperties(_Inicio);
			Fragments._Intermedia__Intermedia.initProperties(_Intermedia);
			Fragments._Lectura__Lectura.initProperties(_Lectura);
			Fragments._Mensaje__Mensaje.initProperties(_Mensaje);
			Fragments._Opcion__Opcion.initProperties(_Opcion);
			Fragments._PrimaryKey__PrimaryKey.initProperties(_PrimaryKey);
			Fragments._ProcesoDeNegocio__ProcesoDeNegocio.initProperties(_ProcesoDeNegocio);
			Fragments._Recepcion__Recepcion.initProperties(_Recepcion);
			Fragments._Servicio__Servicio.initProperties(_Servicio);
			Fragments._Tabla__Tabla.initProperties(_Tabla);
			Fragments._Tarea__Tarea.initProperties(_Tarea);
			Fragments._Usuario__Usuario.initProperties(_Usuario);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ProyectommTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _EAtributo__INTEGER = new EcoreExecutorEnumerationLiteral(ProyectommPackage.Literals.EATRIBUTO.getEEnumLiteral("INTEGER"), Types._EAtributo, 0);
		public static final EcoreExecutorEnumerationLiteral _EAtributo__REAL = new EcoreExecutorEnumerationLiteral(ProyectommPackage.Literals.EATRIBUTO.getEEnumLiteral("REAL"), Types._EAtributo, 1);
		public static final EcoreExecutorEnumerationLiteral _EAtributo__TEXT = new EcoreExecutorEnumerationLiteral(ProyectommPackage.Literals.EATRIBUTO.getEEnumLiteral("TEXT"), Types._EAtributo, 2);
		public static final EcoreExecutorEnumerationLiteral _EAtributo__BOOLEAN = new EcoreExecutorEnumerationLiteral(ProyectommPackage.Literals.EATRIBUTO.getEEnumLiteral("BOOLEAN"), Types._EAtributo, 3);
		public static final EcoreExecutorEnumerationLiteral _EAtributo__LIST = new EcoreExecutorEnumerationLiteral(ProyectommPackage.Literals.EATRIBUTO.getEEnumLiteral("LIST"), Types._EAtributo, 4);
		public static final EcoreExecutorEnumerationLiteral _EAtributo__DATE = new EcoreExecutorEnumerationLiteral(ProyectommPackage.Literals.EATRIBUTO.getEEnumLiteral("DATE"), Types._EAtributo, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EAtributo = {
			_EAtributo__INTEGER,
			_EAtributo__REAL,
			_EAtributo__TEXT,
			_EAtributo__BOOLEAN,
			_EAtributo__LIST,
			_EAtributo__DATE
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._EAtributo.initLiterals(_EAtributo);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ProyectommTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new ProyectommTables();
	}

	private ProyectommTables() {
		super(ProyectommPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		ProyectommPackage.Literals.FIN,
		ProyectommPackage.Literals.INICIO,
		ProyectommPackage.Literals.INTERMEDIA
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
