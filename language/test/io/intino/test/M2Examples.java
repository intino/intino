package io.intino.test;

public class M2Examples {

	public static String minimumExample() {
		return """
				dsl Metta
				// ejemplo doc
				Concept A
					// ejemplo doc2
					Concept B
				MetaConcept C
					MetaConcept Dc
						MetaConcept Dcc
							MetaConcept Dccc
					Concept E
				""";
	}

	public static String multilineExample() {
		return """
				Concept A
					def string a =\"\"\"
					hola mundo
						Quien soy?
					\"\"\"
				""";

	}

	public static String badCompositionExample() {
		return """
				dsl Metta
				Concept A
					MetaConcept B
				MetaConcept C
					MetaConcept D
					Concept E
				""";
	}


	public static String badSignatureExample() {
		return """
				dsl Metta
				Concept A FakeElement
				""";
	}

	public static String propertiesExample() {
		return """
				dsl Metta
				Concept Car
					def string name
					def integer years
					def double cost
					def instant plateDate
					def date plateDate2
					Concept Engine
				""";
	}

	public static String badPropertiesExample() {
		return """
				dsl Metta
				Concept Car
					def string name = 32
					def integer years = 43.1
					def double cost
					def instant plateDate
					def date plateDate2
					Concept Engine
				""";
	}

	public static String rulesExample() {
		return """
				dsl Metta
				Concept:{0..1} Broker
					def object:{BrokerImplementation} implementation = empty
					Concept:{0..2} CompositeDestination
						def word:{Topic Queue} type = empty
						def string[] forwardTo
				""";
	}

	public static String badReferencesExample() {
		return """
				dsl Metta
				Concept:Named Datamart
					def word:SnapshotScale scale = None
					def integer maxCount = -1
					def Snapshot last = empty
					has Entity as private
					has:Named Reel
				""";
	}


	public static String doubleNamedSize() {
		return """
				dsl Metta
				Concept:Named Datamart
					def word:SnapshotScale scale = None
					def integer maxCount = -1
					def Snapshot last = empty
					has Entity as private
					has:Named:Single:Required Reel
					Concept:Single:Required Timeline
				""";
	}

	public static String referencesExample() {
		return """
				dsl Metta
				Concept:Named Datamart
					def word:SnapshotScale scale = None
					def integer maxCount = -1
					has:Named Reel as private
				Concept Reel
				
				""";
	}

	public static String references2Example() {
		return """
				dsl Metta
				Concept:Named Datamart
					def word:SnapshotScale scale = None
					def integer maxCount = -1
					has:Named Reel.Shot as private
				Concept Reel
					Concept Shot
				""";
	}

	public static String facetsExample() {
		return """
				dsl Metta
				Concept:Named Timeline as component
					def Entity entity
					facet Raw
						def Datalake.Tank.Measurement tank
						Concept:Named Attribute
							def Sensor.Magnitude magnitude
							def Entity.Attribute from
				Concept Cooked on Timeline
					Concept TimeSeries
				""";
	}

	public static String facetsOverridenExample() {
		return """
				dsl Metta
				Concept Data as generalization component
					facet List
					facet Type
						def string type as reactive private
						def string primitive = 'self.type()' as reactive private
						def integer:{bits} size = 0 bits
						def integer:{bits} maxSize = 64 bits as private
						sub Real
							def double defaultValue = 0
							def string type = "Double" as reactive private
							def string primitive = "double" as reactive private
							def integer:{bits} size = 64 bits
							sub Double
								def double defaultValue = 0
								def string type = "Double" as reactive private
				""";
	}

	public static String methodReferencesExample() {
		return """
				dsl Metta
				Concept Stop as component
					def boolean when as reactive
					def function:Action execute = @stop as private final
				""";
	}

	public static String complexExample() {
		return """
				dsl Metta
				Concept PeriodicActivity as generalization
					def function:Execute execute as final private
				
				Concept Action extends PeriodicActivity as feature
					def function:Execute execute = 'self.action()' as final private
					def function:Action action
				
				Concept ConditionalAction extends PeriodicActivity as feature
					def function:Execute execute = 'if(self.condition()) self.action();' as final private
					def boolean condition = true as reactive
					def function:Action action
				
				Concept SystemDynamic extends PeriodicActivity as feature
					def function:Execute execute = @executeSd as final private
					def object:io.intino.tafat.engine.DifferentialEquation odeProvider as reactive
					def boolean enabled = true
					def word:{Euler} solver = Euler
					def double step = 0.1
					def integer timesPerSecond = 'return (int) (1. / self.step());' as private
					def object:io.intino.tafat.engine.DifferentialEquation differentialEquation = empty as private
					def object:org.opensourcephysics.numerics.ODESolver odeSolver = empty as private
				""";
	}

	public static String complexExample2() {
		return """
				dsl Metta
				Concept PeriodicActivity as generalization
					def function:Execute execute as final private
				
				Concept Action extends PeriodicActivity as feature
					def function:Execute execute = 'self.action()' as final private
					def function:Action action
				
				Concept ConditionalAction extends PeriodicActivity as feature
					def function:Execute execute = 'if(self.condition()) self.action();' as final private
					def boolean condition = true as reactive
					def function:Action action
				
				Concept SystemDynamic extends PeriodicActivity as feature
					def function:Execute execute = @executeSd as final private
					def object:io.intino.tafat.engine.DifferentialEquation odeProvider as reactive
					def boolean enabled = true
					def word:{Euler} solver = Euler
					def double step = 0.1
					def integer timesPerSecond = 'return (int) (1. / self.step());' as private
					def object:io.intino.tafat.engine.DifferentialEquation differentialEquation = empty as private
					def object:org.opensourcephysics.numerics.ODESolver odeSolver = empty as private
				""";
	}
}