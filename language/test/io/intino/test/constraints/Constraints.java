package io.intino.test.constraints;

public class Constraints {
	public static String e1() {
		return """
				dsl Metta
				
				constraint R1:: start < end
					message = "El inicio del intervalo debe ser menor que el final"
				
				constraint R1:: start < end
					message = "El inicio del intervalo debe ser menor que el final"
				""";
	}

	public static String e2_1() {
		return """
				dsl Metta
				
				constraint R2:: kind is not empty and (kind != "external" or url is not empty)
					"Si kind = 'external', entonces debe tener una url"
				""";
	}

	public static String e2_2() {
		return """
				constraint R2:: kind != "external" or url is not empty
					"Si kind = 'external', entonces debe tener una url"
				""";
	}


	public static String e3() {
		return """
				constraint R3:: port >= 1 and port <= 65535
					"El puerto debe estar entre 1 y 65535"
				
				constraint R3:: port is not empty and port >= 1 and port <= 65535
					"El puerto debe estar entre 1 y 65535"
				""";
	}

	public static String e4() {
		return """
				constraint R4:: min > 0 and max > min
					message="El rango del ciclo debe ser válido"
				""";
	}

	public static String e5() {
		return """
				constraint R5:: url like "https://%"
					"La fuente de datos debe ser una URL segura"
				
				constraint R5:: url starts with "https://"
					"La fuente de datos debe ser una URL segura"
				""";
	}

	public static String r6() {
		return """
				constraint R6 :: label matches "^[A-Z].*"
					"El nombre del tipo debe comenzar con mayúscula"
				
				constraint R6 :: substring(label, 0, 1) >= "A" and substring(label, 0, 1) <= "Z"
					"El nombre del tipo debe comenzar con mayúscula"
				""";

	}

	public static String r7() {
		return """
				constraint R7 :: count(members) > 1
					"Un grupo no puede tener más de 20 miembros"
				""";
	}

	public static String r8() {
		return """
				constraint R8 :: count(ports) >= 1
					"Un componente debe tener al menos un puerto"
				
				constraint R8:: ports is not empty
					"Un componente debe tener al menos un puerto"
				""";
	}

	public static String r9() {
		return """
				constraint R9 :: initial in State
					"El estado inicial debe pertenecer a la máquina"
				
				constraint R9:: contains(State, initial)
					"El estado inicial debe pertenecer a la máquina"
				""";
	}

	public static String e10() {
		return """
				constraint R10:: count(all(State, s -> s.initial == true)) == 1
					"La máquina de estados debe tener exactamente un estado inicial"
				""";

	}

	public static String e11() {
		return """
				constraint R11:: self not in adjacents
					"Una región no puede ser adyacente a sí misma"
				""";
	}

	public static String e12_1() {
		return """
				constraint R12 :: count(difference(neighbors, siblings())) == 0
					"Una provincia solo puede tener como vecinos otras provincias del mismo país"
				""";
	}

	public static String e12_2() {
		return """
				constraint R12 :: count(difference(neighbors, all(components(container()), c -> c is "Province"))) == 0
					"Una provincia solo puede tener como vecinos otras provincias del mismo país"
				""";
	}

	public static String e12_3() {
		return """
				constraint R12 :: count(all(neighbors, n -> n not in all(components(container()), c -> c is "Province"))) == 0
					"Una provincia solo puede tener como vecinos otras provincias del mismo país"
				""";
	}

	public static String e13() {
		return """
				constraint R13:: input != output
					"La molecula de input no puede ser la misma que la de output"
				""";
	}

	public static String e14() {
		return """
				constraint R14 :: input in all(components(container()), c -> c is "Molecule") and output in siblings()
					"Las molecula de input y de output deben estar en este Pathway"
				
				constraint R14 :: input in all(components(container()), c -> c is "Molecule") and output in all(components(container()), c-> c is "Molecule")
					"Las moleculas de input y de output deben estar en este Pathway"
				""";
	}


	public static String e15() {
		return """
				constraint R15:: not (self is "Number") and (self is "Text" or self is "Identifier")
				
				constraint R15:: self is "Text" or self is "Identifier"
					"Length can only be applied to variables of type Text or 'Identifier'"
				""";
	}

	public static String e16() {
		return """
				constraint R16:: self not in depends
				""";
	}


	public static String e17() {
		return """
				constraint R17 :: count(all(depends, d -> d not in siblings())) == 0
				
				constraint R17:: count(all(depends, d -> d not in all(components(container()), c-> c is "Task"))) == 0
				""";
	}

	public static String e18() {
		return """
				constraint R18 :: next is empty or next in siblings()
					"La siguiente pregunta debe estar en la misma encuesta"
				""";
	}

	public static String e19() {
		return """
				constraint R19 :: count(all(Question, q -> q is "Required")) <= 10
					"Una encuesta no puede tener más de 10 preguntas obligatorias"
				""";
	}

	public static String e20() {
		return """
				constraint R20:: sum(map(Question, q -> q.points)) == 100
					"La suma de puntos del survey tiene que ser igual a 100"
				""";
	}

	public static String e21() {
		return """
				constraint R21:: heights == distinct(sort(heights))
					"Las medidas de altura de una persona tienen que ser crecientes"
				""";
	}

	public static String e22() {
		return """
				dsl Metta
				
				constraint Named:: name() is not empty
					message = "Debe tener nombre"
				""";
	}

	public static String e23() {
		return """
				dsl Metta
				
				constraint CheckUserMails:: count(all(siblings(), u -> u is "User" and u.email == email)) ==1
					message = "Ya existe un usuario con este email"
				""";
	}



}
