package testing;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class TestClasses {
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	public VerifContraintes vc;
	
	@Before
	public void beforeCoding() {
		this.vc = new VerifContraintes();
	}
	
	@Test
	public void testIdPos() {
		assertTrue(vc.idPositif(1));
	}
	
	@Test
	public void testLongueurTitre() {
		assertTrue(vc.longueurTitre("bla"));
	}
	
	@Test
	public void testPrixValide() {
		assertTrue(vc.prixValide(150));
	}
	
	@Test
	public void testNbHeuresValide() {
		assertTrue(vc.nbHeuresValide(11));
	}
	
	@Test
	public void testModeSession() {
		assertTrue(vc.modeSession("présentiel"));
	}
	
	@Test
	public void testGradeFormateur() {
		assertTrue(vc.gradeFormateur("junior"));
	}
	
	@Test
	public void testVerifChaine() {
		assertTrue(vc.verifChaine("hello"));
	}
	
	@Test
	public void testVerifNum() {
		assertTrue(vc.verifNum(1));
	}
	
	


	
	

}
