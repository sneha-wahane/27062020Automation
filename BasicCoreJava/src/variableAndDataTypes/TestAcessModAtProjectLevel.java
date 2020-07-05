package variableAndDataTypes;

import functions.AccessModifires;

public class TestAcessModAtProjectLevel extends AccessModifires {

	public static void main(String[] args) {
		AccessModifires obj=new AccessModifires();
		obj.publicFunction();
		TestAcessModAtProjectLevel obj2=new TestAcessModAtProjectLevel();
		obj2.protectedFunction();
		

	}

}
