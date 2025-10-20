package io.intino.test.constraints;

public class Models {

	public static String m1() {
		return """
				Interval(start=3000, end=6000)
				""";
	}

	public static String m2_1() {
		return """
				Service(kind=internal, url=empty)
				""";
	}

	public static String m2_2() {
		return """
				Service(kind=internal, url="http://www.google.com")
				""";
	}

	public static String m2_3() {
		return """
				Service(kind=external, url=empty)
				""";
	}

	public static String m3() {
		return """
				 Server(ip = "asdaasd", port = 8080)
				""";
	}

	public static String m4() {
		return """
				Cycle(min=10, max=20)
				""";
	}

	public static String m5() {
		return """
				DataSource(url = "https://www.google.com")
				""";
	}

	public static String m6() {
		return """
				DataType(label = "Integer")
				""";

	}

	public static String m7() {
		return """
				Group(members = m1 m2, name=empty)
				Member m1
				Member m2
				""";

	}

	public static String m8() {
		return """
				Component(ports = p1 p2)
				Port(8080) p1
				Port(8081) p2
				""";
	}

	public static String m9() {
		return """
				StateMachine(initial = i1)
					State i1
					State i2
				""";
	}

	public static String m10() {
		return """
				StateMachine2
					State(initial = true) i1
					State(initial = false) i2
				""";
	}

	public static String m11() {
		return """
				Region(population=1000) r1
					adjacents = r2 r3
				Region(population=2000) r2
				Region(population=3000) r3
				""";
	}

	public static String m12() {
		return """
				Country spain
					Province Tenerife
						neighbors = LasPalmas
					Province LasPalmas
						neighbors = Tenerife
				""";

	}

	public static String m13() {
		return """
				Pathway
					Molecule HCl
					Molecule NaOH
					Molecule NaCl
					Molecule H2O
					Reaction(input=HCl NaOH, output=NaCl NaOH)
				""";
	}


	public static String m14() {
		return """
				constraint("Una provincia solo puede tener como vecinos otras provincias del mismo país") R12:
					difference(neighbors, components(container(), Province)) is empty
				
				constraint("Una provincia solo puede tener como vecinos otras provincias del mismo país") R12:
					all(neighbors, n -> n not in components(container(), Province)) is empty
				""";
	}

	public static String m15() {
		return """
				Variable x is Text
					Length(max = 20)
				""";
	}

	public static String m16() {
		return """
				Process p1
					Task(depends = t2) t1
					Task(depends = t1) t2
				""";
	}

	public static String m17() {
		return """
				Survey test
					Question("this is a question", next = q2, points = 45) q1 is Required
					Question("this is he second question", next = empty, points = 55) q2
				""";
	}

	public static String m21() {
		return """
				Person p1
					heights = 100 101 180
				""";
	}

	public static String m22() {
		return """
				User(name = "John Doe", email = "john.doe@example.com") john
				User(name = "Mary Smith", email = "mary.smith@north-lib.org") mary is Librarian
				
				""";
	}
}
