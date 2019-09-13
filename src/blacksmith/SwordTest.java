package blacksmith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwordTest {
	
	Sword s1, s2, s3, s4, s5;

	// TODO Create Sword for each test case for more convenient
	@BeforeEach
	void setUp() throws Exception {
		s1 = new Sword(50, 50);
		s2 = new Sword(-30, 20);
		s3 = new Sword(40, -10);
		s4 = new Sword(-50, -20);
		s5 = new Sword(20, 40);
	}

	// TODO Test Sword constructor
	@Test
	void testSword() {
		assertEquals(50, s1.getAttack());
		assertEquals(50, s1.getDurability());
		assertEquals(20, s5.getAttack());
		assertEquals(40, s5.getDurability());
		//fail("Not yet implemented");
	}

	// TODO Test Sword constructor with negative attack
	@Test
	void testSwordNegativeAttack() {
		assertEquals(1, s2.getAttack());
		assertEquals(1, s4.getAttack());
		//fail("Not yet implemented");
	}

	// TODO Test Sword constructor with negative durability
	@Test
	void testSwordNegativeDurability() {
		assertEquals(1, s3.getDurability());
		assertEquals(1, s4.getDurability());
		//fail("Not yet implemented");
	}

	// TODO Test upgrade()
	@Test
	void testUpgrade() {
		s1.upgrade(10);
		assertEquals(60, s1.getAttack());
		assertEquals(51, s1.getDurability());
	}

	// TODO Test upgrade() with negative value
	@Test
	void testUpgradeNegative() {
		s2.upgrade(-10);
		assertEquals(1, s2.getAttack());
		assertEquals(21, s2.getDurability());
		//fail("Not yet implemented");
	}

	// TODO Test doParry()
	@Test
	void testDoParry() {
		assertEquals(0, s1.doParry(20));
		assertEquals(49, s1.getDurability());
		assertEquals(30, s5.doParry(50));
		assertEquals(39, s5.getDurability());
		//fail("Not yet implemented");
	}

	// TODO Test doParry() with non positive attack
	@Test
	void testDoParryNonPositiveAttack() {
		assertEquals(0, s1.doParry(-10));
		assertEquals(0, s5.doParry(-50));
		//fail("Not yet implemented");
	}

	// TODO Test doParry() with attack <= Sword's attack ( fully parried )
	@Test
	void testDoParryFullyParried() {
		assertEquals(0, s1.doParry(50));
		assertEquals(0, s5.doParry(s5.getAttack()));
		//fail("Not yet implemented");
	}

	// TODO Test isBroken()
	@Test
	void testIsBroken() {
		s3.doParry(10);
		s4.doParry(10);
		s4.doParry(10);
		assertTrue(s3.isBroken());
		assertTrue(s4.isBroken());
		//fail("Not yet implemented");
	}

}
